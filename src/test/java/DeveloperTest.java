import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Techy Tina", "456", 35000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Techy Tina", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("456", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000.00);
        assertEquals(40000.00, developer.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(350.00, developer.payBonus(), 0.001);
    }

}
