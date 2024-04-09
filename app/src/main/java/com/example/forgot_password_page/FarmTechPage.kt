package com.example.forgot_password_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FarmTechPage(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "FARM TECH",
                        color = Color.White,
                        style = TextStyle(fontSize = 24.sp),
                    )
                } ,
                backgroundColor = MaterialTheme.colors.primary, // Set background color to primary color
                modifier = Modifier.padding(0.dp)
            )
        },
        content = { paddingValues ->
            FarmTechContent(paddingValues)
        }
    )
}

@Composable
fun FarmTechContent(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(paddingValues),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(60.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            FarmTechTab("farmtech1", imageResId = R.drawable.farm_image_1)
            FarmTechTab("farmtech2", imageResId = R.drawable.farm_image_2)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            FarmTechTab("farmtech3", imageResId = R.drawable.farm_image_3)
            FarmTechTab("farmtech1", imageResId = R.drawable.farm_image_1)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            FarmTechTab("farmtech2",imageResId = R.drawable.farm_image_2)
            FarmTechTab("farmtech3" ,imageResId = R.drawable.farm_image_1)
        }

            }
        }

@Composable
fun FarmTechTab(text: String, imageResId: Int) {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(100.dp)
            .background(Color.Gray)
            .clickable { },
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text)
            Row(verticalAlignment = Alignment.CenterVertically) {
                AddToCartIcon()
                Spacer(modifier = Modifier.width(8.dp))
                FavoriteIcon()
            }
        }
    }
}

@Composable
fun AddToCartIcon() {
    Icon(
        imageVector = Icons.Default.ShoppingCart,
        contentDescription = "Add to Cart",
        tint = Color.Black
    )
}

@Composable
fun FavoriteIcon() {
    Icon(
        imageVector = Icons.Default.Favorite,
        contentDescription = "Add to Favorite",
        tint = Color.Black
    )
}



