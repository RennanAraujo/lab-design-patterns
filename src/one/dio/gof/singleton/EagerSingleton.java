package one.dio.gof.singleton;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton(){
		super();
	}

	public static EagerSingleton getInstance(){
		//Nao pergunta se é nulo, já instancia de cara
		return instance;
	}
}
