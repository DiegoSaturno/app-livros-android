package com.diegooliveira.livros.ui.adapters

import android.content.Context
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.diegooliveira.livros.R
import com.diegooliveira.livros.models.Book
import org.w3c.dom.Text

class BooksAdapter(private val context: Context, val books: List<Book>): RecyclerView.Adapter<BooksAdapter.BookViewHolder>() {

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false)
        Log.d("recycler", "onCreateViewHolder")
        return BookViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = books[position]

        val nameTextView = holder.itemView.findViewById<TextView>(R.id.nameTextView)
        nameTextView.text = book.name

        val editionTitleText = holder.itemView.findViewById<TextView>(R.id.editionTextView)
        editionTitleText.text = book.edition

        val publisherTextView = holder.itemView.findViewById<TextView>(R.id.publisherTextView)
        publisherTextView.text = book.publisher

        val authorTextView = holder.itemView.findViewById<TextView>(R.id.authorTextView)
        authorTextView.text = book.author

        val yearTextView = holder.itemView.findViewById<TextView>(R.id.yearTextView)
        yearTextView.text = book.year.year.toString()
    }


    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

