package prototype;

import prototype.inter.Prototype;

public class Bird implements Prototype {
    private String Color;

    public void setColor(String color) {
        Color = color;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setWight(int wight) {
        Wight = wight;
    }

    private String Type;
    private int Wight;
    public Bird(){}
    public Bird(Bird old){
        this.Wight= old.Wight;
        this.Type=old.Type;
        this.Color= old.Color;
    }

    @Override
    public Bird Clone() {
        return new Bird(this);
    }
}
