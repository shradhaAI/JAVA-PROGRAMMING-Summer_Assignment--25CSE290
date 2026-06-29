public class FirstRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];
        char result = ' ';
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                result = ch;
                break;
            }
            freq[ch]++;
        }
        
        if (result != ' ') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found");
        }
    }
}
