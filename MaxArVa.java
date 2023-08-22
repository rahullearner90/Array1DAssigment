public class MaxArVa {
    public static void main(String[] args) {
        int max=0;
        int arr[]={34,21,54,65,43};
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        
        int max2=0;
        int[] arr2={4,3,6,7,1};
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>max2){
                max2=arr2[i];
            }
        }
        System.out.println(max2);
    }
}
