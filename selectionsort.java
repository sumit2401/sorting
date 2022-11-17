import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[]arr = {4,6,-2,9,0};
        selection(arr);
        System.out.println(Arrays.toString(arr));


    }
    //we use selection sort when we have small array or list
    static void selection(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            //find the max value from the remaining array and swap it with its correct index
            int last = arr.length-i-1;//suppose the i =1 then the last index will be 5-1-1 =3 //3 in the last index of the remaining array
            int maxindex=getmax(arr, 0, last);
            swap(arr, maxindex, last); //last is going to be the last index of the remaining array
        }
    }
    //finding the index of  maximum value from the array
    static int getmax(int[]arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    //create a new function for swapping
    static void swap(int[]arr, int a , int b){
     int temp = arr[a];
     arr[a]=arr[b];
     arr[b]=temp;
    }
}
