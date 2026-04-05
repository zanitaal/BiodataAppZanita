package com.example.biodataappzanita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BiodataScreen()
        }
    }
}

@Composable
fun BiodataScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "BIODATA",
            fontSize = 26.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(8.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.foto_zanita),
                        contentDescription = "Foto",
                        modifier = Modifier
                            .size(130.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                // NAMA
                Text(
                    text = "Zanita Alya Khairunnisa",
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(6.dp))

                // NIM
                Text(
                    text = "NIM: 245150707111019",
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                // RIWAYAT
                Text(
                    text = "Riwayat Pendidikan",
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "• SMPIT Daarul Hikmah")
                Text(text = "• SMA YPK Bontang")
                Text(text = "• Universitas Brawijaya")
            }
        }
    }
}