/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.model;

import com.sun.glass.ui.View;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Polaznik
 */
@Entity
@Table
public class Profesor extends Osoba implements Serializable {
    
    public Profesor(){
    super();
    }
    
    public Profesor(String ime, String prezime){
        super(ime,prezime);
    }
    
}
