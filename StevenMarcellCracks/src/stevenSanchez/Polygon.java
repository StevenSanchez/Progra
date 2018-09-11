/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevenSanchez;


/**
 *
 * @author Steven
 */
public class Polygon {
    private Point [] arrayPolygon;
    
    public Polygon(int length){
        arrayPolygon = new Point [length];
    }
    
    public void setArrayPolygon(Point[] arrayPolygon) {
        this.arrayPolygon = arrayPolygon;
    }
        public Point[] getArrayPolygon() {
        return arrayPolygon;
    }
    
    public int length(){
     return arrayPolygon.length;
    }
    
    public Point returnPoint(int index){
    return arrayPolygon[index];
    }
    public void addPoint(Point point, int index){
        arrayPolygon[index] = point;
    }

    @Override
    public String toString() {
        return "Polygon: " + "arrayPolygon=" + arrayPolygon + '}';
    }

 
    
    
    
    
}
