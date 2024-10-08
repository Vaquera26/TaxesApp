package com.example.navegacion.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.navegacion.views.HomeView


@Composable
fun TitileBar(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.White)
}

@Composable
fun ActionButton(){
    FloatingActionButton(onClick =  {},
        containerColor = Color.Red,
        contentColor = Color.White
        )
    {
        Icon(imageVector = Icons.Default.Add, contentDescription = "Agregar")
    }
}