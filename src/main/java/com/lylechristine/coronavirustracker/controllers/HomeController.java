package com.lylechristine.coronavirustracker.controllers;

import com.lylechristine.coronavirustracker.models.LocationStats;
import com.lylechristine.coronavirustracker.services.CoronavirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.NumberFormat;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronavirusDataService coronavirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronavirusDataService.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        String formattedTotalCases = NumberFormat.getIntegerInstance().format(totalReportedCases);
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", formattedTotalCases);
        return "home";
    }
}
