/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevenSanchez;

/**
 *@version 9 Setiembre 2018
 * @author StevenSanchez & Marcell Granados
 */
public class line {
    private Point pointStart = new Point();
    private Point pointEnd = new Point();
    
    public line() {
    }
    public line(Point pointStart,Point pointEnd) {
        this.pointStart=pointStart;
        this.pointEnd=pointEnd;
    }

    public Point getPointStart() {
        return pointStart;
    }
    public void setPointStart(Point pointStart) {
        this.pointStart = pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }
    public void setPointEnd(Point pointEnd) {
        this.pointEnd = pointEnd;
    }

    @Override
    public String toString() {
        return "line{" + "pointStart=" + pointStart + ", pointEnd=" + pointEnd + '}';
    }
}
