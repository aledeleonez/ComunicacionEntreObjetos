import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;



public class Ventana extends MouseInputAdapter {

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
        super.mouseClicked(e);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseDragged(e);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseEntered(e);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseMoved(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mousePressed(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        super.mouseReleased(e);
    }


    
    
    
}
