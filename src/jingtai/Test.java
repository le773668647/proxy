package jingtai;

/**
 * @author zzzz
 * @create 2019-07-25 下午4:16
 */
public class Test {
    public static void main(String[] args) {
          Z z=new Z();
          Person proxy=new Proxy(z);
          proxy.sleep();
          proxy.run();
    }
}
