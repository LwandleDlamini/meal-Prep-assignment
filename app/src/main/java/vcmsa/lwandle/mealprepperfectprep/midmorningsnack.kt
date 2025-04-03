package vcmsa.lwandle.mealprepperfectprep

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

// Adapter class (if needed, extend RecyclerView.Adapter)
class SnackAdapter {
    // Implement adapter functionality if necessary
}

class MidMorningSnack : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_midmorningsnack)

        // Adjusting window insets for edge-to-edge experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find views by ID
        val titleText: EditText = findViewById(R.id.editTextText7)
        val imageAppleButter: ImageView = findViewById(R.id.imageView20)
        val imageBananaRiceCakes: ImageView = findViewById(R.id.imageView22)
        val imageCarrotHummus: ImageView = findViewById(R.id.imageView23)

        val textAppleButter: TextView = findViewById(R.id.textView16)
        val textBananaRiceCakes: TextView = findViewById(R.id.textView17)
        val textCarrotHummus: TextView = findViewById(R.id.textView18)

        // Example: Setting click listeners (if needed)
        imageAppleButter.setOnClickListener {
            titleText.setText("You selected Apples with Almond Butter")
        }

        imageBananaRiceCakes.setOnClickListener {
            titleText.setText("You selected Bananas with Peanut Butter Rice Cakes")
        }

        imageCarrotHummus.setOnClickListener {
            titleText.setText("You selected Carrot and Hummus")
        }
    }
}
