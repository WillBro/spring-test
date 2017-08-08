package uk.co.trycatchfinallysoftware;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.trycatchfinallysoftware.service.ServiceInterface;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@ContextConfiguration(classes = Application.class)
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class FirstIntegrationTest {

    @Autowired
    ServiceInterface serviceInterface;

    @Test
    public void serviceInterfaceInstance() {
        assertThat(serviceInterface, instanceOf(ServiceInterface.class));
    }

    @Test
    public void failForBatman() {
        assertThat(serviceInterface.getName(), is("Batman"));
    }

    @Test
    public void passForSpiderman() {
        assertThat(serviceInterface.getName(), is("Spiderman"));
    }

    @Test
    public void testNotNull() {
        Object myObject = new Object();

        assertThat(myObject, notNullValue());
    }

    @Ignore
    public void ignoredTest() {
        // Ignored
    }
}
