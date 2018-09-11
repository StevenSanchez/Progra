/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuales.SanchezSteven.Array.arrayBrocas;

/**
 *@version 30 agos 2018
 * @author Steven Sanchez
 */
public class Broca {
    private String broca;

    public Broca() {
    }

    public Broca(String broca) {
        this.broca = broca;
    }

    public String getBroca() {
        return broca;
    }

    public void setBroca(String broca) {
        this.broca = broca;
    }

    @Override
    public String toString() {
        return "Broca: " + broca;
    }
    
    
}
