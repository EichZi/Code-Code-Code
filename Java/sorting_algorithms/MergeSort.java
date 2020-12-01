//Algoritmo Merge Sort (Ordenamiento por mezcla) 
//Complejidad: O(nlogn)

public class MergeSort {
  public static void main(String[] args) {
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("Arreglo actual:");
    printArray(array);
    mergeSort(array);
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
  public static void mergeSort(int[] array) {
    if(array.length > 1) {
      int middle = array.length / 2;
      int[] left = new int[middle];
      for(int i = 0; i < middle; i++) left[i] = array[i];
      mergeSort(left);
      int[] right = new int[array.length - middle];
      for(int i = 0; i < array.length - middle; i++) right[i] = array[i + middle];
      mergeSort(right);
      
      int iArray = 0, iLeft = 0, iRight = 0;
      while(iLeft < left.length && iRight < right.length) {
        if(left[iLeft] < right[iRight]) {
          array[iArray] = left[iLeft];
          iLeft++;
        }
        else {
          array[iArray] = right[iRight];
          iRight++;
        }
        iArray++;
      }
      while(iLeft < left.length) {
        array[iArray] = left[iLeft];
        iLeft++;
        iArray++;
      }
      while(iRight < right.length) {
        array[iArray] = right[iRight];
        iRight++;
        iArray++;
      }
    }
  }
}