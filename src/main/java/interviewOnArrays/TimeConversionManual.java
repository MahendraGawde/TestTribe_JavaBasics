package interviewOnArrays;

public class TimeConversionManual {
    public static void main(String[] args) {
        String inputTime = "04:45 PM"; // Example input

        // Split the time into parts
        String[] parts = inputTime.split(" ");
        String timePart = parts[0]; // "04:45"
        String meridianPart = parts[1]; // "PM"

        // Split the timePart into hours and minutes
        String[] timeSplit = timePart.split(":");
        int hours = Integer.parseInt(timeSplit[0]); // 4
        int minutes = Integer.parseInt(timeSplit[1]); // 45

        // Convert hours based on AM/PM
        if (meridianPart.equalsIgnoreCase("PM") && hours != 12) {
            hours += 12;
        } else if (meridianPart.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0;
        }

        // Format hours and minutes into 24-hour format
        String convertedTime = String.format("%02d:%02d", hours, minutes);

        // Output the result
        System.out.println("Converted time in 24-hour format: " + convertedTime);
    }
}
