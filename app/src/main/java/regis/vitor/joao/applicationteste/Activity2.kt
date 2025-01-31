package regis.vitor.joao.applicationteste

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity

class Activity2: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyComposableUI()
        }

        val data: String? = intent.getStringExtra("data")

        if (data != null) {
            Log.d("testIntent", "data:$data")
        }
    }
}

class MyComposableUI {

}