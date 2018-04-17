/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta;


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
        
        
        
      
       
    }
    
}
