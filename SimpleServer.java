import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;
    public SimpleServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server started on port: " + port);
    }
    public void acceptClient() throws IOException {
        socket = serverSocket.accept();
        InputStream i = socket.getInputStream();
        OutputStream o = socket.getOutputStream();
        in = new Scanner(i);
        out = new PrintWriter(o, true);
    }
    public String receiveMessage() {
        return in.nextLine(); 
    }

    public void close() {
    }
    public static void main(String[] args) throws IOException {

        SimpleServer s = new SimpleServer(8888);
        s.acceptClient();

        String user=s.receiveMessage();
        s.sendMessage("received: " + user);
        s.close();

        }
}