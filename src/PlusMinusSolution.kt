package com.burakyilmaz.hackerrank
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*Question

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems.
The test cases are scaled to six decimal places, though answers with absolute error of up to 10^-4 are acceptable.

Example
arr = [1,1,0,-1,-1]
There are 5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000,2/5=0.40000 and 1/5=0.20000.
Results are printed as:

0.400000
0.400000
0.200000
*/



/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
var sizeOfArray: Int = 0
var numberOfPositive = 0
var numberOfNegative = 0
var numberOfZero = 0
var ratioOfPositive: Double = 0.0
var ratioOfNegative: Double = 0.0
var ratioOfZero: Double = 0.0

fun plusMinus(arr: Array<Int>): Unit {

    sizeOfArray = arr.size

    for (i in arr) {
        if (i < 0) {
            numberOfNegative++
        } else if (i == 0) {
            numberOfZero++
        } else {
            numberOfPositive++
        }
    }

    if (numberOfPositive > 0) {
        ratioOfPositive = numberOfPositive/sizeOfArray.toDouble()
    }
    if (numberOfNegative!=0) {
        ratioOfNegative = numberOfNegative/sizeOfArray.toDouble()
    }
    if (numberOfZero!=0) {
        ratioOfZero = numberOfZero/sizeOfArray.toDouble()
    }

    var roundedPositiveRatio = String.format("%.6f", ratioOfPositive)
    var roundedNegativeRatio = String.format("%.6f", ratioOfNegative)
    var roundedZeroRatio = String.format("%.6f", ratioOfZero)

    println("$roundedPositiveRatio\n $roundedNegativeRatio \n $roundedZeroRatio")

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    plusMinus(arr)
}
