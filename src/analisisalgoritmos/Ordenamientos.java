/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analisisalgoritmos;

/**
 *
 * @author rosagabriela
 */
public class Ordenamientos {
   // Algoritmo de burbuja
    public static void burbuja(int[] arr) { //O(n^2)

        int n = arr.length; //1

        for (int i = 0; i < n - 1; i++) { //n^2

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) { //1

                    int aux = arr[j]; //1
                    arr[j] = arr[j + 1]; //1
                    arr[j + 1] = aux; //1

                }

            }

        }

       
        }

    }



