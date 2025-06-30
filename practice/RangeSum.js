const solve = () => {
  // 5 5
  // 99 81 72 9 18
  // 0 2
  // 0 2
  // 0 2
  // 0 4
  // 3 4

  const n = 5,
    q = 5;
  const arr = [99, 81, 71, 9, 18];
  const queries = [
    [0, 2],
    [0, 2],
    [0, 2],
    [0, 4],
    [0, 4],
  ];
  const tree = new Array(4 * n).fill(0);
  const isFullReduced = new Array(4 * n).fill(0);
  buildTree(0, 0, n - 1, arr, tree, isFullReduced);
  const ans = [];
  for (let i = 0; i < q; i++) {
    let l = queries[i][0];
    let r = queries[i][1];
    const sum = querySum(0, 0, n - 1, l, r, tree);
    ans.push(sum);
    digitReduce(0, 0, n - 1, l, r, isFullReduced, tree);
  }
  console.log(ans);
};

const buildTree = (ind, l, r, arr, tree, isFullReduced) => {
  if (l === r) {
    tree[ind] = arr[l];
    isFullReduced[ind] = arr[l] <= 9 ? true : false;
    return;
  }

  const mid = l + Math.floor((r - l) / 2);

  buildTree(2 * ind + 1, l, mid, arr, tree, isFullReduced);
  buildTree(2 * ind + 2, mid + 1, r, arr, tree, isFullReduced);
  tree[ind] = tree[2 * ind + 1] + tree[2 * ind + 2];
  isFullReduced = isFullReduced[2 * ind + 1] && isFullReduced[2 * ind + 2];
};

const querySum = (ind, l, r, ql, qr, tree) => {
  if (qr < l || ql > r) return 0;
  if (ql <= l && r <= qr) return tree[ind];
  const mid = l + Math.floor((r - l) / 2);
  return (
    querySum(2 * ind + 1, l, mid, ql, qr, tree) +
    querySum(2 * ind + 2, mid + 1, r, ql, qr, tree)
  );
};

const digitReduce = (ind, l, r, ql, qr, isFullReduced, tree) => {
  if (qr < l || ql > r || isFullReduced[ind]) return;
  if (l == r) {
    tree[ind] = digitSum(tree[ind]);
    isFullReduced[ind] = tree[ind] <= 9 ? true : false;
    return;
  }
  const mid = l + Math.floor((r - l) / 2);
  digitReduce(2 * ind + 1, l, mid, ql, qr, isFullReduced, tree);
  digitReduce(2 * ind + 2, mid + 1, r, ql, qr, isFullReduced, tree);
  tree[ind] = tree[2 * ind + 1] + tree[2 * ind + 2];
  isFullReduced[ind] = isFullReduced[2 * ind + 1] && isFullReduced[2 * ind + 2];
};

const digitSum = (num) => {
  let sum = 0;
  while (num > 0) {
    sum += num % 10;
    num = Math.floor(num / 10);
  }
  return num;
};

solve();
