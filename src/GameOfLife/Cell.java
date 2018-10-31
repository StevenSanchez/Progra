package GameOfLife;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven
 */
public class Cell {
    private char cell;

    public Cell() {
        cell = '■';
    }

    public Cell(char cell) {
        cell = '¤';
        this.cell = cell;
    }
    
    public char getCell() {
        return cell;
    }

    public void setCell(char cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "" + cell;
    }
    
    
    
    
}
