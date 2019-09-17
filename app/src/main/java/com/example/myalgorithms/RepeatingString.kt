package com.example.myalgorithms

/*
https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Output Format

Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

Sample Input 0

aba
10
Sample Output 0

7
*/

private fun repeatedString(s: String, n: Long): Long {
    var asCount: Long = 0
    val mod = n.rem(s.length)
    s.forEach {
        if (it == "a".single())
            asCount++
    }
    if (mod == 0.toLong()) {
        asCount *= (n / s.length)
    } else {
        asCount *= (n / s.length)
        for (i in 0 until mod) {
            if (s[i.toInt()] == "a".single())
                asCount++
        }
    }

    return asCount
}
