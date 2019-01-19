package ec.edu.utpl.taw.arqapl.persistence.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cedula;
    private String nombres;
    private String apellidos;
    @Column(name = "TITULO_ACADEMICO")
    private String tituloAcademico;
    @OneToMany
    private List<Tesis> tesis;

    public Docente() {
    }

    public Docente(String cedula, String nombres, String apellidos) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Docente(String cedula, String nombres, String apellidos, String tituloAcademico) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tituloAcademico = tituloAcademico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }
}
