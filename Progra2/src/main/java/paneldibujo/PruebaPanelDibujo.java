
package paneldibujo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PruebaPanelDibujo {
    
    
    
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setBounds(450, 100, 500, 500);
        app.setTitle("Aplicacion");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //options
        String[] buttons = { "Lineas 1", "Lineas 2", "Lineas 3" };

    	int rc = JOptionPane.showOptionDialog(null, "¿Que desea dibujar?", "Dibujos",
        JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[2]);
        
        if(rc == 0)
        {
            PanelDibujo panel = new PanelDibujo(rc);
            app.add(panel);
        }
        else if(rc == 1)
        {
            PanelDibujo panel = new PanelDibujo(rc);
            app.add(panel);
        }
        else
        {
            PanelDibujo panel = new PanelDibujo(rc);
            app.add(panel);
        }
        app.setSize(250, 250);
        app.setVisible(true);
    }
}
