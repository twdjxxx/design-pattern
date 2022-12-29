package com.example.designpattern.strategy.core;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import com.example.designpattern.strategy.RouteDTO;

@Component
@RequiredArgsConstructor
public class WalkingRouteStrategy implements RouteStrategy{
    @Override
    public boolean isMatch(String transportationMedia) {
        return "WALKING".equals(transportationMedia);
    }

    @Override
    public RouteDTO calculateRoute() {
        return null;
    }
}
