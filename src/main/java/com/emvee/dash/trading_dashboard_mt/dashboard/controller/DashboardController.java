package com.emvee.dash.trading_dashboard_mt.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping
    public String index() {
        return "UP";
    }

}
