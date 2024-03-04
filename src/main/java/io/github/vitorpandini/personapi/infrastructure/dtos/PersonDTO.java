package io.github.vitorpandini.personapi.infrastructure.dtos;

import io.github.vitorpandini.personapi.core.enums.EnumTypePerson;

public record PersonDTO(
        String name,
        String email,
        String cpfCnpj,
        EnumTypePerson typePerson
) {
}
