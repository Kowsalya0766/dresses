package com.niit.dresses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   System.out.println( "Hello World!" );
   AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
   /*ApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class,ProductDaoImpl.class);*/
   context.scan("com.niit");
   context.refresh();
   ProductDao productDao=(ProductDao)context.getBean("productDao");
Product product = productDao.getProduct(5);
   product.setPrice(400);
   product.setQuantity(25);
   product.setProductdescription("Made with fresh raspberries");
   product.setProductname("Fresh Raspberry cake");
   productDao.updateProduct(product);
/*Product product =new Product();
  product.setProductname("Fresh Strawberry");
   product.setProductdescription("Made with real strawberries, this pretty pink cake ");
   product.setPrice(400);
   product.setQuantity(25);
   productDao.saveProduct(product);*/
    
  /* System.out.println("the prise is:"+product.getPrice());
   System.out.println("the prise is:"+product.getProductdesc());
   System.out.println("the prise is:"+product.getQuantity());*/
 /*  productDao.deleteProduct(2);*/
    }
}
