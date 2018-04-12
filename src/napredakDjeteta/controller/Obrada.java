/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.controller;

import java.util.List;
import napredakDjeteta.model.Entitet;
import napredakDjeteta.pomocno.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Polaznik
 * @param <T>
 */
public class Obrada<T extends Entitet>{
    
    private final Session session;

    public Obrada() {
        session = HibernateUtil.getSession();
    }

    //Create ili Update ili Delete jer imamo atribut delete
    public T save(T entitet) {
        
//tu dođu podaci o operaterima nakon što napravimo login
        session.beginTransaction();
        session.saveOrUpdate(entitet);
        session.getTransaction().commit();
        return entitet;
    }
    

    

    //Delete
    public  void delete(T entitet) {
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
    }

    public List<T> save(List<T> lista) {
        session.beginTransaction();
        lista.stream().forEach((entitet) -> {
            session.saveOrUpdate(entitet);
        });
        session.getTransaction().commit();
        return lista;
    }
    
}
