package study1;

public class BooleanLiteral {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = 10>0;//10>0가 참이므로 b값은 true
		int count = 0;
		while(true) {//무한 루프
			count++;
			System.out.println(a);
			System.out.println(b);
			if(count==3)
				break;
		}
	}

}
