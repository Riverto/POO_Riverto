/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonos;
import java.util.Scanner;

/**
 *
 * @author Riverto
 */
public class Telefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bool=true;
        long[] telefonos = new long[10];
        llenarTelefono(telefonos);
        while(bool){
            mostrarNumero(telefonos);
            bool = pedirDato3();
        }
        System.out.println("Fin del programa.");
    }
    public static long[] llenarTelefono(long[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Ingrese el numero para la posicion "+(i+1));
            array[i]=pedirDato1();
        }
    return array;
    }
    public static long pedirDato1(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLong();
    }
    public static int pedirDato2(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la posicion que desea mostrar");
        while(true){
            int dato = keyboard.nextInt();
        if(dato>0&&dato<11){
            return dato-1;
            } else{
            System.out.println("Por favor ingrese un numero del 1 al 10");
            }
        }
    }
    public static boolean pedirDato3(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese True para continuar o False para terminar.");
        return keyboard.nextBoolean();
    }
    public static void mostrarNumero(long[] array){
        int pos = pedirDato2();
        System.out.println("El numero en la posicion "+pos+" es "+array[pos]);
    }
}
