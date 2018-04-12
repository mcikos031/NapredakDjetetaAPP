/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napredakDjeteta.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Polaznik
 */
@MappedSuperclass
public abstract class Osoba extends Entitet {



    private String oib;
    private String ime;
    private String prezime;
    private String email;
    private boolean spol;

    public Osoba() {
    }

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSpol() {
        return spol;
    }

    public void setSpol(boolean spol) {
        this.spol = spol;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
;

}
