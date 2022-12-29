package com.example.designpattern.strategy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class RouteDTO {
    private String transportationMedia;
    private String shortestRoute;
    private String backupRoute;
}
