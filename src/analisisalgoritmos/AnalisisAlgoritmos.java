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
    //Arreglo para burbuja
    public static void main(String[] args) {
        int [] arr = {12, 25 ,13, 67, 9, 2};//1
        Ordenamientos.burbuja(arr);
         System.out.println("Resultado Ordenamiento burbuja:");

        for (int num : arr) {
            System.out.print(num + " ");
    }
        
         System.out.println();
        //Arreglo para selección
        int[] arr2={12, 25, 13, 67, 9, 2};
        Ordenamientos.seleccion(arr2);
        System.out.println("Resultado Ordenamiento por selección: ");
        for (int num : arr2){
            System.out.print(num + " ");
    }
        System.out.println();
        //Arreglo para insertionSort
    int[ ] arr3 ={10, 4, 24, 3, 8, 12};
       Ordenamientos.insertionSort(arr3);
        System.out.println("Resultado Ordenamiento Insertion Sort: ");
        for (int num : arr3){
            System.out.print(num + " ");
        }
        //ordenamiento merge
           int[] arr4 = {12, 25, 13, 67, 9, 2};
    Ordenamientos.mergeSort(arr4);
    System.out.println("Resultado Ordenamiento Merge Sort: ");
    for (int num : arr4){
        System.out.print(num + " ");
    }
    System.out.println();
      
    System.out.println("\n\n===== ÁRBOL DE BÚSQUEDA BINARIA BST =====");

int[] valoresBST = {50, 30, 70, 20, 40, 60, 80};

for (int valor : valoresBST) {
    Ordenamientos.insertarBST(valor);
}

System.out.println("Recorrido inorden antes de eliminar:");
Ordenamientos.recorridoInordenBST();

System.out.println("\nEliminando el nodo 50...");
Ordenamientos.eliminarBST(50);

System.out.println("Recorrido inorden después de eliminar:");
Ordenamientos.recorridoInordenBST();

System.out.println("\nBúsquedas:");
imprimirBusquedaBST(30);
imprimirBusquedaBST(50);
imprimirBusquedaBST(60);

}     
    
    public static void imprimirBusquedaBST(int valor) {
        if (Ordenamientos.buscarBST(valor)) {
            System.out.println("El valor " + valor + " fue encontrado.");
        } else {
            System.out.println("El valor " + valor + " no fue encontrado.");
        }}
     
}
