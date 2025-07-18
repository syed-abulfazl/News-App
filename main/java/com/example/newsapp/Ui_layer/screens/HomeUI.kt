package com.example.newsapp.Ui_layer.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.SubcomposeAsyncImage
import com.example.newsapp.Ui_layer.naviagtion.HomeScreen

@Composable
fun HomeScreenUI(viewModel: NewsViewModel, navController: NavController) {

    val data = viewModel.data.value?.articles ?: emptyList()

    Text(
        text = "News App",
        modifier = Modifier.padding(top = 50.dp, start = 10.dp),
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.primary,
    )


    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 95.dp)
    ) {

        items(data) {
            cardItems(
                title = it.title ?: "No data found",
                Description = it.description ?: "No data found",
                urlToImage = it.urlToImage ?: "No data found"
            )

        }
    }

}

@Composable
fun cardItems(
    title: String,
    Description: String,
    urlToImage: String,
    ) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(18.dp),
        onClick = {
       //     navController.navigate(HomeScreen)                //////////////////////
        }
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .height(120.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            SubcomposeAsyncImage(
                model = urlToImage, loading = {
                    CircularProgressIndicator()
                }, contentDescription = ""
            )

            Column(modifier = Modifier.padding(10.dp)) {

                Text(text = title)
                Text(text = Description)

            }

        }
    }

}
