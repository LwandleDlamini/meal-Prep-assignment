package vcmsa.lwandle.mealprepperfectprep

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AfternoonSnack : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_afternoon_snack)

        // Fix layout insets for immersive experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize UI elements
        val nuggetsImage: ImageView = findViewById(R.id.NuggetAndDip)
        val samosasImage: ImageView = findViewById(R.id.imageView26)
        val springRollsImage: ImageView = findViewById(R.id.imageView27)

        // Set click listeners for snack selection
        nuggetsImage.setOnClickListener { navigateToNextActivity("Nuggets and Dip") }
        samosasImage.setOnClickListener { navigateToNextActivity("Samosas") }
        springRollsImage.setOnClickListener { navigateToNextActivity("Spring Rolls") }
    }
//this code has been genearted by AI
    private fun navigateToNextActivity(snack: String) {
        Toast.makeText(this, "You selected: $snack", Toast.LENGTH_SHORT).show()

    }
}
