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
import javax.security.auth.callback.ConfirmationCallback.YES
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
QUESTION

You are choreographing a circus show with various animals.
For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
If it is possible, return YES, otherwise return NO.
 */



/*
 * Complete the 'kangaroo' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. INTEGER x1
 *  2. INTEGER v1
 *  3. INTEGER x2
 *  4. INTEGER v2
 */

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (x1==x2 && v1==v2){ // if both of them are exactly in same motion.
        return "YES"
    }
    val locationDifference = x1-x2
    val jumpDifference = v1-v2
    val absLocation = abs(locationDifference)
    val absJump = abs(jumpDifference)

    return if (locationDifference*jumpDifference >= 0){
        "NO"
    } else{
        if (absLocation%absJump == 0 || absJump%absLocation==0){
            "YES"
        }else{
            "NO"
        }

    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
