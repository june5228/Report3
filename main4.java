public class main4 {

	public static void main(String[] args) {
		CList<String> s = new CList<String>();
		
		s.insert("apple");
		s.insert("kiwi");
		s.insert("lime");
		s.insert("pear");
		s.print();
		System.out.print(":s�� ���� = "+ s.size() + "\n");
		
		s.delete();
		s.print();
		System.out.print(":s�� ���� = "+ s.size() + "\n");
		System.out.println();

	}

}
