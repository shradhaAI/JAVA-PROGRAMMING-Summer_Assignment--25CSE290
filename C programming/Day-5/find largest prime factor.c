#include <stdio.h>

int main() {
    int num, i, maxPrimeFactor = -1;

    printf("Enter a number: ");
    scanf("%d", &num);
  
    while (num % 2 == 0) {
        maxPrimeFactor = 2;
        num /= 2;
    }

    for (i = 3; i * i <= num; i += 2) {
        while (num % i == 0) {
            maxPrimeFactor = i;
            num /= i;
        }
    }
    if (num > 2) {
        maxPrimeFactor = num;
    }

    printf("Largest prime factor is %d\n", maxPrimeFactor);
    return 0;
}