import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class Memoria extends JPanel{
    private static int height = 650;
    private static int x_lateral = 250;
    private Color colors[] = {Color.RED, Color.DARK_GRAY, Color.MAGENTA};
    private static int idcolor = 0; 
    private double unidad; 
    Memoria(int tam){
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setBounds(300, 10, x_lateral, height+10);
        unidad =(double)height/(double)tam;
        //System.out.println(unidad);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(10, 10, 200, height);
        int size = Monitor.memoria.size();
        Particion particion;
        int title;
        for (int i = 0; i<size; ++i)
        {
            title = 800;
            particion = Monitor.memoria.get(i);
            if(particion.getProc() == null)
                g.setColor(Color.DARK_GRAY);
            else{
                g.setColor(Color.BLUE);
                title = particion.getInicio()+particion.getTam()/2;
            }
            g.fillRect(10, (int)(unidad*particion.getInicio())+8, 200,(int)(unidad*particion.getTam())-2);
            g.setColor(Color.RED);
            g.setFont(new Font("Serif", Font.PLAIN, 12));
            if(particion.getProc() != null)
                g.drawString("proceso "+particion.getProc().getname()+", "+particion.getTam()+" MB", 50,(int)(unidad*title));
        }
    }
    /*public void paint(Graphics g){
        //System.out.println("paint pintar");
        g.setColor(Color.CYAN);
        g.fillRect(10, 10, 200, height);
        g.setColor(Color.BLACK);
        for (Particion particion: Monitor.memoria){
            
            //g.setColor(colors[id]);
            g.drawRect(10, particion.getInicio(), 200,(int)(unidad*particion.getFin())-2);
            //g.setFont(new Font("Serif", Font.PLAIN, 12));
            //g.setColor(Color.BLACK);
            //g.drawString("proceso 0 \\n 50 MB", 50, 50);
            ++id;
        }   
    }*/
 
    /*public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(10, 10, 200, height);
        g.setColor(Color.red);
        g.fillRect(10, 20, 200,(int)(unidad*100)-2);
        g.setFont(new Font("Serif", Font.PLAIN, 12));
        g.setColor(Color.BLACK);
        g.drawString("proceso 0 \\n 50 MB", 50, 50);
    }*/
}
