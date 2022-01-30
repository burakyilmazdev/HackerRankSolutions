package com.burakyilmaz.hackerrank

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.absoluteValue
import kotlin.ranges.*
import kotlin.text.*

/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1+5+9=15. The right to left diagonal = 3+5+9=17. Their absolute difference is |15-17|=2.

Function description

Complete the diagonalDifference function in the editor below.
diagonalDifference takes the following parameter:
int arr[n][m]: an array of integers
Return int: the absolute diagonal difference


 */



/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

var leftSum = 0
var rightSum = 0
var diff = 0



fun diagonalDifference(arr: Array<Array<Int>>): Int {

    //calculation for left to right diagonal
    for (i in arr.indices) {
        leftSum += arr[i][i]
    }

    //calculation for right to left diagonal
    var j = arr.size-1
    for (i in 0..(arr.size - 1)) {
        rightSum += arr[i][j]
        j--
    }

    //process to get absolute value of diff without using abs() function
    diff = leftSum - rightSum
    if (diff < 0) {
        diff *= -1
    }

    return diff
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
