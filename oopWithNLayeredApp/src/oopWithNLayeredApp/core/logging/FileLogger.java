package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override                        // logger ı implemente ettiysen onun metodlarını kullanmalısın o yüzden override burda ama kullanmadık
	public void log(String data) {
		System.out.println("dosyaya loglandı:"+ data);
		
	}

}
