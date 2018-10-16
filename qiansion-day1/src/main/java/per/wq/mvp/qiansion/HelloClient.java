package per.wq.mvp.qiansion;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Auther: Anthony
 * @Date: 2018/10/16 22:22
 * @Description:
 */
public class HelloClient {
    public static void main(String[] args) {
        try {
            ISayHello hello = (ISayHello) Naming.lookup("rmi://localhost:8888/sayHello");
            System.out.println(hello);
            System.out.println(hello.sayHello("wangqian"));
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
