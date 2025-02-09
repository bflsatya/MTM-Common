package com.fragmadata.mtm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name = "SheetColumnMaster")
public class SheetColumnMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SheetColumnMasterID")
    private Long sheetColumnMasterId;

    @ManyToOne
    @JoinColumn(name = "SheetMasterID", nullable = false)
    private SheetMaster sheetMaster;

    @Column(name = "ExcelColumnName")
    private String excelColumnName;

    @Column(name = "SourceColumnName")
    private String sourceColumnName;

    @Column(name = "IsMandatory")
    private boolean isMandatory;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

}
