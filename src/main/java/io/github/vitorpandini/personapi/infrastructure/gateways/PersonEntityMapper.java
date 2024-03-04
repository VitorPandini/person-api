package io.github.vitorpandini.personapi.infrastructure.gateways;

import io.github.vitorpandini.personapi.core.entities.Person;
import io.github.vitorpandini.personapi.infrastructure.persistence.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonEntityMapper {

    public PersonEntity toEntity(Person person){
        return new PersonEntity(person.id(), person.name(), person.email(), person.cpfCnpj(), person.type());
    }

    public Person toPerson(PersonEntity entity){
        return new Person(entity.getId(), entity.getName(), entity.getEmail(), entity.getCpfCnpj(), entity.getType());
    }
}
