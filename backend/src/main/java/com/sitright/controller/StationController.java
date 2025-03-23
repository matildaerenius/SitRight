package com.sitright.controller;

import com.sitright.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StationController {

    @Autowired
    private StationService stationService;

    @PostMapping("/calculate-seat")
    public String calculateSeat(@RequestParam String startStation,
                                @RequestParam String exit,
                                @RequestParam String endStationOrAddress) {
        return stationService.calculateSeat(startStation, exit, endStationOrAddress);
    }
}
