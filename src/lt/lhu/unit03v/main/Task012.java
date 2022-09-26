package lt.lhu.unit03v.main;

public class Task012 {

	public static void main(String[] args) {
		double aa = 5.0;
		double bb = -3.0;
		double cc = 8.0;
		if (aa>0) {
			System.out.println(aa = Math.pow(aa, 2));
		}else {
			System.out.println(aa = Math.pow(aa, 4));}
		
		System.out.println(bb>0? Math.pow(bb, 2): Math.pow(bb, 4));
			boolean x = cc>0;
			int s=0;
			if (x) {
				s=2;}
			else {
				s=4;}
			System.out.println(Math.pow(cc, s));
				
	}

}
