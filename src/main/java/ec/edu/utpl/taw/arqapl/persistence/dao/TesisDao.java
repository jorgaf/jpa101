package ec.edu.utpl.taw.arqapl.persistence.dao;

import ec.edu.utpl.taw.arqapl.persistence.models.Docente;
import ec.edu.utpl.taw.arqapl.persistence.models.Estudiante;
import ec.edu.utpl.taw.arqapl.persistence.models.Tesis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesisDao {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataSource");
    private EntityManager em = emf.createEntityManager();

    public boolean addTesisAll(String titulo, Estudiante autor, Docente director) {
        Tesis tesis = new Tesis(titulo, autor, director);

        em.getTransaction().begin();
        em.persist(tesis);
        em.getTransaction().commit();

        return true;
    }

    public List<Tesis> getTesis() {
        TypedQuery<Tesis> query = em.createQuery("select t from Tesis t", Tesis.class);

        return query.getResultList();
    }
}
