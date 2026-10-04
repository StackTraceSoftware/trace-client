package com.stacktrace.trace

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform