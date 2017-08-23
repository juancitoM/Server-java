package server;



import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;



public class servidor extends Conexion {
    private String recivedMsg;
    
    public servidor() throws IOException {
        super("servidor");
    }

    public void startServer() throws IOException {
        
        while (true) {
            System.out.println("Esperando conexion...");
            cs = ss.accept();
            entradaServidor = new DataInputStream(cs.getInputStream());
            recivedMsg = entradaServidor.readUTF();
            System.out.println(recivedMsg);
            salidaServidor = new DataOutputStream(cs.getOutputStream());
            recivedMsg = recivedMsg.substring(8);
            salidaServidor.writeUTF("Server-> Se recibio: " + recivedMsg);           
            cs.close();            
        }

    }

}
