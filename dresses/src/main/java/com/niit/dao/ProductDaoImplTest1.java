package com.niit.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.model.Product;

import junit.framework.TestCase;

public class ProductDaoImplTest1 extends TestCase {
	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDao.class);
    ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
	public void testSaveProduct() {
		Product product=new Product();
		product.setPrice(100);
		product.setQuantity(1);
		product.setProductname("water Bottle");
		product.setProductdescription("blue color-1 litre");
		product=productDao.saveProduct(product);
		assertTrue(product.getId()>0);
	}

	public void testGetProduct() {
		Product product3=productDao.getProduct(1);
		Product product1=productDao.getProduct(3);
		Product product2=productDao.getProduct(8);
		assertNotNull(product1);
		assertNotNull(product3);
		assertNull(product2);
		
		
		double expectedPrice=2000;
		double actualPrice=product1.getPrice();
		assertTrue(expectedPrice==actualPrice);
	
	}

	public void testUpdateProduct() {
		Product product=productDao.getProduct(3);
		product.setPrice(2000);
		product.setQuantity(25);
		productDao.updateProduct(product);
		assertTrue(product.getPrice()==2000);
		assertTrue(product.getQuantity()==25);
		
	
	}
	public void tesGetAllProducts()
	{
		 List<Product> products=productDao.getAllProducts();
		 assertTrue(products.size()>0);
		 assertFalse(products.isEmpty());
		 
	}
	}



