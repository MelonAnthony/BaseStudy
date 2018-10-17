package per.wq.mvp.qiansion.demo;

import java.io.IOException;
import java.net.Socket;

/**
 * @Auther: Anthony
 * @Date: 2018/10/17 22:23
 * @Description:
 */
public class UserClient {

    public static void main(String[] args) throws IOException {
        User user = new User_Stub();
        int age=user.getAge();
        System.out.println("获取得到的："+age);

    }
}
