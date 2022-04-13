package Server_Client;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Сервер запущен, ожидаем подключение...");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            final DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            final DataInputStream in = new DataInputStream(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                new Thread(() -> {
                    try {
                        final String msg = bufferedReader.readLine();
                        out.writeUTF(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();


                    final String message = in.readUTF();
                    System.out.println("Сообщение от клиента: " + message);

                    if ("/end".equalsIgnoreCase(message)) {
                        out.writeUTF("/end");
                        break;
                    }




            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
