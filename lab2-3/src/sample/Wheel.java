package sample;

public class Wheel extends AbstractPart {

    protected boolean isDeflated;

    public Wheel() {
        super(5f);
        this.isDeflated = false;
    }

    public void setDeflated() {
        if (isDeflated) {
            System.out.println("Wheel already deflated");
        } else {
            isDeflated = true;
            System.out.println("Wheel is deflated now!");
        }
    }

    public void repair() {
        if (!isDeflated) {
            System.out.println("Wheel is not deflated!");
        } else {
            isDeflated = false;
            System.out.println("Wheel has been deflated! :(");
        }
    }

    public void rotate() {
        if (isDeflated) {
            System.out.println("Wheel cannot rotate. It's deflated");
        } else {
            System.out.println("Rotating...!");
        }
    }
}