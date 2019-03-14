/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.packtpub.alumni

import com.packtpub.alumni.controller.city
import com.packtpub.alumni.controller.university
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.gson.gson
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.alumniModule() {
    install(ContentNegotiation) {
        gson {
        }
    }
    routing {
        get("/") {
            call.respondText("Hello World")
        }
        city()
        university()
    }
}