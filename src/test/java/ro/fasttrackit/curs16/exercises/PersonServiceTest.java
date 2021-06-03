package ro.fasttrackit.curs16.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PersonServiceTest {
    @Test
    @DisplayName("WHEN no persons are in the service THEN no person is found")
    void emptyPersonList() {
        //SETUP
        PersonService service = new PersonService(List.of());
        //RUN
        Optional<Person> result = service.getPersonById(1);
        //ASSERT
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("WHEN request an existing person THEN the person is returned")
    void existingPerson() {
        //SETUP
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.getPersonById(3);
        //ASSERT
        assertThat(result).isNotEmpty();
        assertThat(result.get())
                .extracting("id", "name", "age")
                .containsExactly(3, "Sorin", 32);
    }

    @Test
    @DisplayName("WHEN request a missing person THEN empty is returned")
    void missingPerson() {
        //SETUP
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.getPersonById(33);
        //ASSERT
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("WHEN adding a new person THEN the person is in the list")
    void addingPerson() {
        //SETUP
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.addPerson(new Person(0, "Ana", 33));
        //ASSERT
        assertThat(result).isNotEmpty();
        assertThat(result.get()).isEqualTo(new Person(5, "Ana", 33));
    }

    @Test
    @DisplayName("WHEN adding null THEN empty is returned, the list is not affected")
    void addingNullPerson() {
        //SETUP
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.addPerson(null);
        //ASSERT
        assertThat(result).isEmpty();
        assertThat(service.getPersons()).hasSize(4);
    }

    private PersonService populateService() {
        return new PersonService(List.of(
                new Person(1, "Ana", 22),
                new Person(2, "Marius", 52),
                new Person(3, "Sorin", 32),
                new Person(4, "Bianca", 31)
        ));
    }
}
