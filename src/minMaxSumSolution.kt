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

/*
QUESTION
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */




/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
var temp =0
var sumOfMin : Long = 0
var sumOfMax : Long =0
fun miniMaxSum(arr: Array<Int>): Unit {

    for (i in 0..arr.size-2){
        for (j in i+1..arr.size-1){
            if (arr[i]>arr[j]){
                temp= arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    //sumOfMin
    for (i in 0..3){
        sumOfMin += arr[i]
    }

    for (i in 1..4){
        sumOfMax += arr[i]
    }

    println("$sumOfMin $sumOfMax")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
