package per.wq.mvp.qiansion.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: Anthony
 * @Date: 2018/10/17 20:16
 * @Description:
 */
public class User_skeleton extends Thread{

    private UserServer userServer;

    public User_skeleton(UserServer userServer){
        this.userServer=userServer;
    }
    @Override
    public void run() {
        ServerSocket serverSocket=null;
        try {
            serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            while(socket!=null){
                ObjectInputStream objectInputStream =new ObjectInputStream(socket.getInputStream());
                String method = (String) objectInputStream.readObject();
                if(method.equals("age")){
                    int age =userServer.getAge();
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeInt(age);
                    outputStream.flush();
                    outputStream.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
