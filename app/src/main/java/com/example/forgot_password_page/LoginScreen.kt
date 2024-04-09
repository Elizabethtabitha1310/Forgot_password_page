package com.example.forgot_password_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.forgot_password_page.models.CreatePassword


@Composable
fun LoginScreen(navController: NavController) {
        val password: MutableState<TextFieldValue> = remember { mutableStateOf(TextFieldValue("")) }

        MaterialTheme(
            colors = lightColors(primary = colorResource(id = R.color.maroon))
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                    Image(
                        painter = painterResource(id = R.drawable.equitylogo),
                        contentDescription = "Your Image",
                        modifier = Modifier
                            .size(200.dp)
                            .padding(bottom = 16.dp) // Add some bottom padding to create space between the image and title
                    )

                    Text(
                        text = "Login Screen",
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(bottom = 16.dp) // Add some bottom padding to create space between the title and text fields
                    )
                OutlinedTextField(
                    value = password.value,
                    onValueChange = { newValue -> password.value = newValue },
                    label = { Text("Enter Password") },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )

                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = {
                        navController.navigate(CreatePassword.route)
                    },
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text("Confirm")
                }
            }
        }
    }

