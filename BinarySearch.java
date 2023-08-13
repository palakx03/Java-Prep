public class BinarySearch {
    int binarysearch(int arr[],int x){
        int l=0, r= arr.length -1;  // r= sizeOf(arr)/sizeOf(arr[0])
        while(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid]==x)
                return mid;
            if(arr[mid]<x)
                return l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
      public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int n=1000;
        for(int i=0;i<=n;i++){
            int arr[]= i; 
            int x=670;
            int result= b.binarysearch(arr, x);
            if(result == -1)
            System.out.println("Element Present");
            else
            System.out.println("Element is present at"+result);
        }
      }      
            
            
        
    }

