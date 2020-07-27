import org.junit.Before;
import org.junit.Test;
import staff.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before() {
        director = new Director("CEO Cindy", "007", 150000.00, "Exec", 1000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("CEO Cindy", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("007", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(150000.00, director.getSalary(), 0.001);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Exec", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000.00, director.getBudget(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(160000.00, director.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(3000.00, director.payBonus(), 0.001);
    }


}
