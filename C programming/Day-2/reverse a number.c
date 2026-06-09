#include <stdio.h>

int main() {
    int num, remainder, reversedNum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);

    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    printf("Reversed number = %d\n", reversedNum);
    return 0;
}
