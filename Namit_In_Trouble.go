package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
)

var reader *bufio.Reader = bufio.NewReader(os.Stdin)
var writer *bufio.Writer = bufio.NewWriter(os.Stdout)

func printf(f string, a ...interface{}) { fmt.Fprintf(writer, f, a...) }
func scanf(f string, a ...interface{})  { fmt.Fscanf(reader, f, a...) }
func createSieve(sieve []bool, n int) {
	for i := 2; i*i <= n; i++ {
		if !sieve[i] {
			for j := i * i; j <= n; j += i {
				sieve[j] = true
			}
		}
	}
}
func main() {
	defer writer.Flush()
	max := 100000
	sieve := make([]bool, max+1)
	preComute := make([]int, max+1)
	createSieve(sieve, max)
	sum := 0
	for i := 2; i <= max; i++ {

		if !sieve[i] {
			sum += 1
		}
		preComute[i] = sum
	}
	var t int
	scanf("%d\n", &t)

	for ; t > 0; t-- {
		var n, k int
		scanf("%d %d\n", &n, &k)
		a := int(math.Floor(math.Sqrt(float64(k))))
		b := int(math.Floor(math.Sqrt(float64(n))))
		printf("%d %d\n", preComute[b], preComute[b]-preComute[a])
	}
}
