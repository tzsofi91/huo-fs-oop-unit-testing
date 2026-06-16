import com.codecool.animal.Animal;
import com.codecool.animal.Lion;
import com.codecool.animal.Parrot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    void testConstructor_SetsNameAgeAndHealthCorrectly() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Leo", 2, 90);

        // Assert
        assertEquals("Leo", lion.getName());
        assertEquals(2, lion.getAge());
        assertEquals(90, lion.getHealth());
    }

    @Test
    void testConstructor_AgeLessThenZero() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Test1", -1, 90);

        // Assert
        assertEquals("Test1", lion.getName());
        assertEquals(0, lion.getAge());
        assertEquals(90, lion.getHealth());
    }

    @Test
    void testConstructor_HealthLessThenZero() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Test1", 12, -1);

        // Assert
        assertEquals("Test1", lion.getName());
        assertEquals(12, lion.getAge());
        assertEquals(0, lion.getHealth());
    }

    @Test
    void testConstructor_HealthMoreThen100() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("Test1", 12, 110);

        // Assert
        assertEquals("Test1", lion.getName());
        assertEquals(12, lion.getAge());
        assertEquals(100, lion.getHealth());
    }

    @Test
    void testConstructor_NameNull() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion(null, 12, 50);

        // Assert
        assertEquals("Unnamed", lion.getName());
        assertEquals(12, lion.getAge());
        assertEquals(50, lion.getHealth());
    }

    @Test
    void testConstructor_NameEmpty() {
        // Arrange & Act
        // We test through a concrete class because Animal is abstract
        Animal lion = new Lion("", 12, 50);

        // Assert
        assertEquals("Unnamed", lion.getName());
        assertEquals(12, lion.getAge());
        assertEquals(50, lion.getHealth());
    }

    @Test
    void testGetHealthStatus_healthAbove80(){
        Animal lion = new Lion("Oroszlán", 12, 85);

        String healthStatus = lion.getHealthStatus();

        assertEquals("Healthy and Happy", healthStatus);
    }

    @Test
    void testGetHealthStatus_healthBetween50and80(){
        Animal lion = new Lion("Oroszlán", 12, 70);

        String healthStatus = lion.getHealthStatus();

        assertEquals("A bit tired", healthStatus);
    }

    @Test
    void testGetHealthStatus_Below50(){
        Animal parrot = new Parrot("Papagáj", 12, 30);

        String healthStatus = parrot.getHealthStatus();

        assertEquals("Sick or exhausted", healthStatus);
    }


}
