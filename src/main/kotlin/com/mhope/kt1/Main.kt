package com.mhope.kt1

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun main(){
//    for (i in -5..5)
//        println("y = " + calculateY(3, i, -1))
    // Q4
//    for (i in 0..20){
//        if (calculateY(3,i, 5) == calculateY(4,i, 2))
//            print("x = " + i + "\ny = " + calculateY(3,i,5))
//    }

    // Q5
    // set 1
//    intersection(3,5,4,2);
//    intersection(2,1,3,3);
    intersection(-2,3,3,-2);



}

// Q5
fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    for (i in 0..100){
        if (calculateY(mOne,i, cOne) == calculateY(mTwo,i, cTwo)) {
            println("x = " + i + "\ny = " + calculateY(mOne, i, cOne))
            break
        }
        if(i == 100)
            println("Don't Intersect")
    }

}