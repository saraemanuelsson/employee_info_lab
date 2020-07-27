import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseadminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Data David", "789", 33000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Data David", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("789", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(34000.00, databaseAdmin.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(330.00, databaseAdmin.payBonus(), 0.001);
    }

}
