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
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */
private var modifiedList = mutableListOf<Int>()
private var remain = 0

fun gradingStudents(grades: Array<Int>): Array<Int> {
    for(i in grades){
        if (i<38){
            modifiedList.add(i)
        }
        else{
            remain = i%5
            if (remain>=3){
                modifiedList.add(i+ (5-remain))
            }
            else{
                modifiedList.add(i)
            }
        }
    }

    return modifiedList.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
