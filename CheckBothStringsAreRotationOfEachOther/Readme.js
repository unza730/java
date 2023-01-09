// How to check if strings are rotations of each other or not?​

// String manipulation problems are one of the most frequently asked problems in Programming job interviews and today we are going to discuss one of these problems.
// We are provided with two Strings and our task is to check whether the given Strings are rotations of each other or not. A String is said to be rotation of another String if :
// Both the Strings have equal lengths and consist of same characters.
// We can obtain the second string by rotating the first String around a certain character.
// For example, Suppose we have two strings S1 = "HELLO", and S2 = "LOHEL". 
// Both of them have equal lengths and have the same characters. 
// By rotating "HELLO" three position to the left we can obtain "LOHEL". So, these Strings are rotation of each other.


​​Approach: 
// In order to solve this problem,
// 1) we will firstly check if the Strings are of same length. 
//  2)After that we will concatenate the first string with itself, t
// 3)hen check whether the second one is present in the concatenated string or not. 
// This is because if you join a String with itself then it actually contains all rotated versions of itself. 
// 4)If the second String exists in the concatenated String, the Strings are rotations of each other. In our example, for S1="HELLO",  the concatenated String will be "HELLOHELLO". As we can see, this concatenated string contains the String "LOHEL" and thus, these Strings are rotations of each other.

Algorithm: checkRotation(s1,s2)
// 1) Check lengths of s1 and s2 and return false if they are not same.
// 2) If Strings are of equal length, store the concatenation of s1 with s1 itself in variable temp.
// 3)temp := st1+st1
// 4)Check if temp contains s2 then, return true otherwise return false.
// ​