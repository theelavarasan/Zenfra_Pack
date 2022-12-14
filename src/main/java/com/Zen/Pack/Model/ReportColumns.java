package com.Zen.Pack.Model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "ZenFra_Table")
public class ReportColumns {

    @Column(name="device_type")
    private String deviceType;

    @Id
    @Column(name="report_data_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="report_name")
    private String reportName;

    @Column(name="data_type")
    private String dataType;

    @Column(name="is_size_metrics")
    private String isSizeMetrics;

    @Column(name="seq")
    private String seq;

    @Column(name="column_name")
    private String columnName;

    @Column(name="report_by")
    private String reportBy;

    @Column(name="db_field_name")
    private String dbFieldName;

    @Column(name="is_pinned")
    private boolean isPinned;

    @Column(name="alias_name")
    private String aliasName;

    @Column(name="devices")
    private String devices;

    @Column(name="tasklist_category")
    private String taskListCategory;

    @Column(name="category_seq")
    private Integer categorySeq;

    @Column(name="sub_category_seq")
    private Integer subCategorySeq;

    @Column(name="hide")
    private boolean hide;

    @Column(name="takslist_sub_category")
    private String taskListSubCategory;
}
