public class StringLength {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        
        for (char c : str.toCharArray()) {
            count++;
        }
        
        System.out.println("Length: " + count);
    }
}
