package one.dio.gof.singleton;

public class AppSingleton {

	public static void main(String[] args) {
		LazySingleton lazySingleton= LazySingleton.getInstance();
		System.out.println(lazySingleton);
		lazySingleton = LazySingleton.getInstance();
		System.out.println(lazySingleton);
		//Same memory address
	}
}
