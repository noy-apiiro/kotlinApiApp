package com.example.springbootrestapikt.controllers

import com.example.springbootrestapikt.pojo.Student
import com.example.springbootrestapikt.repo.StudentsRepo
import com.example.springbootrestapikt.util.Routes
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

/**
 * Controller class for various REST API operations.
 *
 * @author hari
 *
 */
@RestController
class StudentResource {

    @Autowired
    val studentsRepo = StudentsRepo()

    @PostMapping(Routes.create)
    fun createNewStudent(@RequestBody student:Student): List<Student>{

        return studentsRepo.addStudent(student)
    }

    @PostMapping(Routes.update)
    fun updateNewStudent(@RequestBody student:Student): List<Student>{

        return studentsRepo.addStudent(student)
    }

    @GetMapping("${Routes.find}/{name}")
    fun retrieveStudentByName(@PathVariable name:String): Student?{

        return studentsRepo.getStudentWithName(name)
    }
}