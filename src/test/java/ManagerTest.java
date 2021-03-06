import org.junit.Before;
import org.junit.Test;
import staff.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Boss Brian", "123", 28000.00, "Support");
    }

    @Test
    public void hasName() {
        assertEquals("Boss Brian", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("123", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(28000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void hasDept() {
        assertEquals("Support", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100.00);
        assertEquals(28100.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canPayBonus() {
        assertEquals(280.00, manager.payBonus(), 0.001);
    }

    @Test
    public void wontAcceptNegativePayRaise() {
        manager.raiseSalary(-2000.00);
        assertEquals(28000.00, manager.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        manager.setName("Boss Bob");
        assertEquals("Boss Bob", manager.getName());
    }

    @Test
    public void wontAcceptNullValueWhenChangingName() {
        manager.setName("");
        assertEquals("Boss Brian", manager.getName());
    }

}
