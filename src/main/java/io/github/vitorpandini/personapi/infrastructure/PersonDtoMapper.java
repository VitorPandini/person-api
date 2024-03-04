package io.github.vitorpandini.personapi.infrastructure;

import io.github.vitorpandini.personapi.core.entities.Person;
import io.github.vitorpandini.personapi.infrastructure.dtos.PersonDTO;
import org.springframework.stereotype.Component;

@Component
public class PersonDtoMapper {

    public PersonDTO toDto(Person person){
        return new PersonDTO(person.name(), person.email(), person.cpfCnpj(),person.type());
    }

    public Person toDomain(PersonDTO personDTO){
        return new Person(null, personDTO.name(), personDTO.email(), personDTO.cpfCnpj(), personDTO.typePerson());
    }
}
