const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on('line', (line) => {
  input.push(line.trim());
});

rl.on('close', () => {
  solve(input);
});

function solve(input) {
  let [n, q] = input[0].split(' ').map(Number);
  let arr = input[1].split(' ').map(Number);
  let queries = input.slice(2).map((line) => line.split(' ').map(Number));

  let tree = new Array(4 * n).fill(0);
  let reduced = new Array(4 * n).fill(false);

  build(0, 0, n - 1, tree, reduced, arr);

  let output = [];
  for (let i = 0; i < q; i++) {
    let l = queries[i][0];
    let r = queries[i][1];
    let sum = querySum(0, 0, n - 1, l, r, tree);
    output.push(sum);
    digitReduce(0, 0, n - 1, l, r, reduced, tree);
  }
  console.log(output.join(' '));
}

function build(node, l, r, tree, reduced, arr) {
  if (l === r) {
    tree[node] = arr[l];
    reduced[node] = arr[l] <= 9;
    return;
  }
  let mid = Math.floor((l + r) / 2);
  build(2 * node + 1, l, mid, tree, reduced, arr);
  build(2 * node + 2, mid + 1, r, tree, reduced, arr);
  tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
  reduced[node] = reduced[2 * node + 1] && reduced[2 * node + 2];
}

function querySum(node, l, r, ql, qr, tree) {
  if (qr < l || ql > r) return 0;
  if (ql <= l && r <= qr) return tree[node];
  let mid = Math.floor((l + r) / 2);
  return (
    querySum(2 * node + 1, l, mid, ql, qr, tree) +
    querySum(2 * node + 2, mid + 1, r, ql, qr, tree)
  );
}

function digitReduce(node, l, r, ql, qr, reduced, tree) {
  if (qr < l || ql > r || reduced[node]) return;

  if (l === r) {
    tree[node] = digitSum(tree[node]);
    reduced[node] = tree[node] <= 9;
    return;
  }

  let mid = Math.floor((l + r) / 2);
  digitReduce(2 * node + 1, l, mid, ql, qr, reduced, tree);
  digitReduce(2 * node + 2, mid + 1, r, ql, qr, reduced, tree);

  tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
  reduced[node] = reduced[2 * node + 1] && reduced[2 * node + 2];
}

function digitSum(x) {
  let sum = 0;
  while (x > 0) {
    sum += x % 10;
    x = Math.floor(x / 10);
  }
  return sum;
}
