package Day10;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		KiaCar k = new KiaCar();
//		kc.printCar();
		
		Circle c= new Circle(5,5,5);
		c.print();
		
		Rect r=new Rect(0,0,4,6);
		r.print();
		r.resize(2, 1);
		r.print();
		
		Shape s1=new Rect();
		Shape s2= new Circle();
		Shape s3= new Shape();
		if (s1 instanceof Rect){
			//System.out.println("객체 s1은 Rect로 형변환이 가능");
			Rect r1=(Rect)s1;
			r1.print();
		}
		if (s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능");
		}
		//형변환이안되기때문에출력이안됨 
		
	}

}
