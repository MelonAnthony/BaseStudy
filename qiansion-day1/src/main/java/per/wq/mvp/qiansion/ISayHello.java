package per.wq.mvp.qiansion;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Auther: Anthony
 * @Date: 2018/10/16 22:14
 * @Description:
 */
public interface ISayHello extends Remote{
    public String sayHello(String name) throws RemoteException;
}
