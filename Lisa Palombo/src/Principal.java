import Punto7.Person;

public class Principal {

	public static void main(String[] args) {

		Student st = new Student();
		System.out.println(st.Name + "\n" + st.Id + "\n" + st.status);

		Punto7();

	}

	public static void Punto7() {

		Person p1 = new Person(37, "arial");
		Person p2 = new Person(15, "Joseph");

		if (p1.getAge() == p2.getAge()) {
			System.out.println(p1.getName() + " Tiene el mismo nombre que " + p2.getName());
		}

		else {
			System.out.println(p1.getName() + " NO tiene el mismo nombre que " + p2.getName());
		}

	}
}
