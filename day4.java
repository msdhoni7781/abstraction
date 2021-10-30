package prac;

public class day3 {
    public static void main(String[] args) {
      int arr[]={3,5,7,8};
      int target =3;

      int a=bin(arr,target);

        System.out.println(a);

    }
  private static int bin(int[] arr, int target) {

        int start=0;
        int end=arr.length-1;

        int index=-1;

        while(start<=end)
        {

                    int mid=start+(end-start)/2;

            if(arr[mid]==target)
                return mid;

            else if (arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;


        }

        return -1;
    }
}
