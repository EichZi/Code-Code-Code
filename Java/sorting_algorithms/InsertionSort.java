//Algoritmo Insertion Sort (Ordenamiento por inserción) 
//Complejidad: O(n^2)

public class InsertionSort {
  public static void main(String[] args) {
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("Arreglo actual:");
    printArray(array);
    insertionSort(array);
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
  public static void insertionSort(int[] array) {
    for(int i = 1; i < array.length; i++) {
      int actualValue = array[i];
      int j = i - 1;
      while(j >= 0 && actualValue < array[j]) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = actualValue;
    }
  }
}
