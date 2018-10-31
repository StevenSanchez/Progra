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
public class Tablero {
    
    private final int MINIMO = 8;
    private final int MAXIMO = 20;
    Cell [][] tablero;

    public Tablero(Cell[][]matriz, int size) {
      if(size >= MINIMO && size <= MAXIMO ){
        matriz = new Cell [size][size];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= new Cell();
            }
        }
        tablero = matriz;
     }

    }
    public void imprimirMatriz(){
         String matriz = "";
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
               if (j == tablero.length-1){
                   matriz +=tablero[i][j] + "\t" + "\n";
                   //System.out.print("\n");
            }else{ matriz +=tablero[i][j] + "\t";}
  
                       
                
            } 
        }
        System.out.println(matriz);
        JOptionPane.showMessageDialog(null, matriz, "El Juego de la Vida", JOptionPane.PLAIN_MESSAGE);
    }
    public void addCell (int rows, int columnsj){
        char x = ' ';
        tablero[rows][columnsj]= new Cell(x);
    
    }
    
}
