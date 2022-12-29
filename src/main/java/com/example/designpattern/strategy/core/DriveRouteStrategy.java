package com.example.designpattern.strategy.core;

import com.example.designpattern.strategy.RouteDTO;
import org.springframework.stereotype.Component;

@Component
public class DriveRouteStrategy implements RouteStrategy{
    private final String media = "drive";

    @Override
    public RouteDTO calculateRoute() {
        RouteDTO routeDTO = new RouteDTO();
        routeDTO.setTransportationMedia(this.media);
        routeDTO.setShortestRoute("drive route A");
        routeDTO.setBackupRoute("drive route B");
        return routeDTO;
    }

    @Override
    public boolean isMatch(String transportationMedia) {
        return this.media.equals(transportationMedia);
    }
}
