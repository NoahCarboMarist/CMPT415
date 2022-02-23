package lab3;

public class Ellipse {

    protected int a;
    protected int b;

    public Ellipse(int a, int b) {
    	this.a = a;
    	this.b = b;
    }

	public double area() {

        return a * b * Math.PI;
    }

    public int getWidth() {

    	return a;
    }

    public int getHeight() {
    	return b;
    }

    @Override
    public String toString() {
      return getClass().getSimpleName() + "(a="+a+", b="+b+")";
    }

}