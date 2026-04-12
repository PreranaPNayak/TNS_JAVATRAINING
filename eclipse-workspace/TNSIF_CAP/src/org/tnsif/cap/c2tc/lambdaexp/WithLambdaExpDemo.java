package org.tnsif.cap.c2tc.lambdaexp;
@FunctionalInterface
interface Drawable
{
	public void draw();
}
public class WithLambdaExpDemo {
	public static void main(String[] args) {
		int width=10;
		Drawable d=()->{
			System.out.println("Drawing "+width);
		};
		d.draw();
	}
}

