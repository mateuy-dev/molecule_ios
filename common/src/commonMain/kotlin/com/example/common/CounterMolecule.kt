package com.example.common
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

@Composable
fun CounterMolecule(): Int {
  var count by remember { mutableStateOf(10) }

  LaunchedEffect(Unit) {
    repeat(10) {
      delay(1_000)
      count--
    }
  }

  return count
}
