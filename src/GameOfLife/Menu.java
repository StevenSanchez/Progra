package GameOfLife;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Menu {
    public void iniciarMenu(){
        Cell[][]matriz = null;
        JOptionPane.showMessageDialog(null, "Bienvenidos al juego de la vida \n \nCreadores \nSteven Sanchez \nLeonardo Gomez", "El Juego de la Vida", JOptionPane.INFORMATION_MESSAGE);
        String [] opcion = {"8","9","10","11","12","13","14","15","16","17","18","19","20"};
         
        int opcionElegida=JOptionPane.showOptionDialog(null, "Eliga el tamaño de la matriz cuadrada", "El Juego de la Vida", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
        opcionElegida=Integer.parseInt(opcion[opcionElegida]);
        System.out.println(opcionElegida);
        Tablero tablero = new Tablero(matriz,opcionElegida);
        tablero.imprimirMatriz();
        int continuar = JOptionPane.showConfirmDialog(null, "Desea agregar valores a la matriz?", "El Juego de la Vida", JOptionPane.YES_NO_OPTION);
        while (continuar == 0) {
        int posicion =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion filas"));
        int posicion2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion columnas"));
        tablero.addCell(posicion, posicion2);
        tablero.imprimirMatriz();
        continuar = JOptionPane.showConfirmDialog(null, "Desea agregar valores a la matriz?", "El Juego de la Vida", JOptionPane.YES_NO_OPTION);
        }

        
    }
    
}
