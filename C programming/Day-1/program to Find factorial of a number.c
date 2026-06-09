#include <stdio.h>

int main() {
    int n;
    unsigned long long factorial = 1;

    printf("Enter a non-negative integer: ");
    scanf("%d", &n);

    
    if (n < 0) {
        printf("Error: Factorial of a negative number does not exist.\n");
    } 
    else {
    
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        printf("Factorial of %d = %llu\n", n, factorial);
    }

    return 0;
}
