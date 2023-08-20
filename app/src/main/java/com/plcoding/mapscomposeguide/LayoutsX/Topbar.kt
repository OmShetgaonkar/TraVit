package com.plcoding.mapscomposeguide.LayoutsX

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.mapscomposeguide.presentation.MapScreen

@Composable
fun Topbar()
{
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        topBar = {
            androidx.compose.material.TopAppBar(
                title = {
                    Text(text= "TraVit")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "Menu"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Locations")

                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.DirectionsBus,
                            contentDescription = "Bus_Icon")
                    }
                }
            )
        }
    ) {
            contentPadding -> MapScreen()

    }

}