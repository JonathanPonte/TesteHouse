package com.example.jonat.testehouse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       funcaoBotaoLogin()


    }

    private fun funcaoBotaoLogin() {


        buttonLogin.setOnClickListener(){

            val extraBundle = Bundle()

            extraBundle.putString("matricula", campoMatricula.text.toString())
            extraBundle.putString("senha", campoSenha.text.toString())

          val intentReceberMatriculaActivity = Intent(this, ReceberMatriculaActivity::class.java)
            intentReceberMatriculaActivity.putExtras(extraBundle)






            startActivity(intentReceberMatriculaActivity)

        }

    }


}
