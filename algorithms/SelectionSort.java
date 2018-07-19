public class SelectionSort {
    public static void sort(int[] arr){
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j=i; j < arr.length; j++){
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        System.out.print("{ ");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }

    public static void main(String[] args){
        int[] arr = {7, 0, 9, 1, 6, 6, 7};
        print(arr);
        sort(arr);
        print(arr);
    }
}
