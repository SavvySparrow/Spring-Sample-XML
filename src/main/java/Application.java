import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sahiljalan.service.CustomerService;


public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		
		try {
			service.findAll(false,2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
