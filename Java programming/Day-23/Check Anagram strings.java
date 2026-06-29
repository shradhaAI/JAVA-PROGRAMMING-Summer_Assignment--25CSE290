public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;
        
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            int[] counts = new int[256];
            
            for (int i = 0; i < str1.length(); i++) {
                counts[str1.charAt(i)]++;
                counts[str2.charAt(i)]--;
            }
            
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        
        if (isAnagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}
