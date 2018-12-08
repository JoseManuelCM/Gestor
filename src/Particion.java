
public class Particion {
    private int inicio;
    private int fin;
    private int tam;
    private Proceso proc;

    public Particion(int inicio, int tam, Proceso proc) {
        this.inicio = inicio;
        this.tam = tam;
        this.proc = proc;
        this.fin = inicio + tam;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Proceso getProc() {
        return proc;
    }

    public void setProc(Proceso proc) {
        this.proc = proc;
    }
    
    public void mostrar()
    {
        System.out.print("Particion de tamaño: "+tam);
        if (proc!= null){
            System.out.print(" con proceso: ");
            proc.mostrar();
        }else{
            System.out.println("");
        }
    }
    
    public void mostrar(int i)
    {
        System.out.println("Particion de tamaño: "+tam+" inicio "+inicio+" fin "+fin);
    }
    
}
