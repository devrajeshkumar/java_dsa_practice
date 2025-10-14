package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

var (
	reader = bufio.NewReader(os.Stdin)
	writer = bufio.NewWriter(os.Stdout)
)

func printf(f string, a ...interface{}) { fmt.Fprintf(writer, f, a...) }
func scanf(a ...interface{})            { fmt.Fscan(reader, a...) }

func main() {
	defer writer.Flush()

	var t int
	scanf(&t)

	for ; t > 0; t-- {
		var n, k int
		scanf(&n, &k)

		a := make([]int, n)
		b := make([]int, n)

		for i := 0; i < n; i++ {
			scanf(&a[i])
		}
		for i := 0; i < n; i++ {
			scanf(&b[i])
		}

		sort.Ints(a)
		sort.Ints(b)

		i, j := 0, n-1
		for i < n && j >= 0 && k > 0 {
			if a[i] < b[j] {
				a[i] = b[j]
				i++
				j--
				k--
			} else {
				break
			}
		}

		sum := 0
		for _, val := range a {
			sum += val
		}

		printf("%d\n", sum)
	}
}
