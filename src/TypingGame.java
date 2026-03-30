
    import java.util.Scanner;

    public class TypingGame {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String sentence = "Java is a powerful programming language";

            System.out.println("Type the following sentence:");
            System.out.println(sentence);
            long startTime = System.currentTimeMillis();

            String userInput = sc.nextLine();
            int correctChars = 0;

// Compare character by character
            for (int i = 0; i < sentence.length() && i < userInput.length(); i++) {
                if (sentence.charAt(i) == userInput.charAt(i)) {
                    correctChars++;
                }
            }

// Calculate accuracy
            double accuracy = ((double) correctChars / sentence.length()) * 100;

            System.out.println("Accuracy: " + accuracy + "%");

            // ⏱ End time
            long endTime = System.currentTimeMillis();

            long timeTaken = (endTime - startTime) / 1000; // in seconds
            // Count number of words
            int wordCount = sentence.split(" ").length;

// Calculate minutes
            double timeInMinutes = timeTaken / 60.0;

// Calculate WPM
            double wpm = wordCount / timeInMinutes;

            System.out.println("Words per minute (WPM): " + wpm);

            System.out.println("You typed: " + userInput);
            System.out.println("Time taken: " + timeTaken + " seconds");




            sc.close();
        }
    }

