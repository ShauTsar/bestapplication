package com.infiren.bestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Screen3 : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var fam: EditText
    lateinit var mail:EditText
    lateinit var pass:EditText
    lateinit var secondPass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
    }

    fun registry(view: View) {
        if(name.text.toString().isNotEmpty()&&fam.text.toString().isNotEmpty()&&mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty()&&secondPass.text.toString().isNotEmpty())
        {
            Toast.makeText(this,"Вы успешно зарегистрировались",Toast.LENGTH_LONG).show()
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните все текстовые поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }

    }
}