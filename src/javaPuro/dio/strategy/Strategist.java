package dio.strategy;

public class Strategist {
	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void plan() {
		strategy.mover();
	}
}
