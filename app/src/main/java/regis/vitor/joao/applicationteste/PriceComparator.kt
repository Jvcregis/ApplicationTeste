package regis.vitor.joao.applicationteste

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import regis.vitor.joao.applicationteste.databinding.ActivityMainBinding

class PriceComparator : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createListeners()

        Log.i("TAG_INFO", "onCreate invocado!")
    }

    fun createListeners () {
        binding.setOnClickListener() {
            value1 = binding.num1.text.toString().toDoubleOrNull() ?: 0.0
            value2 = binding.num2.text.toString().toDoubleOrNull() ?: 0.0
            result = value1 + value2
            binding.resultView.text = String.format("%.2f", result)
        }
    }
}