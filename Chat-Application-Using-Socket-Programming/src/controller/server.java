package controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 * created by kasunrachintha on 8/14/22
 *
 * @author : kasunrachintha
 * @Date :  8/14/22
 * @Project : Chat-Application-Using-Socket-Programming
 **/
public class server {

    private static ArrayList<ClientHandler> clientHandlers = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);
        Socket accept;

        while (true) {
            System.out.println("waiting for client");
            accept = serverSocket.accept();
            System.out.println("new member connected!");
            ClientHandler clientHandler = new ClientHandler(accept, clientHandlers);
            clientHandlers.add(clientHandler);
            clientHandler.start();

        }

        //  server server = new server(serverSocket);
        //  server.startServer();


    }
}
