import java.util.Arrays;
//bubble sort is also knows as stable sorting algo
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {17,2,5,19,0};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

//        bubbledesc(arr);
//        System.out.println(Arrays.toString(arr));
    }

    //sorting in increasing order
    static void bubblesort(int[] arr) {
        boolean swap;
        //N=length of array
        //the outer loop runs N-1 times
        for (int i = 0; i < arr.length; i++) {// we can also write this i<=arr.length-1  //take a deeper look in condition
            //the inner loop runs till N-i-1
                swap= false;
            for (int j = 1; j <= arr.length - i - 1; j++) {
                //now compare if the j element is smaller than the j-1 element than swap
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap =true;// means the swap occur
                }
            }

            // we didi this beacuse if the array is sorted and there is no swap occur then there is no need of us to run the i loop again it stop or break after i=0
            if(swap==false){
                break;
            }
        }
    }

    //sort in desc order
    static void bubbledesc(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - i - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
