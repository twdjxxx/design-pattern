package strategy.core;

import org.springframework.stereotype.Service;
import strategy.RouteDTO;

@Service
public interface RouteStrategy {
    RouteDTO calculateRoute();

    boolean isMatch(String transportationMedia);
}
