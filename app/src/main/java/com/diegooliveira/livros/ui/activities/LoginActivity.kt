package com.diegooliveira.livros.ui.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.diegooliveira.livros.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSubmitButtonListener()
    }

    protected fun setSubmitButtonListener() {
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@LoginActivity, BooksActivity::class.java)

            startActivity(intent)
        })
    }
}
