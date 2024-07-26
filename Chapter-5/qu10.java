import java.util.*;

class qu10 {
  public static int[] mergeArrays(int[] arr1, int[] arr2) {
    int array1 = arr1.length;
    int array2 = arr2.length;
    int[] mergeArray = new int[array1 + array2];
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < array1 && j < array2) {
      if (arr1[i] <= arr2[j]) {
        mergeArray[k++] = arr1[i++];
      } else {
        mergeArray[k++] = arr2[j++];
      }
    }
    while(i<array1){
      mergeArray[k++] = arr1[i++];
    }

    while (j<array2) {
      mergeArray[k++] = arr2[j++];
      
    }
    return mergeArray;

  }
  public static void main(String args[]){
    int []arr1 = new int[] {5,2, 1, 9, 3, 4};
    int []arr2 = {4, 9, 2, 6, 1, 8, 7, 5};

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    int [] mergeArray = mergeArrays(arr1, arr2);
    System.out.println("Source array 1: "+Arrays.toString(arr1));
    System.out.println("Source Array 2: "+Arrays.toString(arr2));
    System.out.println("merged Arrays: "+Arrays.toString(mergeArray));
  }
}