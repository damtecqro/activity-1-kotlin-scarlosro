package com.test.kotlinactivity1

fun <T> assert(test:T, expect:T){
    if (test == expect )
        println("Test passed")
    else
        throw Error("Resultado inesperado")
}

