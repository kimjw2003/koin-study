package com.example.koin_study

import org.koin.dsl.module

val appModule = module {
    single { SchoolService() }
    single { StudentController(get()) }
}