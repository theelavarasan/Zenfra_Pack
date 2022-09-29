package com.Zen.Pack.Service;

import com.Zen.Pack.Model.ReportColumns;
import com.Zen.Pack.Repository.ReportColumnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    private ReportColumnsRepository reportColumnsRepository;

    public ReportColumns save(ReportColumns reportColumns) {
        return reportColumnsRepository.save(reportColumns);
    }
}
