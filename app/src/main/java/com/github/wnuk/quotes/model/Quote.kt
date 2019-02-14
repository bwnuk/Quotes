package com.github.wnuk.quotes.model

class Quote(val quoteText: String,
                 val author: String) {
    override fun toString(): String {
        return "$quoteText - $author"
    }
}