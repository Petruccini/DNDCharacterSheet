package co.mudii.dndcharactersheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import co.mudii.dndcharactersheet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonRollDice.setOnClickListener {
            val result = (1..20).random()
            Toast.makeText(this, "You rolled a: $result", Toast.LENGTH_LONG).show()

            binding.textViewDiceResult.text = "Roll a D20!\nLast result: $result"

            // comentario tonto
            // holi



        }

    }
}