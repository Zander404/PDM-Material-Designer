package com.example.tela1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            Toast.makeText(this, "Tela Monocromatica", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}