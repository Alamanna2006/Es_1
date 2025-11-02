package Gianni;

import java.util.Random;

public class Randomizer {
    
    Random x =new Random();

    public Randomizer() {}

    public int randomInt(int bound){
        return x.nextInt(101);
    }

    public Random getX() {
        return x;
    }

    public void setX(Random x) {
        this.x = x;
    }

    

}
