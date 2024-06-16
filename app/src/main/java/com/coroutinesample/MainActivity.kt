package com.coroutinesample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.coroutinesample.coroutine.coroutineScope.coroutineScopeDemo
import com.coroutinesample.coroutine.coroutineScope.showGlobalScopeDemo
import com.coroutinesample.coroutine.coroutineScope.showSupervisorScopeDemo
import com.coroutinesample.coroutine.exceptionhandling.exceptionHandlingDemo
import com.coroutinesample.coroutine.sampleFunction
import com.coroutinesample.coroutine.withConTextDemo
import com.coroutinesample.coroutine.withContextDemo2
import com.coroutinesample.ui.theme.CoroutinesampleTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //test()
        //launch and async demo
       /* GlobalScope.launch(Dispatchers.Default){
            //launchDemo()
            //asycnDemo()
        }*/

      /*  GlobalScope.launch(Dispatchers.Main) {
            val result1 = withConTextDemo()
            val result2 = sampleFunction()
            val result3 = withContextDemo2()
            println("result 1 is ${result1}")
            println("result 2 is ${result2}")
            println("result 3 is ${result3}")
        }*/

        //showGlobalScopeDemo()

        //coroutineScopeDemo()

       /* lifecycleScope.launch{
            showSupervisorScopeDemo()
        }*/

        exceptionHandlingDemo()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CoroutinesampleTheme {
        Greeting("Android")
    }
}


