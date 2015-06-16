package br.com.fean.si.poo2.dao;

import br.com.fean.si.poo2.model.Ministrante;
import br.com.fean.si.poo2.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class MinistranteDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public String incluirMinistrante(Ministrante a) {
        String retorno = "Dados gravados com sucesso";

        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().persist(a);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }

        return retorno;

    }

    public String alterarMinistrante(Ministrante a) {
        String retorno = "Dados alterados com sucesso";
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().merge(a);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }

        return retorno;
    }

    public String apagarMinistrante(Ministrante a) {
        String retorno = "Dados apagados com sucesso";
        EntityTransaction tx = getEntityManager().getTransaction();

        try {
            tx.begin();
            getEntityManager().remove(a);
            tx.commit();
        } catch (Throwable t) {
            t.printStackTrace();
            tx.rollback();
        } finally {

        }

        return retorno;

    }

    public ArrayList<Ministrante> listarMinistrante() {

        ArrayList<Ministrante> ministrantes = new ArrayList<Ministrante>();
        Query query = entityManager.createQuery("select c from Ministrante c");
        ministrantes = (ArrayList<Ministrante>) query.getResultList();

        return ministrantes;
    }
    
    public Ministrante retornarMinistrante(int id) {

        Ministrante ministrante = null;
        try {
            ministrante = entityManager.find(Ministrante.class, id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ministrante;
    }
}
