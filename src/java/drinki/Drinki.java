package drinki;
// Generated 2015-06-18 15:49:25 by Hibernate Tools 4.3.1



/**
 * Drinki generated by hbm2java
 */
public class Drinki implements java.io.Serializable {


     private int id;
     private String nazwa;
     private String pochodzenie;
     private String opis;
     private String skladniki;
     private String nprzyg;
     private String npodan;
     private String przygotowanie;
     private String email;
     private String fotos;
     private String fotom;
     private String fotob;

    public Drinki() {
    }

	
    public Drinki(int id) {
        this.id = id;
    }
    public Drinki(int id, String nazwa, String pochodzenie, String opis, String skladniki, String nprzyg, String npodan, String przygotowanie, String email, String fotos, String fotom, String fotob) {
       this.id = id;
       this.nazwa = nazwa;
       this.pochodzenie = pochodzenie;
       this.opis = opis;
       this.skladniki = skladniki;
       this.nprzyg = nprzyg;
       this.npodan = npodan;
       this.przygotowanie = przygotowanie;
       this.email = email;
       this.fotos = fotos;
       this.fotom = fotom;
       this.fotob = fotob;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNazwa() {
        return this.nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getPochodzenie() {
        return this.pochodzenie;
    }
    
    public void setPochodzenie(String pochodzenie) {
        this.pochodzenie = pochodzenie;
    }
    public String getOpis() {
        return this.opis;
    }
    
    public void setOpis(String opis) {
        this.opis = opis;
    }
    public String getSkladniki() {
        return this.skladniki;
    }
    
    public void setSkladniki(String skladniki) {
        this.skladniki = skladniki;
    }
    public String getNprzyg() {
        return this.nprzyg;
    }
    
    public void setNprzyg(String nprzyg) {
        this.nprzyg = nprzyg;
    }
    public String getNpodan() {
        return this.npodan;
    }
    
    public void setNpodan(String npodan) {
        this.npodan = npodan;
    }
    public String getPrzygotowanie() {
        return this.przygotowanie;
    }
    
    public void setPrzygotowanie(String przygotowanie) {
        this.przygotowanie = przygotowanie;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFotos() {
        return this.fotos;
    }
    
    public void setFotos(String fotos) {
        this.fotos = fotos;
    }
    public String getFotom() {
        return this.fotom;
    }
    
    public void setFotom(String fotom) {
        this.fotom = fotom;
    }
    public String getFotob() {
        return this.fotob;
    }
    
    public void setFotob(String fotob) {
        this.fotob = fotob;
    }




}

