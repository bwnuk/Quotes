package com.github.wnuk.quotes.viewmodel

import androidx.lifecycle.ViewModel
import com.github.wnuk.quotes.model.Quote
import com.github.wnuk.quotes.model.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}