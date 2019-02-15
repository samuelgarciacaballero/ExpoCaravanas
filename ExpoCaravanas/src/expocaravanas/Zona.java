/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;
import java.util.Scanner;

public class Zona {
    int entradas, pedido;
    Scanner sc = new Scanner(System.in);

    public Zona() {
    }

    public Zona(int entradas) {
        this.entradas = entradas;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }
    
    public void Venderentrada(){
        System.out.println("\n¿Cuantas entradas quieres?");
        pedido=sc.nextInt();
        entradas = entradas - pedido;
        if(pedido>entradas){
            System.out.println("\nNo hay tantas entradas...");
        } else{
        if(entradas<=0){
            System.out.println("\nNo quedan entradas suficientes entradas...");
        } else{    
        System.out.println("\nQuedan "+entradas+" entradas de esta zona.");
        }
    }
    
    }
    
}
