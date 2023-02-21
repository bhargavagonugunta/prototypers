package prototype;

public class sparow extends Bird{
    public sparow() {
    }

    public sparow(sparow old) {
        super(old);
    }

    public sparow Clone() {

        return new sparow(this);
    }
}
