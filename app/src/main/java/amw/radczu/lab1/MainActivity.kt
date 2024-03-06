package amw.radczu.lab1

import amw.radczu.lab1.databinding.ActivityMainBinding
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun bindingConvertCurrency(view: View) {
        if(binding.dollarText.text.isNotEmpty()) {
            var dollararValue = binding.dollarText.text.toString().toFloat()
            var eurovalue = dollararValue * 0.85F
            binding.textView.text = eurovalue.toString()
        } else {
            binding.textView.text = getString(R.string.no_value_string)
        }
    }


    fun convertCurrency(view: View) {
        var dollarText: EditText = findViewById(R.id.dollarText)
        var textView: TextView = findViewById(R.id.textView)

        if(dollarText.text.isNotEmpty()) {
            var dollararValue = dollarText.text.toString().toFloat()
            var eurovalue = dollararValue * 0.85F
            textView.text = eurovalue.toString()
        } else {
            textView.text = getString(R.string.no_value_string)
        }
    }
}