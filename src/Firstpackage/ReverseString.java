package Firstpackage;



public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}


//public class ReverseString {
////    public static void main(String[] args) {
////        String original = "Hello, World!";
////        String reversed = reverseString(original);
////        System.out.println("Original: " + original);
////        System.out.println("Reversed: " + reversed);
////    }
////
////    public static String reverseString(String str) {
////        char[] charArray = str.toCharArray();
////        int left = 0;
////        int right = charArray.length - 1;
////
////        while (left < right) {
////            // Swap characters at left and right indices
////            char temp = charArray[left];
////            charArray[left] = charArray[right];
////            charArray[right] = temp;
////
////            // Move towards the center
////            left++;
////            right--;
////        }
////
////        return new String(charArray);
////    }
//	
//}

