package com.example.xalemg.kotlin_tutorial.utilities

import com.example.xalemg.kotlin_tutorial.data.FakeDatabase
import com.example.xalemg.kotlin_tutorial.data.QuoteRepository
import com.example.xalemg.kotlin_tutorial.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}