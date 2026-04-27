import java.util.*;
public final class Coin implements Tossable {
    private int sides = 2;
    private int face;
    Random rd = new Random();
    public Coin(){
        sides = 2;
        face = 0;
    }
    public void toss(){
        face = rd.nextInt() % sides;
     }
    public int getValue(){
    return face;
    }
}
