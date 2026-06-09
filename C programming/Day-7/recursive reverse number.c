#include <stdio.h>

int reverseNum(int num, int reversed) {
    if (num == 0) {
        return reversed;
    }
    
    reversed = (reversed * 10) + (num % 10);
    return reverseNum(num / 10, reversed);
}

int main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    
    int result = reverseNum(num, 0);

    printf("Reversed number = %d\n", result);
    return 0;
}