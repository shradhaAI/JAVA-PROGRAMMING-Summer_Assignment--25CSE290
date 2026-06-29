public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Programming";
        int vowels = 0;
        int consonants = 0;
        
        String cleanStr = str.toLowerCase();
        
        for (int i = 0; i < cleanStr.length(); i++) {
            char ch = cleanStr.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
