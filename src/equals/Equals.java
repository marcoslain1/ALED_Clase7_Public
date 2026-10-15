package equals;

public class Equals {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		// char / double / float / long...
		// System.out.println(a == b);
		
		String s1 = "Hola";
		String s2 = "Hola";
		// String s1 = new String("Hola");
		// String s2 = new String("Hola");
		
		// System.out.println(s1 == s2);
		// System.out.println(s1.equals(s2));
		
		// Wrappers: Double / Integer / Long
		Integer i1 = 1000;
		Integer i2 = 1000;
		// Integer i1 = new Integer(1000);
		// Integer i2 = new Integer(1000);
		
		System.out.println(i1 == i2); // Si el Integer es pequeño, i1 == i2 podría devolver true.
		// System.out.println(i1.equals(i2));
		
	}
}
