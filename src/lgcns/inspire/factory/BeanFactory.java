package lgcns.inspire.factory;

import lgcns.inspire.abstraction.LgTV;
import lgcns.inspire.abstraction.SamsungTV;
import lgcns.inspire.abstraction.inter.TV;

public class BeanFactory {
    private static BeanFactory instance;
    private TV [] arr;
    private BeanFactory() {
        arr = new TV[2];
        arr[0] = new SamsungTV();
        arr[1] = new LgTV();
    }
    public static BeanFactory getInstance() {
        if(instance == null) {
            instance = new BeanFactory();
        }
        return instance;
    }
    public TV getBrand(String brand) {
        return (brand.equals("samsung")) ? arr[0] : arr[1];
    }
}
