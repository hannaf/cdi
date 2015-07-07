package br.com.jorgeacetozi.cdi.rest;

import static com.jayway.restassured.RestAssured.get;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.jayway.restassured.path.json.JsonPath;

public class RestControllerIntegrationTest extends BaseApiIntegrationTest {
	private JsonPath jsonPath;
	
	@Test
	public void shouldTestUsingRestAssured() {
		String json = get(url_base).asString();
		jsonPath = new JsonPath(json);
		
		assertThat(jsonPath.getString("usuario.nome"), is("Jorge Acetozi"));
		System.out.println(json);
	}
}
