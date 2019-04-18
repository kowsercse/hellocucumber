package hellocucumber;

import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Config.class)
public class SpringStepdefs {
  @Autowired
  private PrototypeBean prototypeBean;
  @Autowired
  private SingletonBean singletonBean;
  @Autowired
  private CucumberGlueBean cucumberGlueBean;

  @Given("do something with prototype bean")
  public void usePrototypeBean() {
    prototypeBean.doPrototypeWork();
  }

  @Given("do something with singleton bean")
  public void useSingletonBean() {
    singletonBean.doSingletonWork();
  }

  @Given("do something with cucumber glue bean")
  public void doSomethingWithCucumberGlueBean() {
    cucumberGlueBean.doSomething();
  }

}
