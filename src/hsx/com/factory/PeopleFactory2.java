package hsx.com.factory;

import hsx.com.entity.People;

public class PeopleFactory2 {

	public static People createPeople(){
		People p=new People();
		p.setId(8);
		p.setName("Ð¡°Ë");
		p.setAge(88);
		return p;
	}
}
