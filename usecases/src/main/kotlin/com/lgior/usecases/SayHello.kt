package com.lgior.usecases

class SayHello {
    fun execute() : Greeting {
        return Greeting("use case", "hello!")
    }
}