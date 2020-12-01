//Algoritmo de ordenamiento Bubble Sort (Ordenamiento de burbuja)
//Complejidad: O(n^2)

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("Arreglo actual:");
    printArray(array);
    bubbleSort(array);
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
  public static void bubbleSort(int[] array) {
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length - i - 1; j++) {
        if(array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}
