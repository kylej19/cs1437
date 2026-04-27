import java.util.*;
public final class Die implements Tossable {
    Random rd = new Random();
    private int face;
    private int sides;
    public Die(int sides){
        face = 0;
        this.sides = sides;
    }
    public int getSides(){
        return sides;
    }
    public void changeSides(int sides){
        this.sides = sides;
    }
    public void toss() {
        face = rd.nextInt() % sides;
    }
    public int getValue() {
        return face;
    }

}
