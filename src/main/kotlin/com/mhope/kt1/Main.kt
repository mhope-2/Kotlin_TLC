package com.mhope.kt1

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun main(){
//    for (i in -5..5)
//        println("y = " + calculateY(3, i, -1))
    // Q4
    for (i in 0..20){
        if (calculateY(3,i, 5) == calculateY(4,i, 2))
            print("x = " + i + "\ny = " + calculateY(3,i,5))
    }

}

