package regis.vitor.joao.applicationteste

import android.os.Bundle
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

        binding.button.setOnClickListener() {
            binding.textView.text = "Botão acionado"
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