package com.Zen.Pack.Repository;

import com.Zen.Pack.Model.ReportColumns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportColumnsRepository extends JpaRepository<ReportColumns, Long> {
}
