package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;           // import edildi satır7de bi pakette başka bir paket kullanmak için import edilir 

//Dao data access o yani bunun bir veri tabanı nesnesi old anlıyoruz

public class JdbcProductDao implements ProductDao {           //veri tabanına erişim işlemini gerçekleştiriyorum
    public void add(Product product) {                        // bir paketten başka bir paket kullanıcaksam onu import ediyorum ampule bas importa bas
    	                                                      // ürün eklerken al bu ürünü ekle demem lazım bunnun için paramete veriyorum
    	//sadece ve sadece db erişim kodları buraya yazılır...SQL
    	System.out.println("Jdbs ile veri tabanına eklendi");
    	
    }
}
