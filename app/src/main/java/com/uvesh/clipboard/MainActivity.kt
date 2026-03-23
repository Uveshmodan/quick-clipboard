package com.uvesh.clipboard

import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.*
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivity() {
    var isMonitoring by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Clipboard Monitor", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { isMonitoring = !isMonitoring }) {
            Text(if (isMonitoring) "Stop Monitoring" else "Start Monitoring")
        }
        Spacer(modifier = Modifier.height(20.dp))
        FloatingActionButton(onClick = { /* Toggle Floating Icon Logic */ }) {
            Text("Toggle Icon")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainActivity() {
    MainActivity()
}