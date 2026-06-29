public class CommonCharacters {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "pale";
        
        int[] count1 = new int[256];
        int[] count2 = new int[256];
        
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i)]++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i)]++;
        }
        
        System.out.print("Common characters: ");
        for (int i = 0; i < 256; i++) {
            if (count1[i] > 0 && count2[i] > 0) {
                int minOccurrences = count1[i] < count2[i] ? count1[i] : count2[i];
                for (int j = 0; j < minOccurrences; j++) {
                    System.out.print((char) i + " ");
                }
            }
        }
    }
}
