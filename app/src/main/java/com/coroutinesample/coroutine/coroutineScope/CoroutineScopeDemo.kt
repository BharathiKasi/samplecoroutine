package com.coroutinesample.coroutine.coroutineScope

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


fun coroutineScopeDemo(){

   val scope =  CoroutineScope(Dispatchers.Default)
    scope.launch(Dispatchers.IO){
        for(index in 1..1000){
            println("coroutineScopeDemo ${index}")
        }
    }
}