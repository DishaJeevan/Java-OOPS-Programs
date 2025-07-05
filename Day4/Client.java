
import java.io.*;
import java.net.*;

public class Client{
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 8888
            Socket clientSocket = new Socket("172.25.9.136", 8900);
            System.out.println(" Connected to the Server.");

            // Read data sent from the server
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String messageFromServer = input.readLine();
            System.out.println(" Message from Server: " + messageFromServer);
           // Close the connection
            clientSocket.close();
            System.out.println(" Connection closed.");
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
