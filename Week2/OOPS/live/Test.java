package Week2.OOPS.live;
import Week2.OOPS.music.*;
import Week2.OOPS.music.string.*;
import Week2.OOPS.music.wind.*;

public class Test {
    public static void main(String[] args) {
        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        Playable p1 = new Veena();
        p1.play();

        Playable p2 = new Saxophone();
        p2.play();
    }

}
