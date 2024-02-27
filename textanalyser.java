import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TextAnalysis {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("What do you enjoy the most about CS1103?");
 String inputText = scanner.nextLine();
 // Total number of characters
 int totalCharacters = inputText.length();
 System.out.println("Total character in this paragraph are " + totalCharacters);
 // Total number of words
 String[] words = inputText.split("\\s+");
 int totalWords = words.length;
 System.out.println("Total number of words in the paragraph are " + totalWords);

 // Frequency of the O character
 System.out.println("Which character would you like to check its frequency?");
 char inputChar = scanner.next().toLowerCase().charAt(0);
 long charFrequency = inputText.chars().filter(c -> Character.toLowerCase(c) == inputChar).count();
 System.out.println("Frequency of " + inputChar + ": " + charFrequency);

 // Frequency of a specific word
 System.out.println("Enter a word to check for frequency:");
 String inputWord = scanner.next().toLowerCase();
 long wordFrequency = java.util.Arrays.stream(words).filter(w ->
 w.equalsIgnoreCase(inputWord)).count();
 System.out.println("Frequency of " + inputWord + ": " + wordFrequency);

 // To find the number of unique words
 Map<String, Integer> wordMap = new HashMap<>();
 for (String word : words) {
 wordMap.put(word.toLowerCase(), 1);
 }
 int uniqueWords = wordMap.size();
 System.out.println("The number of unique words in your paragraph are: " + uniqueWords);

 }
}

