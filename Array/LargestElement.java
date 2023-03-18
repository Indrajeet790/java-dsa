public class LargestElement {
  public static void main(String args[]){
    int arr[]={5,6,3,8,12,45};
    int l=arr[0];
    for(int i=1;i<arr.length;i++){
      if(arr[i]>l){
        l=arr[i];
      }
    }
    System.out.println("largest");
  }
  
}
