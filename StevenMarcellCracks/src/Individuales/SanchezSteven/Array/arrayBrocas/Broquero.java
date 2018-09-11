/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuales.SanchezSteven.Array.arrayBrocas;

import java.util.Arrays;

/**
 *
 * @author Steven
 */
public class Broquero {
    private Broca [] broquero;

    public Broquero() {
        broquero = new Broca [10];
        broquero[0] = new Broca ("H3");
        broquero[1] = new Broca ("H3");
        broquero[2] = new Broca ("H4");
        broquero[3] = new Broca ("H4");
        broquero[4] = new Broca ("H5");
        broquero[5] = new Broca ("H5");
        broquero[6] = new Broca ("H6");
        broquero[7] = new Broca ("H6");
        broquero[8] = new Broca ("S1");
        broquero[9] = new Broca ("S2");
        
    }

    public Broca[] getBroquero() {
        return broquero;
    }

    public void setBroquero(Broca[] broquero) {
        this.broquero = broquero;
    }
    
    public int tamaño(){
    return broquero.length;
    }
    
    public void addBroca(Broca broca, int posicion){
    broquero[posicion] = broca; 
    }
    
    public Broca returnBroca(int posicion){
    return broquero[posicion];
    }

    @Override
    public String toString() {
        return "Broquero: " + Arrays.toString(broquero);
    }
public void imprimir(){
        for (Broca broquero1 : broquero) {
            System.out.println(broquero1);
        }
}
    

    
    
}
