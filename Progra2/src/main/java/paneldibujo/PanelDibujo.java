
package paneldibujo;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;



public class PanelDibujo extends JPanel{
    
    
    public int option;
    public PanelDibujo(int option)
    {
        this.option = option;
    }
    
    
    public void Draw1(Graphics g, int anchura, int altura){
        for(int i = 0; i < anchura; i += 10)
        {
            g.drawLine(i, altura, anchura, 0);
        }
    }
    
    public void Draw2(Graphics g, int anchura, int altura){
        
        int x = anchura-20;
        g.setColor(Color.red);
        for(int y = 10; y < altura+160; y += 8)
        {
            g.drawLine(0,y-40, anchura, y);
        }
        
        //lineas azules
        g.setColor(Color.blue);
        for(int y = 10; y < altura+380; y += 18)
        {
            g.drawLine(x,0, anchura, y+30);
            x -=10;
        }
    }
    
    public void Draw3(Graphics g, int anchura, int altura){
        
        int x = anchura-20;
        g.setColor(Color.red);
        for(int y = 10; y < altura+100; y += 10)
        {
            g.drawLine(x-20,0, anchura, y);
            x -= 20;
        }
        
        //g.drawLine(anchura-20,0, anchura, 10);
    }
    
    
    
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura = getWidth();
        int altura = getHeight();
        
        if(this.option == 0)
        {
            this.Draw1(g, anchura, altura);
        }
        else if(this.option == 1)
        {
            this.Draw2(g, anchura, altura);
        }
        else
        {
            this.Draw3(g, anchura, altura);
        }        
    }
    
}
