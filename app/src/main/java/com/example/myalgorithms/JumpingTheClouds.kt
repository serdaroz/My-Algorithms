package com.example.myalgorithms

/*

https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

Emma is playing a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . She must avoid the thunderheads. Determine the minimum number of jumps it will take Emma to jump from her starting postion to the last cloud. It is always possible to win the game.

For each game, Emma will get an array of clouds numbered  if they are safe or  if they must be avoided. For example,  indexed from . The number on each cloud is its index in the list so she must avoid the clouds at indexes  and . She could follow the following two paths:  or . The first path takes  jumps while the second takes .

Function Description

Complete the jumpingOnClouds function in the editor below. It should return the minimum number of jumps required, as an integer.

jumpingOnClouds has the following parameter(s):

c: an array of binary integers
Input Format

The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

Constraints

Output Format

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Explanation 0:
Emma must avoid  and . She can win the game with a minimum of  jumps:


Sample Input 1

6
0 0 0 0 1 0
Sample Output 1

3*/

private fun jumpingOnClouds(c: Array<Int>): Int {
    var cloudCount = 0
    var x = 1
    while (x <= c.size) {
        when {
            x == c.size -> return cloudCount
            x + 2 > c.size -> {
                cloudCount += 1
                x += 2
            }
            c[x] == 0 -> {
                cloudCount += 1
                x += 2
            }
            c[x] == 1 -> {
                cloudCount += 2
                x += 1
            }
            else -> {
                cloudCount += 0
            }
        }
    }
    return cloudCount
}