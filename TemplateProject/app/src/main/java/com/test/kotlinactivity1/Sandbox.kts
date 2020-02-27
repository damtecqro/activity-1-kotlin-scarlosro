package com.test.kotlinactivity1

val a = readLine();

var index = 1
var count = 1;

while (index <= (a!!.length-1)){

    if(a[index-1].equals(a[index]) )
    {
        count++;
    }
    else
    {
        println("${a[index-1]} , $count");
        count=1;
    }

    index++;
}

    println("${a!![index-1]} , $count");

