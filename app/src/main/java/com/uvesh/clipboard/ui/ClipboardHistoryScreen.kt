package com.uvesh.clipboard.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ClipboardHistoryScreen(clipboardItems: List<String>, onCopy: (String) -> Unit) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Clipboard History") }) }
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(clipboardItems.size) { index ->
                val item = clipboardItems[index]
                ListItem(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .clickable { onCopy(item) },
                    headlineContent = { Text(item) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewClipboardHistoryScreen() {
    ClipboardHistoryScreen(
        clipboardItems = listOf("Item 1", "Item 2", "Item 3"),
        onCopy = { /* Handle copy action */ }
    )
}