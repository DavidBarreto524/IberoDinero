package com.example.proyecto_dinero

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val SignUpActivity: Unit
    private val LoginActivity: Unit


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btCrearLogin)
        btn.setOnClickListener {
            val intent: Intent = Intent(this.SignUpActivity::class.java)
            startActivity(intent)
            val btn: Button = findViewById(R.id.btVamos)
            btn.setOnClickListener {
                val intent: Intent = Intent(this.LoginActivity::class.java)
                startActivity(intent)
                val btn: Button = findViewById(R.id.btVamos)
                btn.setOnClickListener {
                    val intent: Intent = Intent(this.LoginActivity::class.java)
                    startActivity(intent)
            }
        /*setContentView(R.layout.activity_main)
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
        val intent = Intent(this, loginActivity::class.java)
        startActivity(intent)*/
    }
}
