package ec.edu.utpl.taw.arqapl.persistence.runners;


import ec.edu.utpl.taw.arqapl.persistence.dao.TesisDao;
import ec.edu.utpl.taw.arqapl.persistence.models.Docente;
import ec.edu.utpl.taw.arqapl.persistence.models.Estudiante;
import ec.edu.utpl.taw.arqapl.persistence.models.Tesis;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var tesisDao = new TesisDao();


        //loadData();

        printList(tesisDao);

    }

    private static void loadData(TesisDao tesisDao) {
        var estudiantes = List.of(
                new Estudiante("11111111111", "Jorge", "Cordero"),
                new Estudiante("22222222222", "Patricio", "Paladines"),
                new Estudiante("33333333333", "Darwin", "Guajala"),
                new Estudiante("44444444444", "Elena", "Villavicencia"),
                new Estudiante("55555555555", "Mercedes", "Escalante"),
                new Estudiante("66666666666", "Cecilia", "Gonzalez"),
                new Estudiante("77777777777", "Raúl", "Rentería"),
                new Estudiante("88888888888", "Darwin", "Lanche"),
                new Estudiante("99999999999", "Marco", "Yaguana"),
                new Estudiante("10101010101", "Franklin", "Astudillo")
        );
        var docentes = List.of(
                new Docente("12121212121", "Alexandra", "Espinoza", "PhD"),
                new Docente("13131313131", "Santiago", "Quiñonez", "Mgs"),
                new Docente("14141414141", "Augusto", "Espinoza", "Ing"),
                new Docente("12121212121", "Luis", "Espinoza", "Ing"),
                new Docente("12121212121", "Rocío", "Morales", "PhD"),
                new Docente("12121212121", "Lorena", "Velez", "PhD"),
                new Docente("12121212121", "Francisco", "Morocho", "Mgs"),
                new Docente("12121212121", "Truman", "Davila", "Mgs"),
                new Docente("12121212121", "Pedro", "Valdiviezo", "Mgs"),
                new Docente("12121212121", "Carmen", "Segarra", "PhD")
        );
        var titulos = List.of("Tema1", "Tema2", "Tema3", "Tema4", "Tema5", "Tema6", "Tema7", "Tema8", "Tema9", "Tema10");

        for(var i = 0; i < titulos.size(); i ++) {
            tesisDao.addTesisAll(titulos.get(i), estudiantes.get(i), docentes.get(i));
        }
    }

    private static void printList(TesisDao tesisDao) {
        for(Tesis t: tesisDao.getTesis()) {
            System.out.printf("%30s\t%30s\n",
                    t.getAutor().getApellidos().concat(", ").concat(t.getAutor().getNombres()),
                    t.getDirector().getApellidos().concat(", ").concat(t.getDirector().getNombres()));
        }

    }
}
