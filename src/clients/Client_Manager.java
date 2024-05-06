import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

class Client_Manager {
    private Socket sock;
    private BufferedReader in;
    private PrintWriter out;
    
    
    public Client_Manager(Socket sock) throws IOException {
        this.sock = sock;
        this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.out = new PrintWriter(socket.getOutputStream());
    }

    public void send(String message) {
        out.println(message);
        out.flush();
    }

    public String receive() throws IOException {
        String message = in.readLine();
        return message;
    }
    
}  