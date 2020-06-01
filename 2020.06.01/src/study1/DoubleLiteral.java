package study1;

public class DoubleLiteral {

	public static void main(String[] args) {
		double d = 0.1234;
		double e= 1234E-4;
		float f = 0.1234f;//f=0.1234로 하면 컴파일오류
		double w = .1234D;//.1234D 와 .1234는 동일
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);
	}

}
