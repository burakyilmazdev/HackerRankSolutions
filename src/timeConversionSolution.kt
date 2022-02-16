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
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */



/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */


//07:05:15PM -> 19:05:15
//08:15:27AM -> 08:15:27
//12:01:05AM -> 00:01:05
//12:02:05PM -> 12:02:05

var converted = ""

fun timeConversion(s: String): String {

    when(s[8]){

        'P'->{
            if(s[0]== '1' && s[1]=='2' ){
                converted = s.substring(0,8)

            }else{
                var charArray =  s.substring(0,8).toCharArray()
                charArray[0] = (charArray[0].code+1).toChar()
                charArray[1] = (charArray[1].code+2).toChar()
                converted = String(charArray)
            }
        }

        'A'->{
            if (s[0]=='1'&& s[1]=='2'){
                var charArray = s.substring(0,8).toCharArray()
                charArray[0] = '0'
                charArray[1] = '0'
                converted = String(charArray)

            }else{
                converted = s.substring(0,8)
            }

        }


    }

return converted
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
