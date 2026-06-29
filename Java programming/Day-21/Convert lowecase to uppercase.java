public class LowerToUpper {
    public static void main(String[] args) {
        String str = "hello java";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        
        System.out.println("Uppercase: " + result);
    }
}
