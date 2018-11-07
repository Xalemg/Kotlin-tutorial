package com.example.xalemg.kotlin_tutorial.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.xalemg.kotlin_tutorial.data.Quote
import com.example.xalemg.kotlin_tutorial.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}