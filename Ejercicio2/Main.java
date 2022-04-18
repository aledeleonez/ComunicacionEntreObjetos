
//Alejandro de Leon 130602
public class Main {
    public static void main(String[] args) throws Exception {
        
        //Ventana 1
        Ventana ventana1 = new Ventana(1);
        ventana1.setLocation(250, 100);
        ventana1.addMouseListener(ventana1);

        //Ventana 2
        Ventana ventana2 = new Ventana(2);
        ventana2.setLocation(560, 100);
        ventana2.addMouseListener(ventana2);

        //Ventana 3
        Ventana ventana3 = new Ventana(3);
        ventana3.setLocation(250, 420);
        ventana3.addMouseListener(ventana3);

        //Ventana 4
        Ventana ventana4 = new Ventana(4);
        ventana4.setLocation(560, 420);
        ventana4.addMouseListener(ventana4);

        
        
        
    }
}
