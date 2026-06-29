public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }
        
        System.out.println("Without spaces: " + result);
    }
}
