package projects.pushed;

public class Project02 {

    public static int maxSubArraySum(int[] arr) {    //Calculation of the Max Sum of the subarray

        int localMax = arr[0];   //Local and global Max
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {  //Process from the second element to the end of the array

            localMax = Math.max(arr[i], localMax + arr[i]);  //Calculation of local Max(previous local Max + arr[i]

            globalMax = Math.max(globalMax, localMax);  //Update global Max
        }

        return globalMax;
    }

    public static void main(String[] args) { //example

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Max value of array is: " + maxSubArraySum(arr));
    }
}