package com.example.s15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_second.*
const val   INPUT_RESULT_CODE = 200
class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        btnInput.setOnClickListener {
            val returnIntent = Intent()
            returnIntent.putExtra("amount",etAmount.text.toString())
            setResult(INPUT_RESULT_CODE,returnIntent)
            finish()
        }
    }
}