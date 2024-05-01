import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversion {
    public static void main(String[] args) {

        String inputDate = "march 9, 2024";  // Change this to your desired date

        // Define input and output date formats
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM d, yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parse the input date string
            Date parsedDate = inputFormat.parse(inputDate);

            // Format the parsed date to the desired format
            String formattedDate = outputFormat.format(parsedDate);

            System.out.println("Original date: " + inputDate);
            System.out.println("Converted date: " + formattedDate);
        }

        catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
    }
}
