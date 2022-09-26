package lt.lhu.unit03v.main;

public class Task011 {

	public static void main(String[] args) {
		//площадь первого треугольника
		double stor1 = 3.0;
		double stor2 = 4.0;
		double stor3 = 5.0;
		double pp1 = 0.0;
		double sqr1 = 0.0;
		pp1 = (stor1+stor2+stor3)/2;
		sqr1 = Math.sqrt(pp1*((pp1-stor1)*(pp1-stor2)*(pp1-stor3)));
		//площадь второго треугольника
		double sstor1 = 4.0;
		double sstor2 = 4.0;
		double sstor3 = 5.0;
		double pp2 = 0.0;
		double sqr2 = 0.0;
		pp2 = (sstor1+sstor2+sstor3)/2;
		sqr2 = Math.sqrt(pp2*((pp2-sstor1)*(pp2-sstor2)*(pp2-sstor3)));
		if (sqr1>sqr2){
			System.out.print("Perviy treugolnik bolshe");
		}else if (sqr1<sqr2) {
			System.out.print("Vtoroy treugolnik bolshe");
		}else if (sqr1==sqr2) {
		System.out.print("Treugolniki ravni");} 
	}

}
