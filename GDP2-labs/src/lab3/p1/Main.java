package lab3.p1;

import lab3.Circle;
import lab3.Ellipse;

public class Main {

	public static void main(String[] args) {
		int w = 5;
		int h = 7;
		int r = 6;


		Ellipse[] ellipses = new Ellipse[2];

		ellipses[0] = new Ellipse(w,h);
		ellipses[1] = new Circle(r);


		System.out.println("Ellipse");
		System.out.println("----------");
		System.out.println(ellipses[0].toString()+"\n\n");

		System.out.println("Circle");
		System.out.println("------------");
		System.out.println(ellipses[1].toString());

	}

}
