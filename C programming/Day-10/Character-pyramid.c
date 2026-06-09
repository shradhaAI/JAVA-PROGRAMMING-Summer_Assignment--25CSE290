#include <stdio.h>

int main() {
    int rows = 5;
    
    for (int i = 1; i <= rows; i++) {
        
        for (int j = 1; j <= rows - i; j++) {
            printf(" ");
        }
        char ch = 'A';
        for (int k = 1; k <= i; k++) {
            printf("%c", ch);
            ch++;
        }
        ch -= 2; 
        
        for (int m = i - 1; m >= 1; m--) {
            printf("%c", ch);
            ch--;
        }
        printf("\n");
    }
    return 0;
}
