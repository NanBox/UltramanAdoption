package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.bean.Ultraman

@Composable
fun UltramanDetails(ultraman: Ultraman, onAdopt: (Ultraman) -> Unit = {}) {
    LazyColumn(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        item {
            Box {
                Image(
                    painterResource(ultraman.picture),
                    "Dog picture: ${ultraman.name}",
                    Modifier.aspectRatio(1f),
                    contentScale = ContentScale.Crop
                )
                Button(
                    { onAdopt(ultraman) },
                    Modifier
                        .align(Alignment.BottomEnd)
                        .padding(16.dp)
                ) {
                    Text(text = "Adopt")
                }
            }
            Column(Modifier.padding(16.dp, 8.dp)) {
                Text(ultraman.name, style = MaterialTheme.typography.h3)
                ProvideTextStyle(MaterialTheme.typography.h5) {
                    Text("Height - " + ultraman.height + " Weight - " + ultraman.weight)
                    Text("Special Moves - " + ultraman.specialMoves)
                    Text(ultraman.intro, style = MaterialTheme.typography.body1)
                }
            }
        }
    }
}

@Preview
@Composable
fun UltramanDetailsPreview() {
    UltramanDetails(
        Ultraman(
            "ULTRAMAN", "40 m", "35,000 t", "Spacium Beam",
            "An alien of justice who came to Earth as an Inter Galactic Defense Force member from Nebula M78 Land of Light, in pursuit of Space Monster Bemular that escaped while being escorted to the Monster Graveyard. After crashing with SSSP member Hayata, Ultraman merged his life with Hayata’s and decided to stay and fight for the peace of the Earth.",
            R.drawable.ultraman
        )
    )
}
