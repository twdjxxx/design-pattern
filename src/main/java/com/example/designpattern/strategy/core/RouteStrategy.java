package com.example.designpattern.strategy.core;

import com.example.designpattern.strategy.RouteDTO;

public interface RouteStrategy {
    RouteDTO calculateRoute();

    boolean isMatch(String transportationMedia);
}
