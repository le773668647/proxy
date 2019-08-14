package dongtai;

import java.lang.reflect.Proxy;

/**
 * @author zzzz
 * @create 2019-07-25 下午2:13
 */
public class Test {
    public static void main(String[] args) {
        MathImpl mathimpl=new MathImpl();
         Handler handler=new Handler(mathimpl);
         Math math= (Math) Proxy.newProxyInstance(mathimpl.getClass().getClassLoader(),mathimpl.getClass().getInterfaces(),handler);
         math.add(1,2);
    }
}
