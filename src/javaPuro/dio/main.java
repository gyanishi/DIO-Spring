package dio;

import dio.Facade.Facade;
import dio.singleton.Singleton;
import dio.strategy.Strategist;
import dio.strategy.Strategy;
import dio.strategy.StrategyNonStandard;
import dio.strategy.StrategyStandard;

public class main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstancia();
		System.out.println(singleton);
		Singleton singleton2 = Singleton.getInstancia();
		System.out.println(singleton2);
		
		Strategy strategyStandard = new StrategyStandard();
		Strategy strategyNonStandard = new StrategyNonStandard();
		
		Strategist strategist = new Strategist();
		strategist.setStrategy(strategyNonStandard);
		strategist.plan();
		strategist.setStrategy(strategyStandard);
		strategist.plan();
		
		Facade facade = new Facade();
		facade.migrar("Gabriel", "07104-888");
	}

}
