package interviewPreparation;

public class CountCharacter {
    public static void main(String[] args) {
                // Hardcoded input string
                String input = "Hi my name is aakash";
        System.out.println(input.length());

                // Initialize the counter
                int count = 0;

                // Loop through the string and count occurrences of 'a'
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == 'a') {
                        count++;
                    }
                }
                // Display the count
                System.out.println("The character 'a' appears " + count + " times in the string.");
            }
        }

