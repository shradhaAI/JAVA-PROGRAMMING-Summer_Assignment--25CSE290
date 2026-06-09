#include <stdio.h>

int main() {
    int binary, decimal = 0, base = 1, remainder, temp;

    printf("Enter a binary number: ");
    scanf("%d", &binary);

    temp = binary;

    while (temp > 0) {
        remainder = temp % 10;
        decimal = decimal + remainder * base;
        base = base * 2;
        temp = temp / 10;
    }

    printf("Decimal value of %d is %d\n", binary, decimal);
    return 0;
}
