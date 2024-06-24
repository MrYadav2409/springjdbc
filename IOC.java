package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Product;
import bussines.ProductBussines;

public class IOC {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");
		ProductBussines b= ctx.getBean(ProductBussines.class);
		Product p =new Product();
		p.setPid(3);
		p.setProName("Spring mvc");
		p.setProPrice(4000.2f);
		//b.addProduct(p);
		//b.updateProduct(1);
		//b.deleteProduct(111);
		b.showAllProduct();
	}

}
