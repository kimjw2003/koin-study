package com.example.koin_study

class StudentController(val schoolService: SchoolService) {
    fun print(){
        println("현재 재학중인 학교 : ${schoolService.schoolName}")
    }
}