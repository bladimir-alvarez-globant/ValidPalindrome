package org.example

import java.util.*

fun isPalindrome(phrase: String): Boolean {
    val cleanString = phrase.lowercase(Locale.getDefault()).replace(Regex("[^a-zA-Z0-9]"), "")

    val isPalindrome = true

    cleanString.forEachIndexed { index, c ->
        if (c != cleanString[cleanString.lastIndex - index]) return false
    }

    return isPalindrome
}

fun main() {
    println(isPalindrome("Able was I, ere I saw Elba."))
    println(isPalindrome("Hello, World!"))
    println(isPalindrome("12321"))
}
