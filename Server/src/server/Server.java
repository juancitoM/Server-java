
package server;

import java.io.IOException;


public class Server {
    
    public static void main(String[] args) {
        try {
            servidor serv = new servidor();
            serv.startServer();
        } catch (IOException ex) {       
            ex.printStackTrace();
        }
    }
    
}
