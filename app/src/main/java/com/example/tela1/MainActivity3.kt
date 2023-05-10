package com.example.tela1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            Toast.makeText(this, "Tela Harm. Quadratica", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity4::class.java)
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