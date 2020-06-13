package com.lgior.app

import com.lgior.resources.HelloFromKotlin
import com.lgior.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class TestApplication : Application<TestAppConfiguration?>() {
    override fun getName(): String {
        return "Prueba dropwizard"
    }

    override fun initialize(bootstrap: Bootstrap<TestAppConfiguration?>) {
        // TODO: application initialization
    }

    override fun run(configuration: TestAppConfiguration?,
                     environment: Environment) {
        val resource = HelloWorldResource()
        val helloFromKotlin = HelloFromKotlin()
        environment.jersey().register(resource)
        environment.jersey().register(helloFromKotlin)
    }

    companion object {
        @Throws(Exception::class)
        @JvmStatic
        fun main(args: Array<String>) {
            TestApplication().run(*args)
        }
    }
}