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

        for (int i = 0; i < n - 1; i++) { //o(n)

            for (int j = 0; j < n - i - 1; j++) { //o(n)

                if (arr[j] > arr[j + 1]) { //1

                    int aux = arr[j]; //1
                    arr[j] = arr[j + 1]; //1
                    arr[j + 1] = aux; //1

                }

            }

        }

       
        }
    //Algoritmo de  oirdenamiento por selección
    public static void seleccion(int[] arr){//O(n^2)
        int n = arr.length; //O(1) obtener el tamaño del arreglo 
        for (int i=0; i < n -1; i++){ //O(n) recorre el arreglo posición por posición, en cada iteracion se coloca el elemento mínimo en la posición i.
            int min = i; //O(1) Se asume inicialmente que el elemento actual es el menor.
            for (int j=i+1; j <n; j++){ //O(n) Recorre la parte no ordenada del arreglo para buscar el elemento más pequeño.
                if (arr[j] < arr[min]){ //O(1) Compara el valor actual con el mínimo encontrado.
                    min=j;//O(1) SI encuentra un valormenor, se actualiza la posición del mínimo
                }
            }
            int aux = arr[min];//O(1) se guarda temporalmente el arreglo.
            arr[min]= arr[i];//O(1) se coloca el mínimo en la posición actual del arreglo.
            arr[i]= aux;//O(1) Se completa el intercambio entre los elementos.
        }
    }

    }



