/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.bean.Ultraman

@Composable
fun UltramanItem(ultraman: Ultraman, modifier: Modifier = Modifier) {
    Card(modifier, elevation = 5.dp) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painterResource(ultraman.picture),
                "Picture of: ${ultraman.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(16.dp)) {
                Text(ultraman.name, style = MaterialTheme.typography.h5)
                Text("Height - " + ultraman.height + " Weight - " + ultraman.weight)
                Text("Special Moves - " + ultraman.specialMoves)
            }
        }
    }
}

@Preview
@Composable
fun UltraItemPreview() {
    UltramanItem(
        Ultraman(
            "ULTRAMAN", "40 m", "35,000 t", "Spacium Beam",
            "An alien of justice who came to Earth as an Inter Galactic Defense Force member from Nebula M78 Land of Light, in pursuit of Space Monster Bemular that escaped while being escorted to the Monster Graveyard. After crashing with SSSP member Hayata, Ultraman merged his life with Hayata’s and decided to stay and fight for the peace of the Earth.",
            R.drawable.ultraman
        )
    )
}
