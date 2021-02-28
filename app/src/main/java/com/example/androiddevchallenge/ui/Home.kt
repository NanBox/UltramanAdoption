package com.example.androiddevchallenge.ui

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.androiddevchallenge.UltramanViewModel
import kotlinx.coroutines.launch

@Composable
fun Home() {
    val snackbarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Ultra Heroes")
                }
            )
        },
        snackbarHost = {
            SnackbarHost(snackbarHostState)
        }
    ) {
        val viewModel: UltramanViewModel = viewModel()
        UltramanList(viewModel.ultramans) { ultraman ->
            viewModel.show(ultraman)
        }
        val ultraman = viewModel.currentUltraman
        if (ultraman != null) {
            UltramanDetails(ultraman) {
                coroutineScope.launch {
                    snackbarHostState.showSnackbar("You have adopted ${ultraman.name}")
                }
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomePreview() {
    Home()
}