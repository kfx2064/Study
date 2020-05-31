package me.whiteship.springinit;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

//@SpringBootApplication
public class SpringinitApplication {

	public static void main(String[] args) throws LifecycleException {

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8080);
		
		String docBase = String.valueOf("");
		
		try {
			docBase = Files.createTempDirectory("tomcat-basedir").toString();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		String startPath = String.valueOf("/");
		Context context = tomcat.addContext(startPath, docBase);
		
		HttpServlet servlet = new HttpServlet() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -6256352809672498594L;

			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
				PrintWriter writer = null;
				try {
					writer = resp.getWriter();
				} catch (IOException e) {
					e.printStackTrace();
				}
				writer.println("<html><head><title>");
				writer.println("Hey, Tomcat");
				writer.println("</title></head>");
				writer.println("<body><h1>Hello Tomcat</h1></body>");
				writer.println("</html>");
			}
		};
		
		String servletName = "helloServlet";
		tomcat.addServlet("/", servletName, servlet);
		context.addServletMappingDecoded("/hello", servletName);
		
		try {
			tomcat.start();
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		
		/*SpringApplication application = new SpringApplication(SpringinitApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);*/
		
		//SpringApplication.run(SpringinitApplication.class, args);
	}

}

