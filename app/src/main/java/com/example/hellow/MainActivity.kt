package com.example.hellow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hellow.ui.theme.HellowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HellowTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting(name = "Android",message = "smart")
                }
            }
        }
    }
}
@Composable
fun GreetingImage(name: String,message:String) {
    val image= painterResource(id =R.drawable.photo)


    Box{
        Image(painter = image, contentDescription = null,modifier=Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Greeting(name = name, message = message)
    }

    }

@Composable
fun Greeting(name: String,message:String) {
    Column {
        Text(text = "Welcome $name",fontSize = 30.sp,
            modifier=Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top=16.dp)
        )

        Text(text = message,fontSize = 24.sp,
            modifier=Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .padding(start = 16.dp, end=16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingImagePreview() {
    HellowTheme {
        GreetingImage(name = "Mwalimu Paul", message = "Happy Birthday")
    }
}