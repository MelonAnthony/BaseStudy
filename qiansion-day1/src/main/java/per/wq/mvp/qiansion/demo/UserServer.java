package per.wq.mvp.qiansion.demo;

/**
 * @Auther: Anthony
 * @Date: 2018/10/17 20:24
 * @Description:
 */
public class UserServer extends User{

    public static void main(String[] args) {
        UserServer userServer = new UserServer();
        userServer.setAge(18);

        User_skeleton user_skeleton = new User_skeleton(userServer);
        user_skeleton.start();
    }
}
