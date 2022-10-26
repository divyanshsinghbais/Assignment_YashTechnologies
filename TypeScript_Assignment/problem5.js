// program to check if the string is palindrome or not
function checkPalindrome(string) {
    // convert string to an array
    var arrayValues = string.split('');
    // reverse the array values
    var reverseArrayValues = arrayValues.reverse();
    // convert array to string
    var reverseString = reverseArrayValues.join('');
    if (string == reverseString) {
        console.log('It is a palindrome');
    }
    else {
        console.log('It is not a palindrome');
    }
}
//take input
var string = 'abz';
checkPalindrome(string);
