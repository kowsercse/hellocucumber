package hellocucumber;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PrototypeBean {
  public PrototypeBean() {
    System.out.println("Prototype constructor: " + this);
  }

  public void doPrototypeWork() {
    System.out.println("Prototype bean method: " + this);
  }
}
