/**
 * 
 */
package hi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Takrak
 *
 */
class PersonTest {
	Person a;
	Person b;
	Person c;
	Person d;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		a = new Person("Joe", "Mama", 420);
		b = new Person("Big", "Chungus", 10);
		c = new Person("Angie", "Daddy", 13);
		d = new Person("Exodia", "Forbid", 999);
	}

	/**
	 * Test method for {@link hi.Person#toString()}.
	 */
	@Test
	void testToString() {
		assertEquals("firstName= Joe, lastName= Mama, age= 420", a.toString());
		//fail("Not yet implemented");
	}
	
	@Test
	void testLife() {
		assertThrows(UnderAgeException.class, 
				() ->{
					b.birthPerson(c);
				}
		);
		
		assertThrows(UnderAgeException.class, 
				() ->{
					a.birthPerson(c);
				}
		);
		
		Person destined;
		
		try {
			destined = a.birthPerson(d);
			assertEquals(a.getFirstName(), destined.getFirstName());
			assertEquals(d.getLastName(), destined.getLastName());
			assertEquals(0, destined.getAge());
			
		} catch (UnderAgeException e) {
			e.printStackTrace();
			fail("um... not it chief");
		}
		
	}

}
