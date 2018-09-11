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
public class Triangle {
    private Point point1=new Point(); 
    private Point point2=new Point();
    private Point point3=new Point();

    public Triangle() {
    }
    public Triangle(Point point1,Point point2,Point point3) {
        this.point1=point1;
        this.point2=point2;
        this.point3=point3;
    }

    public Point getPoint1() {
        return point1;
    }
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + '}';
    }
}
