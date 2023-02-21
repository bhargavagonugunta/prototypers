package prototype;

public class croe extends Bird{
    public croe(croe old) {
        super(old);
    }

    public croe() {
    }

    public croe Clone() {
        return new croe(this);
    }
}
