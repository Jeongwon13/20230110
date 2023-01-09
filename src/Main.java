class Outer {
	int value = 10;
	
	class Inner {
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("value:" + value);
			System.out.println("this.value:" + this.value);
			System.out.println("Outer.this.value:" + Outer.this.value);
			
		}
	} // Inner 클래스 끝
} // Outer 클래스 끝

public class Main {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method();
	}

}
