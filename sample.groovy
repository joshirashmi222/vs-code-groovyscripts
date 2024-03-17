// Sample Groovy script

// Define a function to calculate factorial
def factorial(n) {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

// Calculate factorial of 5
def result = factorial(5)
println "Factorial of 5 is: $result"
println "Hello Rashmi"