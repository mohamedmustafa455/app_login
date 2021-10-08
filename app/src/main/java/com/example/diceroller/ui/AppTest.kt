package com.example.diceroller.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.diceroller.R
import com.example.diceroller.moodel.user
import com.example.diceroller.ui.adapter.UserRecyclerView

class appTest : AppCompatActivity() {
    lateinit var rv_showData : RecyclerView
    lateinit var  edt_message:EditText
    lateinit var btn_add: Button

    var UserName : String?=null
    var userList :ArrayList <user> = ArrayList()

    val userRecyclerView:UserRecyclerView by lazy { UserRecyclerView() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_test)
        if (intent != null) {
             UserName = intent.extras!!.get("UserName").toString()
            Toast.makeText(this, "user success ${UserName} ", Toast.LENGTH_LONG).show()
        }
        rv_showData=findViewById(R.id.rv_showData)
        edt_message=findViewById(R.id.edt_message)
        btn_add=findViewById(R.id.btn_add)

        rv_showData.adapter = userRecyclerView

        btn_add.setOnClickListener {

            userList.add(user(UserName.toString(),edt_message.text.toString(),R.drawable.iconazhar2))
            userRecyclerView.setList(userList)
            edt_message.setText("")
        }

        }


    }
