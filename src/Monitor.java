import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
public class Monitor extends JFrame{
    
    private Dimension dim;
    public static int tam;
    public static ArrayList<Proceso> procesos = new ArrayList<Proceso>();
    public static ArrayList<Particion> memoria = new ArrayList<Particion>();
    public static ArrayList<Integer> borrar = new ArrayList<Integer>();
    private static Semaphore mutex = new Semaphore(2);
    private static Semaphore mutex_asig = new Semaphore(1);
    public static Memoria display;
    Monitor(){
        super("Gestión de memora Variable");
        //rellenar();
        memoria.add(new Particion(0,tam,null));
        gestionar();
        dim = new Dimension(800,800);
        display = new Memoria(tam);
        this.setSize(dim);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.add(display);
        this.setVisible(true);
        this.setResizable(false);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void prueba(){
        //mostrar();
        //System.out.println("procesows pendientes: "+procesos.size());
    }
     
    public static void rellenar()
    {
        procesos.add(new Proceso(20,100,"S.O"));
        procesos.add(new Proceso(20,3, "0"));
        procesos.add(new Proceso(30,4,"1"));
        procesos.add(new Proceso(40,5,"2"));
        procesos.add(new Proceso(20,6,"3"));
        procesos.add(new Proceso(50,7,"4"));
    }
    public static void gestionar(){
        int particion;   
        int size = procesos.size();
        Proceso p;
        try {
            mutex.acquire();
            
        for (int i = 0; i<size; ++i)
        {
            p = procesos.get(i);
            if((particion = asignar(p)) != -1) 
            {
                particionar(particion, p);
                borrar.add(0, i);
            }
        }
        borrar();
        mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void pintar(){
        try {
            display.repaint();
            gestionar();
        } catch (Exception ex) {
            Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //encuentra una particion lo suficientemente grande para el proceso
    public static int asignar(Proceso p){
        int tam = memoria.size();
        for (int i=0; i<tam; ++i)
            if ((memoria.get(i).getProc() == null) && memoria.get(i).getTam()>= p.getTamanio())
                return i;
        return -1;
    }
    
    public static void particionar(int particion, Proceso p){
        try {
            mutex.acquire();
            Particion par = memoria.get(particion);
            Particion nueva = new Particion(par.getInicio(), p.getTamanio(), p);
            p.setParticion(nueva);
            Particion resto = new Particion(nueva.getFin(), par.getTam()- nueva.getTam(), null);
            memoria.add(particion,nueva);
            memoria.add(particion+1,resto);
            memoria.remove(particion+2);
            nueva.getProc().start();
            mutex.release();
        } catch (Exception ex) {
            Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void mostrar()
    {
        try {
            mutex.acquire();
            for(Particion par: memoria)
        {
            System.out.print("n part:"+memoria.size());
            par.mostrar();
        }
            mutex.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public static void borrar(){
       for (int i: borrar)
       {
           //System.out.println("borrar prooceso: "+ i);
           procesos.remove(i);
       }
       borrar.clear();
   }
   
   public static void Liberar(){
       int size = memoria.size();
       Particion par, next_part;
       try {
            mutex.acquire();
            for (int i = 0; i<size-1; ++i){
                if (((par = memoria.get(i)).getProc() == null) && ((next_part = memoria.get(i+1)).getProc() == null) ){
                    //System.out.println("libre par "+(i)+" priceso "+par.getProc());
                    //System.out.println("libre par "+(i+1)+" priceso "+next_part.getProc());
                    par.setFin(next_part.getFin());
                    par.setTam(par.getTam() + next_part.getTam());
                    memoria.remove(i+1);
                    //System.out.println("tam par "+i+" priceso "+par.getTam());
                    size = memoria.size();
                }
            }
            mutex.release();
        } catch (Exception ex) {
            Logger.getLogger(Monitor.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
    public static void activar()
    {
        for (Particion particion : memoria)
            if (particion.getProc()!=null)
                particion.getProc().start();
    }
}