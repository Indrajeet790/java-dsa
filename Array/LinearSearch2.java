public class LinearSearch2 {
  public static void main(String[]args){

    int arr[]={7,13,9,4,2,1,8,19};
     int key=8;

   // search
   for(int i=0;i<arr.length;i++){
      if(arr[i]==key){
     System.out.println(i);
      return;
 }
}
System.out.println("Not found");
}
}
