package com.example.androiddevchallenge.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.bean.Ultraman

@Composable
fun UltramanList(list: List<Ultraman>, onItemClick: (Ultraman) -> Unit = {}) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(list) { ultraman ->
            UltramanItem(
                ultraman,
                Modifier
                    .clickable {
                        onItemClick(ultraman)
                    }
                    .fillMaxWidth()
            )
        }
    }
}


@Preview
@Composable
fun UltramanListPreview() {
    val list = listOf(
        Ultraman(
            "ULTRAMAN", "40 m", "35,000 t", "Spacium Beam",
            "An alien of justice who came to Earth as an Inter Galactic Defense Force member from Nebula M78 Land of Light, in pursuit of Space Monster Bemular that escaped while being escorted to the Monster Graveyard. After crashing with SSSP member Hayata, Ultraman merged his life with Hayata’s and decided to stay and fight for the peace of the Earth.",
            R.drawable.ultraman
        )
    )
    UltramanList(list)
}