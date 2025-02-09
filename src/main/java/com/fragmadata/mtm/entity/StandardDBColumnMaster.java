package com.fragmadata.mtm.entity;

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
@Table(name = "StandardDBColumnsMaster")
public class StandardDBColumnMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StandardDBColumnMasterID")
	private Long  standardDBColumnMasterId;
	
	@Column(name = "DBColumnName")
	private String dbColumnName;
	
	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;
	
}
