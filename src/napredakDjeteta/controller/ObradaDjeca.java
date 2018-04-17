/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.controller;

import java.util.List;
import napredakDjeteta.model.Dijete;
import napredakDjeteta.pomocno.HibernateUtil;

/**
 *
 * @author marti
 */
public class ObradaDjeca {
    
    private Obrada<Dijete> obrada;
    
    public ObradaDjeca(){
        obrada = new Obrada<>();
    }
    
    public List<Dijete> getDjeca(String uvjet, int brojRezultata){
        return HibernateUtil.getSession().createQuery(
                " from Dijete a where a.obrisano=false "
                        + " and concat(a.ime,' ',a.prezime) like :uvjet ")
                .setString("uvjet", "%" + uvjet + "%")
                .setMaxResults(brojRezultata)
                .list();
    }

}
