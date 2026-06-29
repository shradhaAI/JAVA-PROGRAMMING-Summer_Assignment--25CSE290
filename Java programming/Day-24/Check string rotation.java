public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }
    }
}
