/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta;

;

import napredakDjeteta.pomocno.HibernateUtil;
import napredakDjeteta.view.Izbornik;


/**
 *
 * @author Admin
 */
public class Start {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         new Izbornik().setVisible(true);

        HibernateUtil.getSession();
        
        
        
        //
        
//        Obrada<Smjer> o = new Obrada<>();
//        
//        Smjer s = new Smjer();
//        s.setNaziv("J17");
//        s.setCijena(BigDecimal.TEN);
//        
//        o.save(s);

//        ObradaPolaznik op = new ObradaPolaznik();
//        Polaznik p = new Polaznik();
//        
//        try {
//            op.spremi(p);
//        } catch (EdunovaException ex) {
//            System.out.println(ex.getMessage());
//        }
//        
//        Obrada<Polaznik> obrada = new Obrada<>();
//        obrada.save(p);
       
    }
    
}
