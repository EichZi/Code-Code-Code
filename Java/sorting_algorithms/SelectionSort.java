//Algoritmo Selection Sort (Ordenamiento por selección) 
//Complejidad: O(n^2)

public class SelectionSort {
  public static void main(String[] args) {
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("Arreglo actual:");
    printArray(array);
    selectionSort(array);
    System.out.println("Arreglo ordenado:");
    printArray(array);
  }
  
  //Método para imprimir un arreglo
  public static void printArray(int[] array) {
    System.out.print("[");
    for(int i = 0; i < array.length - 1; i++) {
      System.out.print(array[i] + ",");
    }
    System.out.print(array[array.length - 1] + "]\n");
  }

  //Método de ordenamiento
  public static void selectionSort(int[] array) {
    for(int i = 0; i < array.length - 1; i++) {
      int minIndex = i;
      for(int j = i + 1; j < array.length; j++) {
        if(array[j] < array[minIndex]) minIndex = j;
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }
}