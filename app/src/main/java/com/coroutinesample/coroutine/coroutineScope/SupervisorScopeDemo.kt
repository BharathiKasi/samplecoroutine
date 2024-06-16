package com.coroutinesample.coroutine.coroutineScope

import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.supervisorScope
suspend fun showSupervisorScopeDemo(){
    supervisorScope{
        launch {
            for (index1 in 1..1000){
                println("launch1 ${index1}")
            }
        }

        launch {
            for (index2 in 1..1000){
                println("launch2 ${index2}")
            }
        }

        async{
            for(index3 in 1..1000){
                println("Index3 is ${index3}")
            }
        }

        async{
            for(index4 in 1..1000){
                println("Index4 is ${index4}")
            }
        }

    }

}