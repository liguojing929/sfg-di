package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebeans.SampleDataSource;
import guru.springframework.sfgdi.examplebeans.SampleJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
/**
 * we can annotate the properties files in the following ways too.
//option1: @PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
//option2: @PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
    })
*/

public class PropertyConfig {
//    @Autowired
//    Environment evn;
    @Value("${guru.username}") // wired the properties field
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;
    @Value("${guru.jms.username}")
    String jmsUsername;
    @Value("${guru.jms.password}")
    String jmsPassword;
    @Value("${guru.jms.url}")
    String jmsURL;

    @Value("${customizeName}")
    String customizedName;

    @Bean
    public SampleDataSource sampleDataSource() {
        SampleDataSource sampleDataSource = new SampleDataSource();
        //sampleDataSource.setUsername(evn.getProperty("USERNAME"));
        sampleDataSource.setUsername(user);
        sampleDataSource.setPassword(password);
        sampleDataSource.setDbURL(url);
        sampleDataSource.setCustomizeName(customizedName);
        return sampleDataSource;
    }

    @Bean
    public SampleJmsBroker sampleJmsBroker() {
        SampleJmsBroker sampleJmsBroker = new SampleJmsBroker();
        sampleJmsBroker.setUsername(jmsUsername);
        sampleJmsBroker.setPassword(jmsPassword);
        sampleJmsBroker.setUrl(jmsURL);
        return sampleJmsBroker;
    }

//    @Bean // the "PropertySourcePlaceHolderConfigurer" will scan and read the properties file for us
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
//                new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
