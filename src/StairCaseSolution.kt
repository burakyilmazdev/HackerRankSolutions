package com.burakyilmaz.hackerrank

import kotlin.io.*
import kotlin.text.*

/*
QUESTION
Staircase detail

This is a staircase of size n=4

   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.
 */


/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

for (hash in 1..n){
    println(" ".repeat(n-hash)+ "#".repeat(hash))
}

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}
