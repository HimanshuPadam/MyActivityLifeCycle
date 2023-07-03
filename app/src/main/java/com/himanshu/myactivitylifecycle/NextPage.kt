package com.himanshu.myactivitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class NextPage : AppCompatActivity() {
    var btnPrevious:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_next_page)


        btnPrevious=findViewById(R.id.btnPrevious)
        btnPrevious?.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}