package com.horarios.construhorarios.model;

import lombok.Data;

@Data
public class Teacher {
    private String idDocente;
    private String nombresDocente;
    private String apellidosDocente;
    private String contactoDocente;
    private String emailDocente;
    private String contraseniaDocente;
    private Rama rama;
    private Facultad facultad;
    private Estado estado;
    private Rol rol;
}
