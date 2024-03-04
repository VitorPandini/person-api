package io.github.vitorpandini.personapi.core.entities;

import io.github.vitorpandini.personapi.core.enums.EnumTypePerson;

public record Person(Long id, String name, String email, String cpfCnpj, EnumTypePerson type) {
}
