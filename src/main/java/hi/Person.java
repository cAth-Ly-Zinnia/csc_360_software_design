package hi;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	

	@Override //concatenates Person
	public String toString() {
		return "firstName= " + firstName + ", lastName= " + lastName + ", age= " + age;
	}
	
	public Person birthPerson(Person that) throws UnderAgeException {
		if(age<18 || that.age <18) {
			throw new UnderAgeException();
		}
		Person child = new Person(this.firstName, that.lastName, 0);
		return child;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person a = new Person("Joe", "Mama", 420);
		Person b = new Person("Big", "Chungus", 10);
		System.out.println(a);
		System.out.println(b);
	}

}
