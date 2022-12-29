package strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import strategy.core.RouteStrategy;
import strategy.core.RouteStrategyProvider;

@Service
@RequiredArgsConstructor
public class RouteService {

    private RouteStrategyProvider routeStrategyProvider;

    public RouteDTO calculateRoute(String transportationMedia) {
        RouteStrategy strategy = routeStrategyProvider.getStrategy(transportationMedia);
        return strategy.calculateRoute();
    }
}
