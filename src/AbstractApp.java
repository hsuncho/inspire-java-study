import lgcns.inspire.abstraction.Animal;
import lgcns.inspire.abstraction.Bird;
import lgcns.inspire.abstraction.SuperMan;
import lgcns.inspire.abstraction.inter.Flyer;

public class AbstractApp {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가
        // Animal animal = new Animal();

        // 배열객체 생성으로 가능하다.
        // Animal [] animalArr = new Animal[2];
        Flyer [] animalArr = new Flyer[2];
        animalArr[0] = new Bird();
        animalArr[1] = new SuperMan();
        // for(Animal element : animalArr) {
        //     if(element instanceof Bird) {
        //         ((Bird)element).fly();
        //     } else if (element instanceof SuperMan) {
        //         ((SuperMan)element).fly();
        //     }
        // }
        for(Flyer element : animalArr) {
            element.fly();
        }
    }
}
