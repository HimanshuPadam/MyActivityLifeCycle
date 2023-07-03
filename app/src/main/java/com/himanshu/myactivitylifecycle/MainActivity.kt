package com.himanshu.myactivitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var btnNext: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext = findViewById(R.id.btnNext)
        btnNext?.setOnClickListener {
            var intent= Intent( this, NextPage::class.java)
            startActivity(intent)
            //finish() this is used to invoke destroy method,but if you want to invoke restart method,then do not use finish()
        }
    }
    override fun onStart(){
        super.onStart()
        Toast.makeText(this ,"On Start method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onResume(){
        super.onResume()
        Toast.makeText(this ,"On Resume method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onPause(){
        super.onPause()
        Toast.makeText(this ,"On Pause method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(this ,"On Stop method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "On Destroy method invoked", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart(){
        super.onRestart()
        Toast.makeText(this,"On Restart method invoked", Toast.LENGTH_SHORT).show()
    }

}