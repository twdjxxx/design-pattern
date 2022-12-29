package com.example.designpattern.strategy.core;

import org.springframework.stereotype.Service;
import com.example.designpattern.strategy.RouteDTO;

public interface RouteStrategy {
    RouteDTO calculateRoute();

    boolean isMatch(String transportationMedia);
}
