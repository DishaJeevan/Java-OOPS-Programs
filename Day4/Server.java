import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create server socket on port 8
            ServerSocket serverSocket = new ServerSocket(8900);
            System.out.println("Server started. Waiting for client...");

            // Wait for client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Send message to client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hllo from Server!");

            // Close everything
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}