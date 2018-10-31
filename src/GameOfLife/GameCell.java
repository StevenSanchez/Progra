package GameOfLife;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steven Sanchez Y Leo Gomez
 */
public class GameCell {
    private Cell cell;
    private boolean status;

    public GameCell(Cell cell, boolean status) {
        char i = ' ';
        cell = new Cell(i);
        status = true;
        this.cell = cell;
        this.status = status;
    }
        
    public GameCell() {
        this(new Cell(),false);
    }
    
    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String imprimir = " | " + cell;
        return imprimir;
    }



    
    
}
