package hellocucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty"},
//    features = "/world/code/hellocucumber/src/test/resources/hellocucumber/is_it_friday_yet.feature"
    features = "/world/code/hellocucumber/src/test/resources/hellocucumber/hello.feature"
)
public class RunCucumberTest {
}
