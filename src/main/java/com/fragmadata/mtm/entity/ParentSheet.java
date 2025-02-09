package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ParentSheetMaster")
@DynamicInsert
@DynamicUpdate
public class ParentSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ParentSheetMasterID")
    private Long parentSheetMasterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FileMasterID", nullable = false)
    @JsonBackReference
    private FileMaster file;

    @Column(name = "SheetName")
    private String sheetName;

    @Column(name = "UpdatedSheetName")
    private String updatedSheetName;

    @Column(name = "IsConfigured")
    private Boolean isConfigured;

    @Column(name = "IsActive")
    private Boolean isActive;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

//	 @Column(name = "sheet_id") // Ensure the column name matches the database schema
//	 private Long sheetId;

    @OneToOne(mappedBy = "parentSheet", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private SheetMaster sheetMaster;

    @OneToMany(mappedBy = "parentSheet", cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JsonManagedReference
    private List<MTMParsedData> mtmParsedData;

}
