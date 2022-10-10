package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {    //ProductDao ile ilgili olan alternatifler şöyle bir operasyon içerebilmelidir.eğer iplement etmişsem kesin içermeli.
	void add(Product product);   // operasyonda bu            alternatifim bu örnekte JDBS ve hibernate
	

}
