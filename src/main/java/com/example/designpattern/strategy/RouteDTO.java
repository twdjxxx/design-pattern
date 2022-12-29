package com.example.designpattern.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RouteDTO {
    private String transportationMedia;
    private String shortestRoute;
    private String backupRoute;
}
