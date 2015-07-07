package br.com.jorgeacetozi.cdi.rest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.junit.Before;

public abstract class BaseApiIntegrationTest {
	protected Properties prop;
	protected String url_base;
	
	@Before
	public void setup() throws IOException {
		prop = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		prop.load(inputStream);
		url_base = prop.getProperty("url_base");
	}
}
