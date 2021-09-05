package com.idn.belajarintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ResultReceiver
import android.widget.TextView

class IntentDenganData : AppCompatActivity() {

    companion object{
        const val EXTRA_TEXT ="extra_text"
    }

    private  lateinit var tvReceiver : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_dengan_data)

        tvReceiver = findViewById(R.id.tv_penerima_data)

        val textReceived = intent.getStringExtra(EXTRA_TEXT)

        val text ="Text yang diterima : $textReceived "

        tvReceiver.text = text
    }
}