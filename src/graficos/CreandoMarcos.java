package graficos;
import javax.swing.*;


public class CreandoMarcos {
    public static void main(String[] args) {
        miMarco marco1 = new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class miMarco extends JFrame {
        public miMarco() {
        /*
          setSize(600,400);
         setLocation(600,400);
        */
            setBounds(600, 400, 600, 400);
            setResizable(false); //para que no se pueda redimensionar
            //setExtendedState(Frame.MAXIMIZED_BOTH);

            setTitle("Mi ventana");
        }
    }
}


