package jp.kiroru

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.kiroru.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySubBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.closeButton.setOnClickListener {
            finish()
        }
    }
}