package com.example.s15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_input.*
import kotlinx.android.synthetic.main.activity_second.*
const val TAG = "secondActivity"
const val REQUEST_CODE = 100
class SecondActivity : AppCompatActivity() {
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== REQUEST_CODE && resultCode == INPUT_RESULT_CODE){
            val amount = data?.getStringExtra("amount")
            tvAmount.text = amount
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        val name = intent.getStringExtra("name1")
//        val person = intent.getParcelableExtra<Person>("person")
//        val lastName = person?.lastName
//        textView.text = lastName
//
//            Log.i(TAG,"ali $person")
//
        btnAmount.setOnClickListener {
            val intent = Intent(this,InputActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }

    }
}