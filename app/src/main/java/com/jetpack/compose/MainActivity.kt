package com.jetpack.compose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@ExperimentalUnitApi
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(id = R.drawable.happy_meal),
                            contentDescription = resources.getString(R.string.title),
                            modifier = Modifier.height(300.dp),
                            contentScale = ContentScale.Crop,
                            alignment = Alignment.TopCenter
                        )
                    }
                }

                item {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = resources.getString(R.string.title),
                            style = TextStyle(
                                fontSize = TextUnit(26F, TextUnitType.Sp)
                            )
                        )
                        Spacer(modifier = Modifier.padding(top = 8.dp))
                        Text(
                            text = resources.getString(R.string.description),
                            style = TextStyle(
                                fontSize = TextUnit(16F, TextUnitType.Sp)
                            )
                        )
                        Spacer(modifier = Modifier.padding(top = 8.dp))
                        Text(
                            text = resources.getString(R.string.price),
                            style = TextStyle(
                                fontSize = TextUnit(16f, TextUnitType.Sp),
                                color = Color(0xff85bb65)
                            )
                        )
                    }
                }
            }
        }
    }
}