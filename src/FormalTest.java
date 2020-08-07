import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FormalTest {
	Formal stem;

	@Before
    public void setUp() throws Exception {
        stem = new Formal();
    }
	
	@Test
	public void addTest() {
        assertEquals(true, stem.add("Musa", "Non-Vegetarian"));
        assertEquals(true, stem.add("Sri", "Pescatarian"));
        assertEquals(true, stem.add("Fazil", "Vegetarian"));
        assertEquals(true, stem.add("Hammad", "Vegan"));
    }
	
	@Test
    public void removeTest() {
		assertEquals(true, stem.add("Musa", "Non-Vegetarian"));
        assertEquals(false, stem.add("Musa", "Non-Vegetarian"));
        stem.remove("Musa");
        assertEquals(true, stem.add("Musa", "Non-Vegetarian"));
    }
	
	@Test
	public void changeTest() {
		assertEquals(true, stem.add("Fazil", "Vegetarian"));
        assertEquals(true, stem.add("Hammad", "Vegan"));
        assertEquals(true, stem.change("Fazil", "Non-Vegetarian"));
        assertEquals(true, stem.change("Hammad", "Pescatarian"));
	}
	
	@Test
	public void getTest() {
		assertEquals(true, stem.add("Musa", "Non-Vegetarian"));
        assertEquals(true, stem.add("Sri", "Pescatarian"));
        assertEquals("Non-Vegetarian", stem.get("Musa"));
        assertEquals("Pescatarian", stem.get("Sri"));
	}
}
