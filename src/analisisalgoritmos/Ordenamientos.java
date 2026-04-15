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

    public static void insertionSort(int[] arr){//o(n^2)
       int n = arr.length;  //O(1) Obtiene el tamaño del arreglo.
       
       for (int i = 1; i < n; ++i){ //O(n) Recorre el arreglo desde el 2do elemento
           int key= arr[i];//O(1) Guarda el valor actual a insertar
           int j = i-1;//O(1) Ìndice del elenemto anterior
           //Desplaza a la derecha los elementos > que key para hacer espacio e insertar key en la posc. correcta.
           while(j >= 0 && arr[j] > key){ //o(n) 
               arr[j + 1]=arr[j];//o(1) mueve el elemento una posicion a la derecha
               j = j - 1;//o(1) retrocede al elemento anterior
               
           }
           arr[j +1 ] = key;// o(1) inserta el valor guardado en la posición correcta
           
       }
    
    }
   public static void mergeSort(int[] arr){
    if (arr.length <= 1) {// verifica si el arreglo tiene 1 elemento o menos; si es asi ya está ordendo termina la recursión
        return;
    }

    int mitad = arr.length / 2; //divide el arreglo en 2 partes.

    int[] izquierda = new int[mitad];// crea un arreglo izquierdo
    int[] derecha = new int[arr.length - mitad];// Crea un arreglo derecho 

    for (int i = 0; i < mitad; i++) {//llena el arreglo izquierdo
        izquierda[i] = arr[i];//Copia el elemento actual del arreglo original al arreglo izquierdo
    }

    for (int i = mitad; i < arr.length; i++) {//Recorre desde la mitad hasta el final para copiar la parte derecha
        derecha[i - mitad] = arr[i];////Copia el elemento actual del arreglo original al arreglo i derecho
    }

    mergeSort(izquierda);//Ordena recursivamente la mitad izquierda
    mergeSort(derecha);//Ordena recursivamente la mitad derecha

    merge(arr, izquierda, derecha);//Las dos mitades ya fueron ordenadas. Ahora se combinan en el arreglo original
}

public static void merge(int[] arr, int[] izquierda, int[] derecha){
    int i = 0;// indice para recorrer arreglo izquierdo
    int j = 0;//indice para recorer el arreglo derecho
    int k = 0;//indice para colocar elementos en el arreglo principal

    while (i < izquierda.length && j < derecha.length) {// Sigue mientras ambos arreglos tengan elementos disponibles
        if (izquierda[i] <= derecha[j]) {// compara cuál eleento es menor
            arr[k] = izquierda[i];// guarda el elemento menor en el arreglo principal
            i++;// avanza en el arreglo izquierdo
        } else {//guarda el elemento derecho si es menor
            arr[k] = derecha[j];
            j++;//avanza en el arreglo derecho
        }
        k++; //Avanza posición del arreglo principal
    }

    while (i < izquierda.length) {//mientras queden elementos en izquierda
        arr[k] = izquierda[i];//copia el elemento restante
        i++;//Avanza a la izquierda
        k++;//avanza el arreglo principal
    }

    while (j < derecha.length) {//mientras queden elementos en derecha
        arr[k] = derecha[j];//copia el elemtneo restante
        j++;//avanza derecha
        k++;//avanza el arreglo principal
    }
}
    }



