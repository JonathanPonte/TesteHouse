package com.example.jonat.testehouse

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_matriculareceber.*

class ReceberMatriculaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matriculareceber)

        matricula.text = intent.getStringExtra("matricula")
        Log.d("tag", matricula.text.toString())
        senha.text = intent.getStringExtra("senha")




    }


}