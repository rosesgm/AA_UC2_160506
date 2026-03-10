/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisalgoritmos;

/**
 *
 * @author rosagabriela
 */
public class AnalisisAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arr = {12, 25 ,13, 67, 9, 2};//1
        Ordenamientos.burbuja(arr);
         System.out.println("Resultado:");

        for (int num : arr) {
            System.out.print(num + " ");
    }
    
}
 
}
