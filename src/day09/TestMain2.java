package day09;

public class TestMain2  {

	public static void main(String[] args) {
		Police p = new Police();
		
		System.out.println(p.name);
		System.out.println(p.rank);
		
		Gun g = new Gun();
		p.setW(g);
		
		p.use();
		p.use();
		p.use();
		p.use();
		p.use();
		p.use();
		p.use();
		p.reuse();

				
		
		Slingshot ss = new Slingshot();
		p.setW(ss);			
		
		p.use();
		p.use();
		p.reuse();
		
	}
}
