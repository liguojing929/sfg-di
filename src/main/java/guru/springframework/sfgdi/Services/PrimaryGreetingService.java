package guru.springframework.sfgdi.Services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary // specify this bean as the primary one, it won't lead to any exception even though without qualifier.
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {

        return "Hello, English Version Greeting.";
    }
}
