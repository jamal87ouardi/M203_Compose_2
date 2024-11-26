package com.example.m203_compose_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m203_compose_2.ui.theme.M203_Compose_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            M203_Compose_2Theme {
                AppContent()
            }
        }
    }
}




@Composable
fun AppContent() {
    // États pour les TextField et Checkbox
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }
    var resultMessage by remember { mutableStateOf("") }

    // Interface utilisateur
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center, // Centre verticalement les éléments
        modifier = Modifier.fillMaxSize() // Occupe tout l'écran
    ) {


        // Premier TextField
        TextField(
            value = text1,
            onValueChange = { text1 = it },
            label = { Text("Texte 1") }
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Deuxième TextField
        TextField(
            value = text2,
            onValueChange = { text2 = it },
            label = { Text("Texte 2") }
        )

        Spacer(modifier = Modifier.height(20.dp))
        // Checkbox
        Row {
            Checkbox(
                checked = isChecked,
                onCheckedChange = { isChecked = it }
            )
            Text("Option activée")
        }

        Spacer(modifier = Modifier.height(20.dp))
        // Bouton
        Button(onClick = {

        }) {
            Text("Valider")
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Texte affichant le résultat
        Text("Resultat")
    }
}


