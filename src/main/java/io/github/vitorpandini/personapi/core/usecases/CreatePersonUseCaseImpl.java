package io.github.vitorpandini.personapi.core.usecases;

import io.github.vitorpandini.personapi.core.entities.Person;
import io.github.vitorpandini.personapi.core.gateway.PersonGateway;
import lombok.RequiredArgsConstructor;


public class CreatePersonUseCaseImpl implements CreatePersonUseCase{

    private final PersonGateway personGateway;

    public CreatePersonUseCaseImpl(PersonGateway personGateway) {
        this.personGateway = personGateway;
    }

    @Override
    public Person execute(Person person) {
        return personGateway.createPerson(person);
    }
}
