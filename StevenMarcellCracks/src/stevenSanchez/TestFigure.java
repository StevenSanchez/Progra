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
        Line line = new Line(new Point (20, 20), new Point (100, 100));
        Polygon polygonLine = new Polygon(2);
        polygonLine.addPoint(line.getPointStart(), 0);
        polygonLine.addPoint(line.getPointEnd(), 1);
        
        //Segunda prueba dibujar una linea
        
        //Segunda prueba dibujar una linea    
        
        JFrame jframe = new JFrame("Dibujador de Poligonos");
        Paint paint = new Paint(2);
        paint.add(polygonPoint, 0);
        paint.add(polygonLine, 1);
        
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
