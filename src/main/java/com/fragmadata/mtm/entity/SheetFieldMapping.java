package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SheetFieldMappingMaster")
public class SheetFieldMapping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SheetFieldMappingMasterID")
	private Long  sheetFieldMappingMasterId;
	
	@ManyToOne
	@JoinColumn(name = "SheetMasterID", nullable = false)
	@JsonBackReference
	private SheetMaster sheet;

	@Column(name = "ExcelColumnName")
	private String excelColumnName;
	
	@Column(name = "SourceColumnName")
	private String sourceColumnName;
	
	@Column(name = "dBColumnName")
	private String dbColumnName;
	
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

	@Column(name = "IsActive")
	private Boolean isActive;
}
