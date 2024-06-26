package com.technobrain.projet42.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.technobrain.projet42.R
import com.technobrain.projet42.domain.model.Event
import com.technobrain.projet42.domain.model.EventShort

@Composable
fun EventCard(event: EventShort) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image( // change to AsyncImage when available
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Remplacer `background_image` par votre ressource
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .background(Color(0xAA000000)) // Semi-transparent black background
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text(text = event.name, color = Color.White, style = MaterialTheme.typography.bodyMedium)
                Text(text = ", ", color = Color.White, style = MaterialTheme.typography.bodyMedium)
                Text(text = event.location, color = Color.White, style = MaterialTheme.typography.bodyMedium)
            }
            Text(text = event.date, color = Color.White, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview
@Composable
fun EventCardPreview() {
    EventCard(
        EventShort(
            id = "1",
            name = "Evenement 1",
            date = "Lundi 01 janvier",
            location = "Lyon"
        )
    )
}