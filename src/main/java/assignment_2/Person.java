package assignment_2;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Getter
@EqualsAndHashCode
@ToString
@Builder
@Jacksonized
public class Person {
    private String id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String gender;

    private Person(String id, String firstName, String lastName, Integer age, String gender) {
        if (id == null) throw new IllegalArgumentException("id cannot be null");
        if (firstName == null || firstName.trim().isEmpty()) throw new IllegalArgumentException("firstName cannot be null or blank");
        if (lastName == null || lastName.trim().isEmpty()) throw new IllegalArgumentException("lastName cannot be null or blank");
        if (age < 0) throw new IllegalArgumentException("age cannot be negative");
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
}
