package com.example.koin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject
import org.koin.experimental.property.inject

class MainActivity : AppCompatActivity() {

    private val schoolService : SchoolService by inject()
    private val studentController : StudentController by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        schoolService.moveSchool("동진중학교")
        studentController.print()
    }
}