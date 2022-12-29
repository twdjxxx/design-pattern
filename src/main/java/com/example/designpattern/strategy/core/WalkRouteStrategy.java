package com.example.designpattern.strategy.core;

import com.example.designpattern.strategy.RouteDTO;
import org.springframework.stereotype.Component;

@Component
public class WalkRouteStrategy implements RouteStrategy{
    private final String media = "walk";

    @Override
    public RouteDTO calculateRoute() {
        RouteDTO routeDTO = new RouteDTO();
        routeDTO.setTransportationMedia(this.media);
        routeDTO.setShortestRoute("walk route A");
        routeDTO.setBackupRoute("walk route B");
        return routeDTO;
    }

    @Override
    public boolean isMatch(String transportationMedia) {
        return this.media.equals(transportationMedia);
    }
}
