package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SheetMaster")
@DynamicInsert
@DynamicUpdate
public class SheetMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SheetMasterID")
	private Long sheetMasterId;

	@OneToOne
	@JoinColumn(name = "ParentSheetMasterID", nullable = false)
	@JsonManagedReference
	private ParentSheet parentSheet;

	@Column(name = "Delimiter")
	private String delimiter;

	@Column(name = "DataStartRowIndex")
	private int dataStartRowIndex;

	@Column(name = "HeaderRowIndex")
	private int headerRowIndex;

	@Column(name = "HeaderStartColumnIndex")
	private String headerStartColumnIndex;

	@Column(name = "HeaderEndColumnIndex")
	private String headerEndColumnIndex;

	@Column(name = "IsMTMCalculationRequired")
	private boolean isMtmCalculationRequired;

	@Column(name = "MTMCalculationType")
	private String mtmCalculationType;

	@Column(name = "MTMFormula")
	private String mtmFormula;

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

	@OneToMany(mappedBy = "sheet", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<SheetFieldMapping> sheetFieldMapping=new ArrayList<>();

	@OneToMany(mappedBy = "sheetMaster", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<SheetColumnMaster> sheetColumns = new ArrayList<>();

}
