package com.pferruzco.interview.algorithm

/*
The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers.
Strings of length 1 or less are not valid.
Spaces are allowed in the input, but they should be stripped before checking.
All other non-digit characters are disallowed.

Steps:
- The first step of the Luhn algorithm is to double every second digit, starting from the right.
- If doubling the number results in a number greater than 9 then subtract 9 from the product.
- Then sum all of the digits.
- If the sum is evenly divisible by 10, then the number is valid.

Example:
4539 3195 0343 6467
8569 6195 0383 3437
8+5+6+9+6+1+9+5+0+3+8+3+3+4+3+7 = 80
*/
fun validCreditCard(input: String): Boolean {
    //TODO: write your code here!
    return false
}