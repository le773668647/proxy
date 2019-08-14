package dongtai;

/**
 * @author zzzz
 * @create 2019-07-25 下午1:18
 */
public class MathImpl implements Math{
    @Override
    public int add(int i,int j) {
        int result=i+j;
        System.out.println(result);
        return result;
    }

    @Override
    public int dec(int i,int j) {
        int result=i-j;
        System.out.println(result);
        return result;
    }

    @Override
    public int sub(int i,int j) {
        int result=i*j;
        System.out.println(result);
        return result;
    }

    @Override
    public int dev(int i,int j) {
        int result=i/j;
        System.out.println(result);
        return result;
    }
}
