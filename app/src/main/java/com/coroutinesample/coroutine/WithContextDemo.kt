package com.coroutinesample.coroutine

import kotlinx.coroutines.withContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

suspend fun withConTextDemo():Int{
    val result = withContext(Dispatchers.Default){
       for (index in 1..1000){
           println("withConTextDemo: ${index}")
           //delay(100)
       }
         1000
    }
    return result
}


fun sampleFunction():String{
    for (index in 1..1000){
        println("sampleFunction: ${index}")
    }
    return "Hai Bharathi..."
}

suspend fun withContextDemo2():String{
    return withContext(Dispatchers.Default){
        for(index in 1..1000){
            println("withContextDemo2 ${index}")
            delay(100)
        }
        return@withContext "PriyanKaaaaaaa"
    }
}