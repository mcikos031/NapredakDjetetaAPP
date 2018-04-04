/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Polaznik
 */
@Entity
@Table
public class Dijete extends Osoba implements Serializable {

    

    public Dijete() {
        super();
    }

    public Dijete(String ime, String prezime) {
        super(ime, prezime);
    }

    

}
