public class Reto_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		
		for(i=1;i<101;i++) {
			int num=3;
			int num2=5;
			if(i%num==0 && i%num2==0 && i>5) {
				System.out.println("fizzbuzz");
			}else if(i%num==0 && i>3) {
				System.out.println("fizz");
			}else if(i%num2==0 && i>5) {
				System.out.println("buzz");
			}else {
				System.out.println(i);
			}
		}
	}
}
