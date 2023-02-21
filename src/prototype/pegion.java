package prototype;

public class pegion extends Bird{
    public pegion() {
    }

    public pegion(pegion old) {
        super(old);
    }

    public pegion Clone() {

        return new pegion(this);
    }
}
