package com.example.koin_study

class SchoolService {
    var schoolName : String = "대구소프트웨어고등학교"

    fun moveSchool(newSchoolName : String){
        this.schoolName = newSchoolName
    }
}