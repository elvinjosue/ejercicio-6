/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MORALES
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
   
          //variables globales como acumulador para reutilizarlas
    int ejercicios;
static ejercicios tmp;
static ejercicios tmp_ant;
    
    public static void main(String[] args) {
       ArrayList< ejercicios> elementos = new ArrayList();//arreglo para almacenar los elementos ingresados
        
        Scanner scan = new Scanner(System.in);
        System. out.println("Cantidad de elementos que desea ingresar");
        int n = scan.nextInt();//numero de elementos a ingresar
        for(int i =0; i<n;i++)//ciclo para ingresar los datos segun elija el usuario
        {
        ejercicios e = new  ejercicios();
           System. out.println("Ingrese el nombre del elemento");
           e.nombre =scan.next();
              System. out.println(" ");
                 System. out.println("Ingrese la conductividad termica");
                 
            e.conductividad_termica=scan.nextFloat();
               System. out.println(" ");
                  System. out.println("Ingrese la conductividad electrica");
            e.conductividad_electrica=scan.nextFloat();
           elementos.add(e);
        }
        
       tmp=elementos.get(0);
       tmp_ant=tmp;
       int mayor_i=0;
       //recorrer arreglo con forEach para determinar el que tenga mayor conductividad
       elementos.forEach(item -> {
           if(item.conductividad_electrica> tmp.conductividad_electrica ){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       System.out.println("MAYOR CONDUCTIVIDAD ELECTRICA: ");
       System.out.println("Nombre: "+tmp.nombre);
        System.out.println("Conductividad electrica : "+tmp.conductividad_electrica);
        
        //recorrer arreglo con forEach para determinar el que tenga mayor termica
        elementos.forEach(item -> {
           if(item.conductividad_termica>tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
        System.out.println("MAYOR CONDUCTIVIDAD TERMICA: ");
       System.out.println("Nombre: "+tmp.nombre);
        System.out.println("Conductividad termica: "+tmp.conductividad_termica);
    
        //calculando el peor
        //recorrer arreglo con forEach para determinar el que tenga menor conductividad electrica y gtremica respectivamente
        elementos.forEach(item -> {
           if(item.conductividad_electrica<tmp.conductividad_electrica ){
           tmp_ant = tmp;
           tmp=item;
           }
       });
       System.out.println("MENOR CONDUCTIVIDAD ELECTRICA: ");
       System.out.println("Nombre: "+tmp.nombre);
        System.out.println("Conductividad electrica : "+tmp.conductividad_electrica);
        
       
        elementos.forEach(item -> {
           if(item.conductividad_termica<tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp=item;
           }
       });
        System.out.println("MENOR CONDUCTIVIDAD TERMICA: ");
       System.out.println("Nombre: "+tmp.nombre);
        System.out.println("Conductividad termica: "+tmp.conductividad_termica);
    }
    
}
