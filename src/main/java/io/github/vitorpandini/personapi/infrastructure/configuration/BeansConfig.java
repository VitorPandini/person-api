package io.github.vitorpandini.personapi.infrastructure.configuration;

import io.github.vitorpandini.personapi.core.gateway.PersonGateway;
import io.github.vitorpandini.personapi.core.usecases.CreatePersonUseCase;
import io.github.vitorpandini.personapi.core.usecases.CreatePersonUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway){
        return new CreatePersonUseCaseImpl(personGateway);
    }
}
