/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W11
 */
public abstract class PaisjaElektrike extends Paisja {
    private double voltazha;
    private char kategoriaShpenzuese;
public PaisjaElektrike(int nrSerik,String prodhuesi,double voltazha,char kategoriaShpenzuese){
super(nrSerik,prodhuesi);
this.voltazha=voltazha;
this.kategoriaShpenzuese=kategoriaShpenzuese;
}

    public double getVoltazha() {
        return voltazha;
    }

    public void setVoltazha(double voltazha) {
        this.voltazha = voltazha;
    }

    public char getKategoriaShpenzuese() {
        return kategoriaShpenzuese;
    }

    public void setKategoriaShpenzuese(char kategoriaShpenzuese) {
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }
public abstract boolean kaBateri();

public String toString(){
return super.toString()+voltazha+"-"+kategoriaShpenzuese;
        }


}
