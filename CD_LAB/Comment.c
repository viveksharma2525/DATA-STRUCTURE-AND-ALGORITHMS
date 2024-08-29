//
#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function to check if the given identifier is valid
int isValidIdentifier(char *identifier) {
    // Check if the first character is a letter or underscore
    if (!isalpha(identifier[0]) && identifier[0] != '_') {
        return 0; // Invalid identifier
    }

    // Check the remaining characters
    for (int i = 1; i < strlen(identifier); i++) {
        if (!isalnum(identifier[i]) && identifier[i] != '_') {
            return 0; // Invalid identifier
        }
    }

    return 1; // Valid identifier
}

int main() {
    char identifier[50];

    // Input the identifier
    printf("Enter an identifier: ");
    scanf("%s", identifier);

    // Check if the identifier is valid and display the result
    if (isValidIdentifier(identifier)) {
        printf("%s is a valid identifier.\n", identifier);
    } else {
        printf("%s is not a valid identifier.\n", identifier);
    }

    return 0;
}