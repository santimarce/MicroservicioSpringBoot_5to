package com.horarios.construhorarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horarios.construhorarios.model.Teacher;
import com.horarios.construhorarios.services.request.DocentesRequest;
// import com.horarios.construhorarios.services.response.DocentesResponse;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private DocentesRequest teacherService;

    @GetMapping("/{id}")
    public Teacher obtenerTeacher(@PathVariable String id) {
        return teacherService.obtenerTeacherPorId(id);
    }

    @GetMapping("")
    public String obtenerTeachers() {
        return "It's working";
    }
}