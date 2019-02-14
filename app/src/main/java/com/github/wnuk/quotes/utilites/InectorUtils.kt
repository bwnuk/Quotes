package com.github.wnuk.quotes.utilites

import com.github.wnuk.quotes.model.FakeDatabase
import com.github.wnuk.quotes.model.QuoteRepository
import com.github.wnuk.quotes.viewmodel.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}