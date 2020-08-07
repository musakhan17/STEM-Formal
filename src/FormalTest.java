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
		stem.remove("Musa");
		assertEquals(false, stem.get("Musa"));
        assertEquals(false, stem.add("Musa", "Non-Vegetarian"));
        assertEquals(true, stem.add("Sri", "Pescatarian"));
        assertEquals(true, stem.add("Fazil", "Vegetarian"));
        assertEquals(true, stem.add("Hammad", "Vegan"));
    }
	
	

}
