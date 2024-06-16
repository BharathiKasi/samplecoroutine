package com.coroutinesample.coroutine


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.withContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun test(){

    GlobalScope.launch(Dispatchers.Main) {
        function1()
        function2()
        function3()
    }
}


fun function1(){
    for (index in 1..1000){
        println("This is non suspend function1 ")
    }
}

suspend fun function2(){
    withContext(Dispatchers.IO){
        for(index in 1..10){
            println(index)
            delay(1000)
        }
    }
}

fun function3(){
    println("This is non suspend function 3")
}
