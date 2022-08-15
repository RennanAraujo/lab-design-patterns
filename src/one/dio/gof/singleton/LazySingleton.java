package one.dio.gof.singleton;

public class LazySingleton {
	//Nao disponibiliza a instancia
	private static LazySingleton instance;

	private LazySingleton() {
		super();
	}

	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
