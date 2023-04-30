package package1;
import package2.*;

public class B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asub aSub = new Asub();
		System.out.println(aSub.protectedVar);
		
		C c = new C();
		System.out.println(c.publicVar);
		
		A a = new A();
		System.out.println(a.defaultVar);
		//System.out.println(a.privateVar);
	}
}
