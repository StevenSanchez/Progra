package stevenSanchez;

/**
 * Clase que dibuja las figuras al unir con lineas cada punto
 *
 * @version 10 septiembre 2018
 * @author Denis González Herrera
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class Paint extends JPanel{
  Polygon [] poligono;
  Polygon fig;
  
  public Paint(int tam){
    this.poligono = new Polygon[tam];
  }
  
  public void add(Polygon p, int i){
      poligono [i] = p;
  }
  

  @Override
 /*// public void paintComponent(Graphics g){
      
      for (Polygon poligono1 : poligono) {
          fig = (Polygon) poligono1;
          int tan = fig.length() - 1;
        for (int a = 0; a< tan; a++){
              Point pi = fig.returnPoint(a);
              Point pf = fig.returnPoint(a+1);
              g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());
          } Point pi = fig.returnPoint(0);
          Point pf = fig.returnPoint(tan);
          g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());
      }
  }  */
    public void paintComponent(Graphics g){
      
    for (int i = 0; i < poligono.length; i++) {
        fig = (Polygon) poligono[i];
      
        int tan = fig.length()-1;
        for (int a = 0; a < tan; a++){
            Point pi = fig.returnPoint(a); 
            Point pf = fig.returnPoint(a+1);
            g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());
        }    

        Point pi = fig.returnPoint(0); 
        Point pf = fig.returnPoint(tan);
       g.drawLine(pi.getX(), pi.getY(), pf.getX(), pf.getY());

}
    }
}