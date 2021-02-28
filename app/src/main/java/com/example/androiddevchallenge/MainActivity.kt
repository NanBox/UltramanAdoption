package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevchallenge.ui.Home

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<UltramanViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }

    override fun onBackPressed() {
        if (viewModel.currentUltraman != null) {
            viewModel.close()
        } else {
            super.onBackPressed()
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomePreview() {
    Home()
}
