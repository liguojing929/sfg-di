package guru.springframework.sfgdi.Services.FactoryMode;

import org.springframework.stereotype.Component;

@Component
public class FactoryGreetingRepositoryImpl implements FactoryGreetingRepository {
    @Override
    public String sayHelloInEnglish() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String sayHelloInSpanish() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String sayHelloInGerman() {
        return "Primärer Grußdienst";
    }
}
