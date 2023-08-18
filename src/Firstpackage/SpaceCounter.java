package Firstpackage;
import java.util.*;
public class SpaceCounter {
    public static void main(String[] args) {
        String inputString = " besant technology    tambaram";
       // Scanner scann=new Scanner(System.in);
       // String inputString=scann();
        int spaceCount = 0;
        
        
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        
        System.out.println("Number of spaces in the string: " + spaceCount);
    }

	
}
