package bussines;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


import bean.Product;

public class ProductBussines {

	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	public void addProduct(Product p) 
	{
		int pid=p.getPid();
		String pname = p.getProName();
		float price= p.getProPrice();
	   jt.update("insert into product01 values("+pid + ",'" + pname + "'," + price +")");
	   System.out.println("Record inserted");
	}
	
	public void updateProduct(int pid) 
	{
		jt.update("update Product01 set ProPrice= ProPrice-500 where pid="+pid);
		System.out.println("records updated"); 
	}
	
	public void deleteProduct(int pid) 
	{
		jt.update("delete from  Product01  where pid="+pid);
		System.out.println("records deleted"); 
	}
	
	
	public void showAllProduct() 
	{
		List l= jt.queryForList("select * from product01");
		
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			 
			System.out.println(itr.next());
		}
	}
	
	
}
