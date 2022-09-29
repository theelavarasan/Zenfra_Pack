package com.Zen.Pack.Controller;

import com.Zen.Pack.Model.ReportColumns;
import com.Zen.Pack.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping("/insertReportColumns")
    public ReportColumns insertReportColumns(@RequestBody ReportColumns reportColumns){
        return reportService.save(reportColumns);
    }
}
