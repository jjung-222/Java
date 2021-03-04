package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("È«±æµ¿", "12346-1234567");
		//Koran.java ¿¡ Korean¿¡ string n, string s¿¡ ÀúÀå µÊ
		
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("±èÀÚ¹Ù", "23461-2345671");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
	}

}
