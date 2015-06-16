package br.com.fean.si.poo2.dao;

import br.com.fean.si.poo2.model.Usuario;
import br.com.fean.si.poo2.util.EntityManagerUtil;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class UsuarioDAO {

    private final EntityManager entityManager = EntityManagerUtil.getEntityManager();

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public String incluirUsuario(Usuario a) {
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

    public String alterarUsuario(Usuario a) {
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

    public String apagarUsuario(Usuario a) {
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

    public ArrayList<Usuario> listarEventos() {

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Query query = entityManager.createQuery("select c from Curso c");
        usuarios = (ArrayList<Usuario>) query.getResultList();

        return usuarios;
    }

}
