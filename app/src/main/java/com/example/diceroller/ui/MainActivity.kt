package com.example.diceroller.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.diceroller.R

class MainActivity : AppCompatActivity() {
    lateinit var edt_userName: EditText
    lateinit var edt_password: EditText
    lateinit var btn_login: Button

    val UserName: String = "mohamed"
    val Password: String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_userName = findViewById(R.id.edt_usernampe)
        edt_password = findViewById(R.id.edt_passwoed)
        btn_login = findViewById(R.id.btn_login)

        btn_login.setOnClickListener {
            if (!edt_userName.text.toString().isNullOrEmpty() && !edt_password.text.toString().isNullOrEmpty()) {
                if (edt_userName.text.toString().equals(UserName) && edt_password.text.toString().equals(Password)) {
                    Toast.makeText(this, "Login sucess", Toast.LENGTH_LONG).show()

                    var intent: Intent = Intent(this, appTest::class.java)
                    intent.putExtra("UserName", edt_userName.text.toString())
                    startActivity(intent)

                }
            }
        }
    }


}