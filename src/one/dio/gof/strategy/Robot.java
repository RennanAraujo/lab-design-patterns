package one.dio.gof.strategy;

public class Robot {
	private Behavior behavior;
	public void setStrategy(Behavior behavior){
		this.behavior = behavior;
	}

	public void move(){
		behavior.move();
	}
}
