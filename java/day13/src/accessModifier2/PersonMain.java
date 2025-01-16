package accessModifier2;

import accessModifier.Person;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
//		p.name = "유리"; //직접적인 접근이 안됨
		p.setName("유리");
		System.out.println(p.getName());
	}
}
