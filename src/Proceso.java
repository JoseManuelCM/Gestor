import java.util.concurrent.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Proceso extends Thread{
    private int tamanio;
    private int time;
    private String name;
    private Particion particion;

    public Proceso(int tamanio, int time, String name) {
        this.tamanio = tamanio;
        this.time = time;
        this.name = name;
        this.particion = null;
    }
    
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void mostrar()
    {
        System.out.println("proceso: "+name+  " con tamaño: "+tamanio);
    }

    public Particion getParticion() {
        return particion;
    }

    public void setParticion(Particion particion) {
        this.particion = particion;
    }
    
    @Override
    public void run(){
       // System.out.println("inicia prooceso: "+name);
        try {
            //Dibujar
            sleep(time*1000);
            //System.out.println("Termina prooceso: "+name);
            particion.setProc(null);
            //juntar particiones y redibujar
            Monitor.Liberar();
            Monitor.pintar();
            //Monitor.mostrar();
        } catch (InterruptedException ex) {
             System.out.println("acabo antes" );
        }
    }

    public String getname() {
        return name;
    }
}
