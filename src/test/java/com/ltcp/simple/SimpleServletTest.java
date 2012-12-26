package com.ltcp.simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mortbay.jetty.testing.*;

public class SimpleServletTest {

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() 
			throws Exception {
		ServletTester tester = new ServletTester();
		tester.addServlet(SimpleServlet.class, "/simple");
		tester.start();
		HttpTester request = new HttpTester();
		request.setMethod("GET");
		request.setHeader("Host", "tester");
		request.setURI("/simple");
		request.setVersion("HTTP/1.0");
		HttpTester response = new HttpTester();
		response.parse(tester.getResponses(request.generate()));
		assertEquals(200,response.getStatus());
		String content = response.getContent();
		System.out.println(content);
		assertTrue(content.contains("SimpleServlet Hello World!"));
	}

}
