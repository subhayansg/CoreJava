public class PracticeStrings {
    public static void main(String[] args) {
        String str = "www.example.com";
        int i = str.indexOf('.');
        System.out.println(i);

        // Comparing two strings
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");

        System.out.println(str1.equals(str2)); // returns true; as both strings are same
                                               // and we are comparing the actual strings
        System.out.println(str1.equals(str3)); // returns true; as both strings are same and
                                               // we are comparing the actual strings
        if(str1 == str2) {
            System.out.println("True"); // returns true; here we are comparing the references
                                        // and both are pointing to the same variable in string pool
        }
        if(str1 == str3) {
            System.out.println("True"); // returns false; here we are comparing the references
                                        // and both are pointing to the different things; one points to "java" in string pool
                                        // another points to "java" in Heap
        }
        else {
            System.out.println("False");
        }
    }
}
