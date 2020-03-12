package guru.springframework.sfgdi.Services.FactoryMode;

public class GreetingServiceFactory {

    private FactoryGreetingRepository factoryGreetingRepository;

    public GreetingServiceFactory(FactoryGreetingRepository factoryGreetingRepository) {
        this.factoryGreetingRepository = factoryGreetingRepository;
    }

    public FactoryGreetingService createGreetingService(String lang) {
        switch (lang) {
//            case "en":
//                return new PrimaryEnglishGreetingService(factoryGreetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(factoryGreetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(factoryGreetingRepository);
            default:
                return new PrimaryEnglishGreetingService(factoryGreetingRepository);
        }
    }
}
