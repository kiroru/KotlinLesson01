package jp.kiroru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // ログを表示する。
        val logButton = findViewById<Button>(R.id.logButton)
        logButton.setOnClickListener {
            Log.d(TAG, resources.getString(R.string.log_message))
        }

        // トーストを表示する。
        val toastButton = findViewById<Button>(R.id.toastButton)
        toastButton.setOnClickListener {
            Toast.makeText(this, resources.getString(R.string.toast_text), Toast.LENGTH_SHORT)
                .show()
        }

        // アラートダイアログを表示する。
        val alertDialogButton = findViewById<Button>(R.id.alertDialogButton)
        alertDialogButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(resources.getString(R.string.alert_dialog_title))
                .setMessage(resources.getString(R.string.alert_dialog_message))
                .setPositiveButton(resources.getString(R.string.alert_dialog_ok_button), null)
                .show()
        }

        // 別画面（アクティビティ）に遷移する。
        val transitionButton = findViewById<Button>(R.id.transitionButton)
        transitionButton.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        // テキストビューを編集する。
        val editTextViewButton = findViewById<Button>(R.id.editTextViewButton)
        editTextViewButton.setOnClickListener {
            val textView = findViewById<TextView>(R.id.textView)
            textView.text = resources.getString(R.string.edit_text_new_string)
        }
    }
}