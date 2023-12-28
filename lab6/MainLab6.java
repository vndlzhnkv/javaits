package lab6;

public class MainLab6 {
    public static void main(String[] args) {
        int number = 21;
        String binaryString = intToBinaryString(number);
        System.out.println(binaryString); // "10101"

        String sentence = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        int combinationsCount = countLetterDigitCombinations(sentence);
        System.out.println("Кількість комбінацій літер та цифр: " + combinationsCount);
    }

    public static String intToBinaryString(int i) {
        return Integer.toBinaryString(i);
    }
    public static int countLetterDigitCombinations(String input) {
        String[] words = input.split("\\s+"); // Розбиваємо рядок на слова

        int count = 0;

        for (String word : words) {
            if (containsLetterDigitCombination(word)) {
                count++;
            }
        }

        return count;
    }

    public static boolean containsLetterDigitCombination(String str) {
        boolean containsLetter = false;
        boolean containsDigit = false;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                containsLetter = true;
            } else if (Character.isDigit(ch)) {
                containsDigit = true;
            }

            if (containsLetter && containsDigit) {
                return true;
            }
        }

        return false;
    }
}