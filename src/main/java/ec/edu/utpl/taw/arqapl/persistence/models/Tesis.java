package ec.edu.utpl.taw.arqapl.persistence.models;

import javax.persistence.*;

@Entity
public class Tesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "AUTOR")
    private Estudiante autor;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "DIRECTOR")
    private Docente director;

    public Tesis() {
    }

    public Tesis(String titulo, Estudiante autor, Docente director) {
        this.titulo = titulo;
        this.autor = autor;
        this.director = director;
    }

    public Tesis(String titulo) {
        this.titulo = titulo;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudiante getAutor() {
        return autor;
    }

    public void setAutor(Estudiante autor) {
        this.autor = autor;
    }

    public Docente getDirector() {
        return director;
    }

    public void setDirector(Docente director) {
        this.director = director;
    }
}
