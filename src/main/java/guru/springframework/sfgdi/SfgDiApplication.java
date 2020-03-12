package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controllers.*;
import guru.springframework.sfgdi.Controllers.FactoryMode.FactoryConstructorInjectedController;
import guru.springframework.sfgdi.Controllers.FactoryMode.FactoryController;
import guru.springframework.sfgdi.Controllers.FactoryMode.FactoryPropertyInjectedController;
import guru.springframework.sfgdi.Controllers.FactoryMode.FactorySetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework", "guru.Services"}) --> when move Services package out of sfgdi scope and inside guru.springframework
public class SfgDiApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		// naming convention: using getBean to get the controller class you must specify the class name with lowercase starter.
		System.out.println("---------Factory Mode Starts---------------");
		FactoryController factoryController = (FactoryController)ctx.getBean(FactoryController.class);
		System.out.println(factoryController.hello());
		System.out.println(ctx.getBean(FactoryPropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(FactorySetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(FactoryConstructorInjectedController.class).sayHello());
		System.out.println("----------Factory Mode Ends------------");



		MyController myController = (MyController) ctx.getBean(MyController.class);

		System.out.println("-------- Primary Bean -------");
		System.out.println(myController.sayHello());

		I18nController i18nController = (I18nController)ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());



		System.out.println("-------- property injected controller ----------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		String greeting2 = propertyInjectedController.sayHello();
		System.out.println(greeting2);

		System.out.println("-------- setter injected controller ----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		String greeting3 = setterInjectedController.sayHello();
		System.out.println(greeting3);

		System.out.println("-------- constructor injected controller ----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		String greeting4 = constructorInjectedController.sayHello();
		System.out.println(greeting4);

	}

}
