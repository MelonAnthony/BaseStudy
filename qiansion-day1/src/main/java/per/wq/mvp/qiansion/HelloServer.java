package per.wq.mvp.qiansion;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Auther: Anthony
 * @Date: 2018/10/16 22:19
 * @Description:
 */
public class HelloServer {

    public static void main(String[] args) {
        try {
            ISayHello hello = new SayHelloImpl();
            LocateRegistry.createRegistry(8888);//注册服务
            Naming.bind("rmi://localhost:8888/sayHello",hello);//绑定服务
            System.out.println("server start success");

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
