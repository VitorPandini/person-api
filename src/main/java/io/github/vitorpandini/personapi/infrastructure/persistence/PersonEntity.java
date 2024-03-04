package io.github.vitorpandini.personapi.infrastructure.persistence;

import io.github.vitorpandini.personapi.core.enums.EnumTypePerson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_person")
@NoArgsConstructor @AllArgsConstructor @Builder @Data
public class PersonEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private EnumTypePerson type;
}
