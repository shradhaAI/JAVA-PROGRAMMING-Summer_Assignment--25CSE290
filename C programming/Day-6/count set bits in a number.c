#include <stdio.h>

int main() {
    int num, temp, count = 0;

    printf("Enter an integer: ");
    scanf("%d", &num);

    temp = num;

    while (temp > 0) {
        if (temp % 2 == 1) {
            count++;
        }
        temp /= 2;
    }

    printf("Number of set bits in %d is %d\n", num, count);
    return 0;
}