package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animalFirst;
    private final Animal animalSecond;
    private Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animalFirst, @Qualifier("dog") Animal animalSecond, Timer timer) {
        this.animalFirst = animalFirst;
        this.animalSecond = animalSecond;
        this.timer = timer;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalFirst.toString() +"\n" + animalSecond.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
    public Timer getTimer() {
        return timer;
    }
}
