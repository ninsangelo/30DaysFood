package com.example.a30daysfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysfood.data.Food
import com.example.a30daysfood.data.foods
import com.example.a30daysfood.ui.theme._30DaysFoodTheme
import java.time.MonthDay

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysFoodTheme {
                Surface(modifier = Modifier.fillMaxSize()){
                    FoodApp()
                }
            }
        }
    }
}

@Composable
fun FoodApp() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "30 Days of Food",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn {
            items(foods) { day ->
                FoodItem(day)
            }
        }
    }
}

@Composable
fun FoodItem(day: Food){
    var expanded by remember{ mutableStateOf( false)}
    val cardHeight by animateDpAsState(
        targetValue = if (expanded) 250.dp else 100.dp,
        animationSpec = tween(durationMillis = 300), label = "CardHeightAnimation"
    )
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { expanded = !expanded }
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Day ${day.day}", style = MaterialTheme.typography.labelMedium)
            Text(
                text = day.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = 4.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = painterResource(id = day.imageRes),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(150.dp),
                contentScale = ContentScale.Crop
            )
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = day.description, style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodPreview() {
    _30DaysFoodTheme {
        FoodApp()
    }
}