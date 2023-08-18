package Firstpackage;

      public class SwapDemo {

    public static void main(String[] args) {
        Integer x = 10;
        Integer y = 5;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        swap( x , y);
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b ;
        b = temp;
    }
}



//public class SwapDemo {
//
//    public static void main(String[] args) {
//        int[] arr = {10, 5};
//        swap(arr, 0, 1);
//        System.out.println("Swapped values: " + arr[0] + ", " + arr[1]);
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//}

