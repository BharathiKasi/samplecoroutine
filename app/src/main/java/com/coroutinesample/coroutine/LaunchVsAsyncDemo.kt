package com.coroutinesample.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async

/**
 * Using Launch we can create a coroutine. But it will return the JOB
 */
fun launchDemo(){
    println("Before Launch starts")
    GlobalScope.launch(Dispatchers.Default){
        println("Inside the Launch")
    }
    println("After Launch starts")
}


suspend fun asycnDemo(){
    println("Before Async starts")
    val deffered = GlobalScope.async(Dispatchers.Default){
        println("Inside the Async")
        return@async 10
    }
    println("after Async starts")
    val result = deffered.await()
    println("after Async result")
    println(result)
}