package prototype;

public class Hen extends Bird{
    public Hen() {
    }

    public Hen(Hen old) {
        super(old);
    }

    public Hen Clone() {

        return new Hen(this);
    }
}
