package Server;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClient
{
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleClient(String ip, int port) throws Exception{
        socket=new Socket(ip, port);
        out=new PrintWriter(socket.getOutputStream(), true);
        in=new Scanner(socket.getInputStream());
    }

    public void sendMessage(String msg){
        out.println(msg);
        out.flush();
    }

    public String receiveMessage(){
        return in.nextLine();
    }

    public void close() throws Exception{
        socket.close();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws Exception{
        SimpleClient smp = new SimpleClient("localhost", 1234);
        Scanner input=new Scanner(System.in);
        while(true){
            String message=input.nextLine();
            smp.sendMessage(message);
            if(message.equals("stop")){
                 break;
            }
            String msg=smp.receiveMessage();
            System.out.print("Server  "+msg);

        }
        smp.close();

    }

}