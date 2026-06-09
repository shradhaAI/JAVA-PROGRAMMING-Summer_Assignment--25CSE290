#include <stdio.h>

int main() {
    int num, originalNum, remainder, result = 0, digits = 0, temp, i;

    printf("Enter an integer: ");
    scanf("%d", &num);

    originalNum = num;
    temp = num;

    
    while (temp != 0) {
        temp /= 10;
        digits++;
    }

    temp = num;
    
    while (temp != 0) {
        remainder = temp % 10;
        
        int power = 1;
        for (i = 0; i < digits; i++) {
            power *= remainder;
        }
        
        result += power;
        temp /= 10;
    }

    if (result == originalNum) {
        printf("%d is an Armstrong number.\n", originalNum);
    } else {
        printf("%d is not an Armstrong number.\n", originalNum);
    }

    return 0;
}
