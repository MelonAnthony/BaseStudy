package per.wq.mvp.qiansion.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Auther: Anthony
 * @Date: 2018/10/17 20:16
 * @Description:
 */
public class User_Stub extends User{

    private Socket socket;

    public User_Stub() throws IOException {
        socket = new Socket("localhost",8888);
    }

    @Override
    public int getAge() throws IOException {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());

            outputStream.writeObject("age");
            outputStream.flush();

            ObjectInputStream objectInputStream =new ObjectInputStream(socket.getInputStream());
            int age = objectInputStream.readInt();
            return  age;

    }
}
