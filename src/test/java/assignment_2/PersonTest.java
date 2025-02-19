package assignment_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testPersonCreationValid() {
        Person person = Person.builder()
                .id("447585")
                .firstName("Ajayveer")
                .lastName("Singh")
                .age(28)
                .gender("Male")
                .build();
        assertNotNull(person);
        assertEquals("Ajayveer", person.getFirstName());
    }

    @Test
    public void testPersonCreationInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            Person.builder()
                    .id(null)
                    .firstName("Ajayveer")
                    .lastName("Singh")
                    .age(28)
                    .gender("Male")
                    .build();
        });
    }

    @Test
    public void testPersonCreationInvalidAge() {
        assertThrows(IllegalArgumentException.class, () -> {
            Person.builder()
                    .id("1")
                    .firstName("Ajayveer")
                    .lastName("Singh")
                    .age(-5)
                    .gender("Male")
                    .build();
        });
    }
}
