public class CreateStringExample {
    public static void main(String[] args) {
        // Creating a string using a literal (stored in String Pool)
        String str1 = "Java";
        // Creating a string using the new keyword (stored in Heap)
        String str2 = new String("Java");
        // Comparing references
                if (str1 == str2) {
            System.out.println("str1 and str2 refer to the same object.");
        } else {
            System.out.println("str1 and str2 refer to different objects.");
        }
        // Comparing content
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same content.");
        } else {
            System.out.println("str1 and str2 have different content.");
        }    
    }   
 }