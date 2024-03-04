package io.github.vitorpandini.personapi.infrastructure.gateways;

import io.github.vitorpandini.personapi.core.entities.Person;
import io.github.vitorpandini.personapi.core.gateway.PersonGateway;
import io.github.vitorpandini.personapi.infrastructure.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonRepositoryGateway implements PersonGateway {

    private final PersonRepository repository;

    private final PersonEntityMapper mapper;
    @Override
    public Person createPerson(Person person) {
        var toEntity =repository.save(mapper.toEntity(person));

        return mapper.toPerson(toEntity);
    }
}
