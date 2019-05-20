package ex;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point3d p=new point3d();
		p.print();
		p.move(5, 5, 5);
		p.print();
		p.move(10, 10);
		p.print();
		point3d p2=new point3d(p);
		p2.print();
		

	}

}
