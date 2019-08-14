package dongtai;

import javax.swing.plaf.basic.BasicComboPopup;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zzzz
 * @create 2019-07-25 下午2:10
 */
public class Handler implements InvocationHandler {
    private Object target;
    public Handler(Object target){
        this.target=target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start");
        Object result=method.invoke(target,args);
        System.out.println("end");

        return result;
    }
}
