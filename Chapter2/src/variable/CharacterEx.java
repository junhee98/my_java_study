package variable;

public class CharacterEx {

	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); //타입캐스팅으로 int형으로 출력해라!
		
		ch = 66; //음수 정수는 저장 불가(char형)
		
		System.out.println(ch);
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
	}

}
