package stevenSanchez;

/**
 * Clase que realiza la creacion de poligonos de puntos
 * y dibuja las figuras al unir con lineas cada punto
 *
 * @version 10 septiembre 2018
 * @author Denis González Herrera
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

 public class TestFigure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primera prueba dibujar un punto
        Point p1 = new Point(10, 10);
        Polygon polygonPoint = new Polygon(1);
        polygonPoint.addPoint(p1, 0);
        
        //Segunda prueba dibujar una linea
        Line line = new Line(new Point (205, 205), new Point (300, 300));
        Polygon polygonLine = new Polygon(2);
        polygonLine.addPoint(line.getPointStart(), 0);
        polygonLine.addPoint(line.getPointEnd(), 1);
        
        //Tercera prueba dibujar un Triangulo
        Triangle triangle = new Triangle(new Point (50,100), new Point (100,150), new Point (75, 0));
        Polygon polygonTriangle = new Polygon(3);
        polygonTriangle.addPoint(triangle.getPoint1(), 0);
        polygonTriangle.addPoint(triangle.getPoint2(), 1);
        polygonTriangle.addPoint(triangle.getPoint3(), 2);
        
        //Cuarta prueba dibujar un rectangulo   
       
        Rectangle rectangle = new Rectangle(new Point (100,100), new Point (300,100), new Point (300, 200), new Point (100,200));
        Polygon polygonRectangle = new Polygon(4);
        polygonRectangle.addPoint(rectangle.getPoint1(), 0);
        polygonRectangle.addPoint(rectangle.getPoint2(), 1);
        polygonRectangle.addPoint(rectangle.getPoint3(), 2);
        polygonRectangle.addPoint(rectangle.getPoint4(), 3);
        
        
        
        JFrame jframe = new JFrame("Dibujador de Poligonos");
        Paint paint = new Paint(4);
        paint.add(polygonPoint, 0);
        paint.add(polygonLine, 1);
        paint.add(polygonTriangle, 2);
        paint.add(polygonRectangle, 3);
        
        jframe.add(paint);
        
        jframe.setSize(500,500);
        jframe.setVisible(true);
        jframe.addWindowListener( new WindowAdapter() { 
        @Override
        public void windowClosing( WindowEvent evt ) { 
            System.exit( 0 ); 
        } 
        } ); 
        
    }
    
    
}
