package stud.ntnu.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val textNumber = findViewById<TextView>(R.id.textNumber)
        val numberBar = findViewById<SeekBar>(R.id.numberBar)

        rollButton.setOnClickListener {
            val rand = Random().nextInt(numberBar.progress)
            textNumber.text = rand.toString()
        }
    }
}