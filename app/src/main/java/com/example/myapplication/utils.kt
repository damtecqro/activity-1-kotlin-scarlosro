package com.example.myapplication

fun <T> assert(test:T, expect:T){
    if (test == expect )
        println("Test passed")
    else
        throw Error("Resultado inesperado")
}
