package easylevel;

public class CharAmount {
	public static void main(String[] args) {
		String st1, st2;
		String st = "Я люблю Jav";
		int kol = st.length();
		System.out.println(st);
		System.out.println(kol);
		st1 = st.substring(0, kol / 2);
		st2 = st.substring(kol / 2);
		System.out.println(st1);
		System.out.println(st2);
	}
}
