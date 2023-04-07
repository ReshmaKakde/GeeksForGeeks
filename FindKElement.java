class FindKElement {
    void swapKth(int arr[], int n, int k) {
        
        int temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
       
    } 
  public static void main(String [] args)
  {
      int arr[]={1,2,3,4,5,6,7,8};
      int n=arr.length;
      int k=3;
      FindKElement s=new FindKElement();
      s.swapKth(arr,n,k);
  }
}