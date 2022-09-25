package lt.lhu.unit03v.main;

public class Task010 {

	public static void main(String[] args) {
		double rad1 = 27.0;
		double rad2 = 26.0;
		double pi = 3.14;
		double sqr1 = 2*pi*(Math.pow(rad1, 2));
		double sqr2 = 2*pi*(Math.pow(rad2, 2));
		System.out.print(sqr1<sqr2?"Perviy krug men`she":"Vtoroy krug men`she");

	}

}
