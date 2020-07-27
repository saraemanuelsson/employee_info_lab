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

}
