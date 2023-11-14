/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W11
 */
public class MulliriKafes extends Paisja {
private String materiali;
public MulliriKafes(int nrSerik,String prodhuesi,String materiali){
    super(nrSerik,prodhuesi);
this.materiali=materiali;
}

    public String getMateriali() {
        return materiali;
    }

    public void setMateriali(String materiali) {
        this.materiali = materiali;
    }
    public String toString(){
    return "Mulliri i kafes prej"+materiali+super.toString();
    }




}
