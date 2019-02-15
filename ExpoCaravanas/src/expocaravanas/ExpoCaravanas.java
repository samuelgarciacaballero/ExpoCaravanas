
package expocaravanas;
import java.util.Scanner;

public class ExpoCaravanas {

    
    public static void main(String[] args) {
       
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona (25);
        
        
        int opcion=0, totalentradas=0, opcion2=0, pedido;
        totalentradas= vip.getEntradas() + principal.getEntradas() + compraventa.getEntradas();
        
        while(opcion!=3){
        System.out.println("\n\nEscribe el número de la opción que quieres realizar:");
        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir");
        Scanner sc = new Scanner(System.in);
        try{
        opcion =sc.nextInt();}
        catch(Exception e){
            System.out.println("*ERROR*");
            opcion= -3;
        }
        
        
        
        switch(opcion){
            case 1:
                System.out.println("\n\nQuedan "+totalentradas+" disponibles en total.");
                System.out.println(principal.getEntradas()+" en la Zona Principal");
                System.out.println(compraventa.getEntradas()+" en la Zona Compra/Venta");
                System.out.println(vip.getEntradas()+" en la Zons Vip");
                break;
                
            case 2:
                System.out.println("\n\n¿De que zona quieres comprar entrada?");
                System.out.println("1. Zona Principal");
                System.out.println("2. Zona Compra/Venta");
                System.out.println("3. Zona Vip");
                try {
                    opcion2 = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("\n*ERROR*");
                }
                switch(opcion2){
                    case 1: principal.Venderentrada(); break;
                    case 2: compraventa.Venderentrada(); break;
                    case 3: vip.Venderentrada(); break;
                }
            case 3: break;      
        }
        }
        
        
        }
                
                
            
        
        
    
    

