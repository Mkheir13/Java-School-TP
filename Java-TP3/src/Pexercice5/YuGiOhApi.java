package Pexercice5;



import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class YuGiOhApi {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://db.ygoprodeck.com/api/v7/cardinfo.php?language=fr");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        String response = content.toString();
        JSONObject json = new JSONObject(response);

        try (FileWriter file = new FileWriter("cards.json")) {
            file.write(json.toString());
            System.out.println("Successfully Copied JSON Object to File...");
        } catch (IOException e) {
            e.printStackTrace();
        }
        connection.disconnect();
    }
}
