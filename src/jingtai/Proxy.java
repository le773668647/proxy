package jingtai;

/**
 * @author zzzz
 * @create 2019-07-25 下午4:13
 */
public class Proxy implements Person {
    private Person target;

    public Proxy(Person target) {
        this.target = target;
    }

    @Override
    public void run() {
       target.run();
    }

    @Override
    public void sleep() {
      target.sleep();
    }
}
