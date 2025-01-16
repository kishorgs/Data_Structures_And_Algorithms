class Main {
    public static void linear_search(int[] arr, int n, int key){
        for(int i=0;i<n;i++){
           if(arr[i]==key){
               System.out.println(key +" found at the index of "+ i);
               return;
           }
       }
      System.out.println("Not found");
    }
    public static void main(String[] args) {
       int[] arr = {1,8,4,5,3,6,0};
       int n = arr.length,key=2;
       linear_search(arr,n,key);
      
    }
}
