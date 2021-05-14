/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3ejercicio4;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Tarea3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int n=1;
        int al=0;
        System.out.println("Digite un número mayor que 0");
        if(numero>=0){
        for(int i = numero;i>0;i--){
        n=n+1;
        }
        al =n/numero;
        }else{System.out.println("Digite un número valido");}
        System.out.println("La media de los números es "+ al);
    }
    
}
