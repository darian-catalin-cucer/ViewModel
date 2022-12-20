package cucerdariancatalin.viewmodel

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var plusOneButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView=findViewById(R.id.textView)
        plusOneButton=findViewById(R.id.plusOneButton)

        val viewModel= ViewModelProvider(this).get(MainActivityViewModel::class.java)

        textView.text=viewModel.number.toString()

        plusOneButton.setOnClickListener {

            viewModel.addNumber()
            textView.text=viewModel.number.toString()
        }

    }
}