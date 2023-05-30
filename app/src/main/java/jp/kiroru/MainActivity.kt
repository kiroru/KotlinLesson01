package jp.kiroru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import jp.kiroru.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // ログを表示する。
        binding.logButton.setOnClickListener {
            Log.d(TAG, resources.getString(R.string.log_message))
        }

        // トーストを表示する。
        binding.toastButton.setOnClickListener {
            Toast.makeText(this, resources.getString(R.string.toast_text), Toast.LENGTH_SHORT)
                .show()
        }

        // アラートダイアログを表示する。
        binding.alertDialogButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(resources.getString(R.string.alert_dialog_title))
                .setMessage(resources.getString(R.string.alert_dialog_message))
                .setPositiveButton(resources.getString(R.string.alert_dialog_ok_button), null)
                .show()
        }

        // 別画面（アクティビティ）に遷移する。
        binding.transitionButton.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        // テキストビューを編集する。
        binding.editTextViewButton.setOnClickListener {
            binding.textView.text = resources.getString(R.string.edit_text_new_string)
        }
    }
}