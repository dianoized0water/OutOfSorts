public class Sorts{
  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean done = false;
    for (int i=0 ; i<data.length && !done; i++){
      done = true;
      for (int j=1; j<data.length-i; j++){
        if (data[j-1]>data[j]){
          temp = data[j-1];
          data[j-1]=data[j];
          data[j]=temp;
          done = false;
        }
      }
    }
  }

  public static void selectionSort(int[] data){
    int smallestIndex = 0;
    for (int i=0; i<data.length; i++){
      smallestIndex = i;
      for (int j=i; j<data.length; j++){
        if (data[j]<data[smallestIndex]){
          smallestIndex=j;
        }
      }
      int temp = data[i];
      data[i]=data[smallestIndex];
      data[smallestIndex]=temp;
    }
  }

  public static void insertionSort(int[] data){
    for (int i=0; i<data.length; i++){
      int smallestIndex = i;
      int original = data[i];
      while (smallestIndex>0 && data[smallestIndex-1]>original){
        data[smallestIndex] = data[smallestIndex-1];
        smallestIndex--;
      }
      data[smallestIndex] = original;
    }
  }
}
