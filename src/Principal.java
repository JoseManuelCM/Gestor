/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Principal {
    public static int procesos[][] = new int[15][2];
    public static int particiones[][] = new int[15][2];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Ventana ventana = new Ventana();
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);       
    }  
    
    public static void mostrar(int size){
        System.out.println("proceso "+0+"tam "+procesos[0][0]+"time"+ procesos[0][1]);
        for (int i = 1; i<size; ++i)
        {
            System.out.println("proceso "+i+"tam "+procesos[i][0]+"time"+ procesos[i][1]);
        }
    }
    
}
