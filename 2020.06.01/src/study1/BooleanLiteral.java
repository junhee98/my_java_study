package study1;

public class BooleanLiteral {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = 10>0;//10>0�� ���̹Ƿ� b���� true
		int count = 0;
		while(true) {//���� ����
			count++;
			System.out.println(a);
			System.out.println(b);
			if(count==3)
				break;
		}
	}

}
