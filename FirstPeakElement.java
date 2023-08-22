class FirstPeakElement{
    public static void main(String[] args) {
        int arr[]={1,3,2,6,5};
        int peak=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                if(arr[i]>peak){
                    peak=arr[i-1];
                }
            }
        }
        System.out.println(peak);

        int arr2[]={14,7,3,2,6,5};
        int peak2=0;
        for(int i=0; i<arr2.length-1; i++){
            if(arr2[i]>arr2[i+1]){
                if(arr2[i]>peak2){
                    peak2=arr2[i+1];
                }
            }
        }
        System.out.println(peak2);
    }
}