package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 * @author JOSEPH
 */
public class Main {
    public static void main (String[] args){
        /* comentario en java */
       //int a= 1;
       // System.out.println("Ingresar nombre ");
       // String nombre = cargarString();
       // mostrarString(nombre);
       // calcularNumeroMayor(2,4,1,3);
       // Double promedio= Double.valueOf(1/4/3);
       // System.out.print( promedio);
       // Boolean es_multiplo = (73 % 2 == 0);
       /*
        Boolean es_multiplo = (Double.valueOf(11)/2== Math.round(Double.valueOf(11)/2));
        if (es_multiplo){
        mostrarString("Es multiplo");
        }else{
        mostrarString("No es multiplo");
        }
       */
       int iteracion=0;
       while (iteracion<100){
           
           if (iteracion%2==0){
           System.out.println(iteracion);
           }
           iteracion++;

       }
       
       do{
           mostrarString(""+iteracion);
           break;
       }while(true);
       
       
       
    }
    /**
     *
     * @return String
     */
     public static String cargarString (){
            Scanner scan = new Scanner(System.in);
            String str1 = scan.nextLine();
            return str1;
     }
     /**
      * 
      * @return Integer 
      */
    public static Integer cargarEntero (){
            Scanner scan = new Scanner(System.in);
            Integer str1 = scan.nextInt();
            return str1;
     }
    /**
     * The string to be printed
     * @param text String
     */
    public static void mostrarString (String text ){
            System.out.println(text);
    }
    
    /**
     * Calcula el mayor de los 4 numeros 
     * @param numero1 int 
     * @param numero2 int
     * @param numero3 int 
     
     */
    public static void calcularNumeroMayor(int numero1, int numero2, int numero3, int numero4){
        //
        int numeros []= {numero1,numero2, numero3,numero4}; 
        int mayor = 0;
        for (int i=0; i<4; i++){           
            for (int j=0; j<4; j+=1){
                if(numeros[j] < numeros[i] && mayor < numeros[i] && i != j ){
                    mayor = numeros[i];
                    System.out.println("Mayor "+numeros[i]);
                }
            }
        }
        System.out.println("El mayor es :"+ mayor);
    }
    
    

     
}
