package com.diegooliveira.livros.ui.activities

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.diegooliveira.livros.R
import com.diegooliveira.livros.models.Book
import com.diegooliveira.livros.ui.adapters.BooksAdapter

import kotlinx.android.synthetic.main.activity_books.*
import java.util.*

class BooksActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)
        inflateRecyclerView()


        fab.setOnClickListener { view ->
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //  .setAction("Action", null).show()
        }
    }

    private fun inflateRecyclerView() {
        val booksRecyclerView = findViewById<RecyclerView>(R.id.booksRecyclerView)

        booksRecyclerView.adapter = BooksAdapter(this, generateBooks())
        booksRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun generateBooks(): List<Book> {
        val books = ArrayList<Book>()

        for(i in 1..20) {
            books.add(Book("Book $i", "Ed. $i", "Editora $i", "Autor $i", Date(), "http://google.com"))
        }

        return books
    }
}
