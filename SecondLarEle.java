import java.util.Arrays;

public class SecondLarEle {
    public static void main(String[] args) {
        int[] arr={34,21,54,65,43};
        Arrays.sort(arr);
        int result=arr[arr.length-2];
        System.out.println(result);

        int arr2[]={4,3,6,7,1};
        Arrays.sort(arr2);
        int result2=arr2[arr2.length-2];
        System.out.println(result2);
    }
}