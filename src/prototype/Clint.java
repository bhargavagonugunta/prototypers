package prototype;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.of;

public class Clint {
    public static void main(String[] args) {
        croe h = new croe();
        h.setColor("Black");
        h.setType("Bird aor");
        h.setWight(79);
        sparow n = new sparow();
        n.setType("Bird air");
        n.setColor("brownn");
        n.setWight(3030);
        Hen k = new Hen();
        k.setType("Bird air");
        k.setColor("brownn");
        k.setWight(3030);
        pegion o = new pegion();
        o.setType("Bird air");
        o.setColor("brownn");
        o.setWight(3030);
        List<Bird> list = List.of(h,n,k,o);
        List<Bird> childern = new ArrayList<>();
        for (Bird childerns :list){
            childern.add(childerns.Clone());
        }
        System.out.println("Done");
    }
}
