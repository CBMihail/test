package testautomation.testautomation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestAutomationApplicationTests {

	@Test
	void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();

		String helloWorld = restTemplate.getForEntity("https://newpipelinewebapp.azurewebsites.net", String.class).getBody();

		assertEquals(helloWorld, "HELLO WORLD CI/CD");
	}

}
