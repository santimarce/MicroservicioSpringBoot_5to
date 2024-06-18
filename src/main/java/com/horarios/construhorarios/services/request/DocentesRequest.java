package com.horarios.construhorarios.services.request;

import com.horarios.construhorarios.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service

public class DocentesRequest {

    @Autowired
    private RestTemplate restTemplate;

    private final String backendUrl = "http://localhost:3000/docentes";

    public Teacher obtenerTeacherPorId(String id) {
        return restTemplate.getForObject(backendUrl + "/" + id, Teacher.class);
    }
}
