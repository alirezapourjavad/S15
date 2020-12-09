package com.example.s15

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
//    val name = etText.text.toString()
//    var intent = Intent(this,SecondActivity::class.java)
//        intent.putExtra("name1",name)
//    val person = Person("alireza","javadi",25)
//    var intent = Intent(this,SecondActivity::class.java)
//    intent.putExtra("person",person)
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("http://www.google.com")
            )

            startActivity(intent)
        }

    }

}

