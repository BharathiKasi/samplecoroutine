package com.coroutinesample.coroutine.exceptionhandling

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

fun exceptionHandlingDemo(){

   val scope =  CoroutineScope(Dispatchers.Main)
    scope.launch {
        try{
            doNetworkCall2()
            doNetworkCall1()
        }catch(e:Exception){
            Log.d("exceptionHandlingDemo", "${e}")
        }
    }
}

 fun doNetworkCall1(){
    throw Exception("Some issue happend")
}

 suspend fun doNetworkCall2(){
    for(index in 1..1000){
        println(index)
        delay(100)
    }
}