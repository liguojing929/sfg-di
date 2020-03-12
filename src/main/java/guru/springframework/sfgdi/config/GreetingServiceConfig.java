package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingRepository;
import guru.springframework.sfgdi.Services.FactoryMode.FactoryGreetingService;
import guru.springframework.sfgdi.Services.FactoryMode.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {
    @Bean
    GreetingServiceFactory greetingServiceFactory(FactoryGreetingRepository repo) {
        return new GreetingServiceFactory(repo);
    }


    @Bean
    @Primary
    @Profile({"default", "en"})
    FactoryGreetingService primaryEnglishGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    FactoryGreetingService primarySpanishGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    FactoryGreetingService primaryGermanGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("de");
    }
}
