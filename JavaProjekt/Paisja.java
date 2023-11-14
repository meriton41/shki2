/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W11
 */
public class Paisja {
private int nrSerik;
private String prodhuesi;
public Paisja(int nrSerik,String prodhuesi){
this.nrSerik=nrSerik;
this.prodhuesi=prodhuesi;
}

    public int getNrSerik() {
        return nrSerik;
    }

    public String getProdhuesi() {
        return prodhuesi;
    }

    public void setProdhuesi(String prodhuesi) {
        this.prodhuesi = prodhuesi;
    }

public String toString(){
return nrSerik+":"+prodhuesi;
}
public boolean equal(Object o){
if(o instanceof Paisja){
Paisja p=(Paisja)o;
    if(p.getNrSerik()==nrSerik){
    return true;
    }

  }
return false;
}  
}

