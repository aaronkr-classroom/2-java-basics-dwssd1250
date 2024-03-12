
public class example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 2;
		double y = 4.0d;
		
		System.out.println(x * y);
		
		int a = 7;
		float b = 3f;
		System.out.println("a / b = " + a/b);
		System.out.println("a % b = " + a%b);
		
		//홀수 짝수 찾기
		if(a%2 == 1) {
			System.out.println(a + " is 홀수 odd");
		}
		else {
			System.out.println(a + " is 짝수 even");
		}
		
		//관계와 논리 연산자
		int h = 127;
		System.out.println("Everland = 120cm riding");
		if(h>=120) {
			System.out.println("You can ride");
		}
		else {
			System.out.println("You can't ride");
		}
		
		int age =52;
		System.out.println(age < 65 && age > 40); //T
		System.out.println(age < 40 || age > 65); //F
		System.out.println(age != 50); //T
		
		//캐스팅
		double pi = 3.1415927d;
		long l = (long)pi;
		int i = (int)pi;
		
		System.out.println(pi);
		System.out.println(l);
		System.out.println(i);
	}

}

//System.out.println();