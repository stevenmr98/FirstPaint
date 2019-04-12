package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LinesGUI extends JPanel {

    public LinesGUI() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.black);
    }//constructor

    private void draw(Graphics g) {
        // dibujar los ejes del plano cartesiano

        for (int i = 0; i <= 1500; i++) {
            g.setColor((new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256))));
            //valores para que las lineas adopten de manera random
            double x = (int) (Math.random() * 1000);
            double y = (int) (Math.random() * 1000);
            double x0 = (int) (Math.random() * 1000);
            double y0 = (int) (Math.random() * 1000);

            linearFunction(g, x0, y0, x, y);
            //linearFunction(g, 0, 0, 100, 600);
        }//fin for i

    } // draw

    // funcion lineal f(x) = m x + b
    // x1 y x2 es el rango en el que se graficara la funcion
    private void linearFunction(Graphics g, double x0, double y0, double x1, double y1) {

        double y = 0;
        //double punto;

        //calculo de pendiente y del termino b (interseccion con eje y)
        double m = (y1 - y0) / (x1 - x0);
        double b = y0 - ((y0 - y1) / (x0 - x1)) * x0;

        for (double x = x0; x <= x1 && y <= y1; x += 1) {

            // for(double x = x0; x <= x1; x += 0.1){
            y = (m * x + b);// * 10; // se multiplica por 10 para escalar el punto a representar en pantalla
            //punto = x;// * 10;
            g.drawLine((int) coord_x(x), (int) coord_y(y), (int) coord_x(x), (int) coord_y(y));
            g.drawLine((int) coord_x(x), (int) y, (int) coord_x(x), (int) y);
        } // for
    }// linearFunction

    private double coord_x(double x) {
        double newX = (double) this.getWidth() - x;
        return newX;
    }//coor_x

    private double coord_y(double y) {
        double newY = (double) this.getHeight() - y;
        return newY;
    }//coor_y

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // se llama al meto draw
        draw(g);

    }
}
