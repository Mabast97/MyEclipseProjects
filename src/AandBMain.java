
public class AandBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student("Mabast","H.", "Salahaddin", 24);
		Graduated g = new Graduated("Mabast","H.", "Salahaddin", 24, 900);
		//Student s = new Student("a","b","ss",18);
		
		Student s2 = g;
		System.out.println("s2 =  "+s2.toString());
		

	}

}
