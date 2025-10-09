package main

import (
	"bufio"
	"fmt"
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
	max := 1000005
	sieve := make([]bool, max+1)
	createSieve(sieve, max)
	var n int
	scanf("%d", &n)
	if n <= 2 {
		printf("%d\n", 1)
	} else {
		printf("%d\n", 2)
	}
	for i := 2; i <= n+1; i++ {

		if !sieve[i] {
			printf("%d ", 1)
		} else {
			printf("%d ", 2)
		}
	}
	printf("\n")
}
