package com.example.prak2mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            if(diceImage != diceImage2) {
                Toast.makeText(this, "Anda belum beruntung!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "Selamat Anda dapat dadu double!", Toast.LENGTH_SHORT).show()
            }
        }
        diceImage = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage1())
        diceImage2.setImageResource(getRandomDiceImage2())
    }

    private fun getRandomDiceImage1(): Int {
        return when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    private fun getRandomDiceImage2(): Int {
        return when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}