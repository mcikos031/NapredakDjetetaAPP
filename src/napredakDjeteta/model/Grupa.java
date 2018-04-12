/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



/**
 *
 * @author Polaznik
 */

@Entity
@Table
public class Grupa extends Entitet implements Serializable {
    
    
    private String naziv;
    private int brojDjece;
    
    @ManyToOne
    private Profesor profesor;
    
    @ManyToMany
    private List<Dijete> djeca = new ArrayList<>();
    
    

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojDjece() {
        return brojDjece;
    }

    public void setBrojDjece(int brojDjece) {
        this.brojDjece = brojDjece;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Dijete> getDjeca() {
        return djeca;
    }

    public void setDjeca(List<Dijete> djeca) {
        this.djeca = djeca;
    }
    
    @Override
    public String toString() {
        return getNaziv();
    }

    
    
    
    
    
}
