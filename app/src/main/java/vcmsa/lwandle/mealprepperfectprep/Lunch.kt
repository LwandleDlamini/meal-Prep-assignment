package vcmsa.lwandle.mealprepperfectprep

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lunch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge for modern devices
        enableEdgeToEdge()

        // Set the layout for the activity
        setContentView(R.layout.activity_lunch)

        // Handle window insets for padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize UI elements
        val headerText = findViewById<EditText>(R.id.editTextText5)
        val boujeeImage = findViewById<ImageView>(R.id.imageView14)
        val chickenWrapImage = findViewById<ImageView>(R.id.imageView15)
        val tunaSandwichImage = findViewById<ImageView>(R.id.imageView16)

        val boujeeText = findViewById<TextView>(R.id.textView12)
        val chickenWrapText = findViewById<TextView>(R.id.textView9)
        val tunaSandwichText = findViewById<TextView>(R.id.textView10)

        // Click listeners for images
        boujeeImage.setOnClickListener {
            showToast("Boujee Bowl: A healthy and delicious choice!")
        }

        chickenWrapImage.setOnClickListener {
            showToast("Grilled Chicken Wrap: Packed with protein and veggies!")
        }

        tunaSandwichImage.setOnClickListener {
            showToast("Tuna Sandwich: A classic and nutritious meal!")
        }

        // Click listeners for text labels
        boujeeText.setOnClickListener {
            headerText.setText("Boujee Bowl Recipe")
        }

        chickenWrapText.setOnClickListener {
            headerText.setText("Grilled Chicken Wrap Recipe")
        }

        tunaSandwichText.setOnClickListener {
            headerText.setText("Tuna Sandwich Recipe")
        }
    }
//this was generated by chatGPT
    // Show toast message
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
