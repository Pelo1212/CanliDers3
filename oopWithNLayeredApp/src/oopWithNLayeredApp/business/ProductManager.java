package oopWithNLayeredApp.business;

import java.util.List;
import java.util.logging.Logger;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product; //6. satırdan import ettim

public class ProductManager {                            // iş katmanı burası iş katmanına parametre product yazınca iş katmanına ürün geldi demek
	                                                     // bu ürün nerden geldi arayüzde kullanıcı girdi
  private ProductDao productDao;	
  private oopWithNLayeredApp.core.logging.Logger[] loggers;                        // yönetim diyorki aynı anda dosyaya da logla veri tabanına da logla mail de gönder o yüzden bunu yazdık
  
  
	public ProductManager(ProductDao productDao, oopWithNLayeredApp.core.logging.Logger[] loggers2) {      // burası ne demek ProductManager newlendiğinde bana bir ProductDao ver. buraya bağımlılık enjeksiyonu denir
    this.productDao = productDao;          
    this.loggers=loggers2;
}
	public void add(Product product) throws Exception { // bana bir product ver onunla ilgili işlerimi yapayım parametreme yazdım
		// buraya iş kuralları yazılır.
		//iş kuralları
		
		if(product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz");  //yeni hata fırlat ife girerse program durur if i geçerse girdiğin şeyler uygun hata fırlatmaz ve devam eder.
		}
		
		productDao.add(product);
		
		for(oopWithNLayeredApp.core.logging.Logger logger: loggers) {  // [db,mail] sırayla önce db nin logu çalışıyor sonra mailin gibi gibi...
			logger.log(product.getName());
		}
	}

}
