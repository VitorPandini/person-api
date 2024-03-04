package io.github.vitorpandini.personapi.core.usecases;

import io.github.vitorpandini.personapi.core.entities.Person;

public interface CreatePersonUseCase {

    Person execute (Person person);
}
