package com.example.personallist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.personallist.model.PersonalList
import com.example.personallist.ui.theme.PersonalListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        TopAppBarSample()
                        PersonalCard(PersonalList("Muhammad Farhan N", "Sleman, Yogyakarta", R.drawable.image1))
                    }
                }
            }
        }
    }
}



@Composable
fun PersonalCard(personalList: PersonalList, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Column {
            Image(
                painter = painterResource(personalList.photoUser),
                contentDescription = "Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Nama\t\t\t: " + personalList.nameStr,
                modifier = Modifier.padding(16.dp, 10.dp),
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Alamat\t: " + personalList.addressStr,
                modifier = Modifier.padding(16.dp, 10.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonalListPreview() {
//    TopAppBarSample()
    PersonalCard(PersonalList("Budi", "Nganjuk", R.drawable.image1))
}