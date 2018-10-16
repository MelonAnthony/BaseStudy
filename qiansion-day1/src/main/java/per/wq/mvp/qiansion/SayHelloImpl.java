package per.wq.mvp.qiansion;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Auther: Anthony
 * @Date: 2018/10/16 22:15
 * @Description:
 */
public class SayHelloImpl extends UnicastRemoteObject implements ISayHello{

    protected SayHelloImpl() throws RemoteException {
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        return "hello->"+name;
    }
}
