public class SortWordsByLength {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        String[] words = str.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.print("Sorted by length: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}
