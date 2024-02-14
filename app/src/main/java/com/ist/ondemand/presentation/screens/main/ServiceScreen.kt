package com.ist.ondemand.presentation.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ist.ondemand.presentation.MainViewModel

@Composable
fun ServiceScreen(navController: NavController, vm: MainViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Service Screen")
//Loop through the services and display them
cardList.forEach { card ->
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            //Navigate to the service screen when the card is clicked from firebase firestore
           
        onClick = {
            navController.navigate("service/${card.id}")
        }
    ) { 
        //Display the card
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            //Display the image
            Image(
                painter = painterResource(id = card.image),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            //Display the title and description
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Text(text = card.title, style = MaterialTheme.typography.h6)
                Text(text = card.description, style = MaterialTheme.typography.body2)
            }
        }

    }

        BottomNavigationMenu(
            selectedItem = BottomNavigationItem.SERVICES,
            navController = navController
        )

    }
}
}