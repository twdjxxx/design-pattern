package com.example.designpattern.strategy.core;

import com.example.designpattern.strategy.RouteDTO;
import org.springframework.stereotype.Component;

@Component
public class PublicTransportationRouteStrategy implements RouteStrategy{
    private final String media = "public";

    @Override
    public RouteDTO calculateRoute() {
        RouteDTO routeDTO = new RouteDTO();
        routeDTO.setTransportationMedia(this.media);
        routeDTO.setShortestRoute("public transportation route A");
        routeDTO.setBackupRoute("public transportation route B");
        return routeDTO;
    }

    @Override
    public boolean isMatch(String transportationMedia) {
        return this.media.equals(transportationMedia);
    }
}
