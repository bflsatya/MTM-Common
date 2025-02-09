package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "FileMaster")
public class FileMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FileMasterID")
	private Long fileMasterId;

	@Column(name = "FilePattern")
	private String filePattern;

	@Column(name = "FileAdapter")
	private String fileAdapter;

	@Column(name = "SampleFileName")
	private String sampleFileName;

	@ManyToOne
	@JoinColumn(name = "EmailMasterID", nullable = false)
	@JsonBackReference
	private Email email;

	@Column(name = "FileExtension")
	private String fileExtension;

	@Column(name = "Password")
	private String password;

	@Column(name = "IsMashreqPerspective")
	private Boolean isMashreqPerspective;

	@Column(name = "MTMDays")
	private Integer mtmDays;

	@Column(name = "WeekendDays")
	private Integer weekendDays;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;
	@Column(name = "SampleFilePathInFileSystem")
	private String filePath;
	@Column(name = "IsActive")
	private Boolean isActive;
	
	@OneToMany(mappedBy = "file", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
    private List<ParentSheet> parentSheet=new ArrayList<>();
	
	@OneToMany(mappedBy = "file")
	@JsonManagedReference
	private List<EmailAttachmentInstance> emailAttachmentInstance;
	
	//@OneToOne(mappedBy = "file", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//private FileBody fileBody;
	
	
	@OneToMany(mappedBy = "file")
	@JsonManagedReference
	private List<MTMParsedData> mtmParsedData;

}
