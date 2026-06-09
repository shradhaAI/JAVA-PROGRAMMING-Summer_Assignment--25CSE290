#include <stdio.h>

int main(void) {
    int num, originalNum, remainder, reversedNum = 0;

    printf("Enter a number: ");
    if (scanf("%d", &num) != 1) {
        fprintf(stderr, "Invalid input.\n");
        return 1;
    }

    originalNum = num;

    while (num != 0) {
        remainder = num % 10;
        reversedNum = reversedNum * 10 + remainder;
        num /= 10;
    }

    if (originalNum == reversedNum) {
        printf("%d is a palindrome.\n", originalNum);
    } else {
        printf("%d is not a palindrome.\n", originalNum);
    }

    return 0;
}
