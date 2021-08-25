/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import javax.persistence.Query;
import jdk.nashorn.internal.runtime.JSType;
import libreria.entidades.Editorial;

/**
 *
 * @author Emiliano
 */
public class DAO {

    public static void crear(Object objeto) {
        try {
            EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
        }
    }

    public static void eliminar(Object objeto) {

        try {
            EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
            em.getTransaction().begin();
            Object nu = new Object();
            nu = em.merge(objeto);
            em.remove(nu);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("error eliminar");
        }
    }

    public static void modificar(Object objeto) {

        try {
            EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("dwqd");
        }
    }

    public static Object consultar(Object objeto, String id) {
        Object nuevo = null;
        try {
            EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();
            em.getTransaction().begin();
            nuevo = em.find(objeto.getClass(), id);            
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("dwqd");

        } finally {
            return nuevo;
        }

    }
     public static List<?> listar(String clase) {
       
         String query="SELECT c FROM "+clase+" c";
         
         List<?>nuevo=null;
         EntityManager em = Persistence.createEntityManagerFactory("libreriaPU").createEntityManager();            
            nuevo=em.createQuery(query)
                    .getResultList();           
         try {
            
        } catch (Exception e) {
            System.out.println("error listar");            
        } finally {
            return nuevo;
        }

    }
}
