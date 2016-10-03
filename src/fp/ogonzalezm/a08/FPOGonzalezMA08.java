/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.ogonzalezm.a08;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class FPOGonzalezMA08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = menu();
        CalculaAreas(a);
    }
 public static int menu (){
     int opcion;
     Scanner entrada = new Scanner (System.in);
     do{
        System.out.println("**** Cálculo d areas ****");
        System.out.println("**** Menú: ****");
        System.out.println("Introduzca la opción deseada: ");
        System.out.println("1. Área de cuadrados. ");
        System.out.println("2. Área de círuclos. ");
        System.out.println("3. Área de triángulos. ");
        System.out.println("0. Salir ");
        opcion = entrada.nextInt();
    }while(opcion<0 || opcion>=4);
     return opcion;
 }
 public static double CalculaAreas(int o){
     double area = 0;
     switch (o){
         case 1:
             area = areaCuadrado();
             break;
         case 2:
             area = areaCirculo();
             break;
         case 3:
             area = areaTriangulo();
             break;
         default:
             mensajeSalida();
             
     }
     return area;
 }
 public static double areaCuadrado(){
     double l, a;
     Scanner entrada = new Scanner (System.in);
     System.out.println("Escriba el lado del cuadrado");
     l = entrada.nextInt();
     a = l*l;
     System.out.println("El area del cuadrado es: " +a);
     return a;
 }
 public static double areaCirculo(){
     double r, a;
     double pi = 3.1416;
     Scanner entrada = new Scanner (System.in);
     System.out.println("Escriba el radio del circulo");
     r = entrada.nextInt();
     a = Math.pow(r,2)*pi;
     System.out.println("El area del circulo es: " +a);
     return a;
 }   
 public static double areaTriangulo(){
     double b,h,a;
     Scanner entrada = new Scanner (System.in);
     System.out.println("Escriba la base del trangulo");
     b = entrada.nextInt();
     System.out.println("Escriba la altura del triangulo");
     h = entrada.nextInt();
     a = (b*h)/2;
     System.out.println("El area del triangulo es: " +a);
     return a;
 }
 public static void mensajeSalida(){
     System.out.println("Gracias por participar");
 }


}
