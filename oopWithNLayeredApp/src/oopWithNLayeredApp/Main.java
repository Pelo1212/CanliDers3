package oopWithNLayeredApp;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.entities.Product;

public class Main {
// arayüz iş birimiyle iletişim kurar veri tabanına gidemez. iş birimi kim ProductManager
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",10000);//ekrandan arayüzden bunların alındığını düşün sonra iş birimini çağırıyoruz
		                                                     // iş birimi de kurallarına uymuyorsa bağırıyor uyuyorsa veri tabanına ekledi.veri tabanıda kaydetti kendine
        
		
		Logger [] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};   //burda iki data yolladım ilk elemanım database 2. email
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
	}

}
