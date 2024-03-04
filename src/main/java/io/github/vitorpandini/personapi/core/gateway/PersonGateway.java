package io.github.vitorpandini.personapi.core.gateway;

import io.github.vitorpandini.personapi.core.entities.Person;

public interface PersonGateway {

    Person createPerson (Person person);
}
