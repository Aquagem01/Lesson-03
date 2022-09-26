package lt.lhu.unit03v.main;

public class Task013 {

	public static void main(String[] args) {
		double xa = 3;
		double ya = 4;
		double xb = -2;
		double yb = -4;
		
		xa = Math.abs(xa);// хотя раз у нас все возводится
		ya = Math.abs(ya);// во вторую степень, этим можно 
		ya = Math.abs(ya);// и принебречь
		yb = Math.abs(yb);
		
		double gip1 = Math.sqrt((Math.pow(xa,2))+(Math.pow(ya, 2)));
		double gip2 = Math.sqrt((Math.pow(xb,2))+(Math.pow(yb, 2)));
		if (gip1>gip2) {
			System.out.print("Blije tochka B");}
			else if(gip1<gip2) {
				System.out.print("Blije tochka A");}
			else if (gip1==gip2) {
				System.out.print("Tochki ravnoudaleni");}
			}
			
			}


