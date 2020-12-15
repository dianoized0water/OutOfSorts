public class Sorts{
  public static void bubbleSort(int[] data){
    int temp = 0;
    for (int i=0 ; i<data.length; i++){
      for (int j=1; j<data.length-i; j++){
        if (data[j-1]>data[j]){
          temp = data[j-1];
          data[j-1]=data[j];
          data[j]=temp;
        }
      }
    }
  }
}
