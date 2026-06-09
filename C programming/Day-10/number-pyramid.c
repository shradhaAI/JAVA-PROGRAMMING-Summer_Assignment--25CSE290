#include <stdio.h>

int main() {
    int rows = 5;
    
    for (int i = 1; i <= rows; i++) {
        
        for (int j = 1; j <= rows - i; j++) {
            printf(" ");
        }
        
        for (int k = 1; k <= i; k++) {
            printf("%d", k);
        }
        
        for (int m = i - 1; m >= 1; m--) {
            printf("%d", m);
        }
        printf("\n");
    }
    return 0;
}
