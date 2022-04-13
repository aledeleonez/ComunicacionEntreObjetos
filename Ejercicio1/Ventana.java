import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class Ventana implements MouseInputListener{

    JFrame ventana;
    int numero;

    public Ventana(int numero) {
        this.numero = numero;
        ventana = new JFrame("Ventana número " + numero);
        ventana.setSize(300,300);
        ventana.setVisible(true);
    }

    public void setLocation(int x, int y) {
        this.ventana.setLocation(x, y);
    }

    public void addMouseListener(MouseInputListener listener) {
        this.ventana.addMouseListener(listener);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(String.format("mousePressed en ventana número %d en X: %d Y: %d ", numero, e.getX(), e.getY()));
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(String.format("mouseReleased en ventana número %d en X: %d Y: %d ", numero, e.getX(), e.getY()));
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
    
}
