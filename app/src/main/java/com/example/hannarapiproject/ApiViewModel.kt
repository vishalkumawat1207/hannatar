package com.example.hannarapiproject

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height


import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collection.MutableVector
import androidx.compose.runtime.collection.mutableVectorOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, heightDp = 300)
@Composable
fun CallPreview() {
    ApiListScreen()
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, heightDp = 300)
@Composable
fun ApiListScreen() {
    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {

                        Text(text = "Hannstar", fontWeight = FontWeight.Bold)
                    }
                }, modifier = Modifier.padding(1.dp),
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue
                )
            )
        }


    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn(content = {
                items(GetApiList().size) { item ->
                    ApiList(name = GetApiList()[item].Name)
                }
            })
        }

    }


}


@Composable
fun ApiList(name: String) {


    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = Modifier

            .padding(10.dp)

    ) {
        BoxWithLayout {
            Row(Modifier.weight(2.0f)) {
                Text(text = "$name", style = MaterialTheme.typography.bodySmall)
            }
        }

    }
}

@Composable
fun BoxWithLayout(content: @Composable RowScope.() -> Unit) {
    Row {
        content()
    }
}


data class Catagory(val Name: String)

fun GetApiList(): MutableVector<Catagory> {
    val list = mutableVectorOf<Catagory>()
    list.add(Catagory("Get History All"))
    list.add(Catagory("Get History Sleep"))
    list.add(Catagory("Get History Step"))
    list.add(Catagory("Get History Heart Rate"))
    list.add(Catagory("Get History Blood pressure"))
    list.add(Catagory("Get History Blood Oxygen"))
    list.add(Catagory("Get History Body Temp"))
    list.add(Catagory("Get History Breathing"))
    list.add(Catagory("Get History HRV"))
    list.add(Catagory("Send Notification"))
    list.add(Catagory("Delete History All"))
    list.add(Catagory("Delete History Step"))
    list.add(Catagory("Delete History Sleep"))
    list.add(Catagory("Delete History Heart Rate"))
    list.add(Catagory("Delete History Blood Oxygen "))
    list.add(Catagory("Delete History Body Temp "))
    list.add(Catagory("Delete History Breathing "))
    list.add(Catagory("Get Auto monitor mode"))
    list.add(Catagory("Set Temp Unit"))
    list.add(Catagory("Get Temp Unit"))
    list.add(Catagory("Set Distance Unit"))
    list.add(Catagory("Get Distance Unit "))
    list.add(Catagory("Set Weight Unit "))
    list.add(Catagory("Get Weight Unit"))
    list.add(Catagory("Set Time Unit "))
    list.add(Catagory("Get Time Unit"))
    list.add(Catagory("Set Heart Alarm"))
    list.add(Catagory("Set Temp alarm"))
    list.add(Catagory("Set Calories goal"))
    list.add(Catagory("Get Calories goal"))
    list.add(Catagory("Set Distance goal"))
    list.add(Catagory("Get Distance goal"))
    list.add(Catagory("Set Step goal "))
    list.add(Catagory("Get Step goal"))
    list.add(Catagory("Get All Settings "))
    list.add(Catagory("Battert Info"))
    list.add(Catagory("Device ver"))
    list.add(Catagory("Set Find Phone Alert"))
    list.add(Catagory("Set Hand Wear"))
    list.add(Catagory("Set Anti-Lose"))
    list.add(Catagory("Set find Device"))
    list.add(Catagory("Get Do not Disturb"))
    list.add(Catagory("Set Do not disturb"))
    list.add(Catagory("Set sedentary reminder"))
    list.add(Catagory("Get Sedentary reminder"))
    list.add(Catagory("Set sedentary reminder "))
    list.add(Catagory("Get alram"))
    list.add(Catagory("Add Alarm "))
    list.add(Catagory("Delete Alarm"))
    list.add(Catagory("Modify Alarm"))
    list.add(Catagory("Set Display Brightness"))
    list.add(Catagory("Set Factiry Rest"))
    list.add(Catagory("Camera On"))
    list.add(Catagory("Camera Off"))
    list.add(Catagory("Set User info"))
    list.add(Catagory("Set User Gender"))
    list.add(Catagory("Set User age"))
    list.add(Catagory("Set user Height"))
    list.add(Catagory("Set user weight"))
    list.add(Catagory("Get User info"))
    list.add(Catagory("Get userGender"))
    list.add(Catagory("Get User Age"))
    list.add(Catagory("Get User height"))
    list.add(Catagory("Get User weight"))
    list.add(Catagory("Set Wrist On/Off"))
    list.add(Catagory("Start Exercise"))
    list.add(Catagory("Stop Exercise"))
    list.add(Catagory("Register real time Step data"))
    list.add(Catagory("Unregister real time Step data"))
    list.add(Catagory("Start ECG measurement"))
    list.add(Catagory("Reset Queue"))
    list.add(Catagory("Get Device Capabilities"))
    list.add(Catagory("Get API Unit"))
    list.add(Catagory("Disconnect"))

    return list
}
