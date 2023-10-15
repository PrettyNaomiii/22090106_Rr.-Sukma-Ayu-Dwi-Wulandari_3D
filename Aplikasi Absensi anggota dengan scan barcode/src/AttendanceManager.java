/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ragam
 */
    import java.io.OutputStream;
import java.io.InputStream;  // Add this line
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class AttendanceManager {

    public static void markAttendance(String memberId) {
        try {
            // Connect to the PHP script using HTTP POST
            String url = "http://localhost/phpmyadmin/index.php?route=/table/sql&db=kehadiran&table=member";
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();

            con.setRequestMethod("POST");
            con.setDoOutput(true);

            String postData = "action=markAttendance&memberId=" + memberId;
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = postData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Check the response from the PHP script
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response if needed
                InputStream inputStream = con.getInputStream();  // Add this line
                // ... (process the response)
                System.out.println("Attendance marked successfully.");
            } else {
                System.out.println("Failed to mark attendance. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Test the markAttendance function
        markAttendance("123456");
    }
}


