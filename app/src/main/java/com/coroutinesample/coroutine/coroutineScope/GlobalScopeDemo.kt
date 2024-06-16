package com.coroutinesample.coroutine.coroutineScope

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


 fun showGlobalScopeDemo(){

    GlobalScope.launch{
        for (index in 1..1000000){
            println("showGlobalScopeDemo: $index")
            delay(100)
        }
    }
}