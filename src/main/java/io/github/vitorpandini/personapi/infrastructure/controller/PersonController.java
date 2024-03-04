package io.github.vitorpandini.personapi.infrastructure.controller;


import io.github.vitorpandini.personapi.core.usecases.CreatePersonUseCase;
import io.github.vitorpandini.personapi.infrastructure.PersonDtoMapper;
import io.github.vitorpandini.personapi.infrastructure.dtos.PersonDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/person")
@AllArgsConstructor
public class PersonController {

    private final CreatePersonUseCase personUseCase;

    private final PersonDtoMapper personDtoMapper;

    @PostMapping
    public ResponseEntity<PersonDTO> createPerson(@RequestBody PersonDTO personDTO){

        var personNew =personUseCase.execute(personDtoMapper.toDomain(personDTO));

        return ResponseEntity.status(HttpStatus.CREATED).body(personDtoMapper.toDto(personNew));
    }
}
