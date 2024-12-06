package regis.vitor.joao.applicationteste

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import regis.vitor.joao.applicationteste.databinding.ActivityMainBinding
import regis.vitor.joao.applicationteste.ui.theme.ApplicationTesteTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createListeners()

        Log.i("TAG_INFO", "onCreate invocado!")
    }

    override fun onStart() {
        super.onStart()

        Log.i("TAG_INFO", "onStart invocado!")
    }

    override fun onResume() {
        super.onResume()

        Log.i("TAG_INFO", "onResume invocado!")
    }

    override fun onRestart() {
        super.onRestart()

        Log.i("TAG_INFO", "onRestart invocado!")
    }

    override fun onPause() {
        super.onPause()

        Log.i("TAG_INFO", "onPause invocado!")
    }

    override fun onStop() {
        super.onStop()

        Log.i("TAG_INFO", "onStop invocado!")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("TAG_INFO", "onDestroy invocado!")
    }

    fun createListeners () {
        var value1: Double
        var value2: Double
        var result: Double

        binding.sum.setOnClickListener() {
            value1 = binding.num1.text.toString().toDoubleOrNull() ?: 0.0
            value2 = binding.num2.text.toString().toDoubleOrNull() ?: 0.0
            result = value1 + value2
            binding.resultView.text = String.format("%.2f", result)
        }

        binding.sub.setOnClickListener() {
            value1 = binding.num1.text.toString().toDoubleOrNull() ?: 0.0
            value2 = binding.num2.text.toString().toDoubleOrNull() ?: 0.0
            result = value1 - value2
            binding.resultView.text = String.format("%.2f", result)
        }

        binding.mul.setOnClickListener() {
            value1 = binding.num1.text.toString().toDoubleOrNull() ?: 0.0
            value2 = binding.num2.text.toString().toDoubleOrNull() ?: 0.0
            result = value1 * value2
            binding.resultView.text = String.format("%.2f", result)
        }

        binding.div.setOnClickListener() {
            value1 = binding.num1.text.toString().toDoubleOrNull() ?: 0.0
            value2 = binding.num2.text.toString().toDoubleOrNull() ?: 0.0
            result = value1 / value2
            binding.resultView.text = String.format("%.2f", result)
        }


//        setContentView(R.layout.activity_main)
//
//        val textView = findViewById<TextView>(R.id.textView)
//        val button = findViewById<Button>(R.id.button)
//
//        button.setOnClickListener(){
//            textView.text = "Botão acionado"
//        }
    }
}