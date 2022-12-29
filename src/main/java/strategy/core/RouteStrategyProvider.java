package strategy.core;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RouteStrategyProvider {
    private final List<RouteStrategy> strategyList;

    public RouteStrategy getStrategy(String transportationMedia) {
        for(RouteStrategy routeStrategy : strategyList) {
            if(routeStrategy.isMatch(transportationMedia)) {
                return routeStrategy;
            }
        }
        throw new RuntimeException("no route strategy matched");
    }
}
