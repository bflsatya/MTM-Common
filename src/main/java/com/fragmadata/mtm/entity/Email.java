package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "EmailMaster")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "EmailMasterID")
    private Long emailMasterId;
    
	@Column(name = "EmailAddress")
	private String emailAddress;
	
	@ManyToOne
    @JoinColumn(name = "CounterPartyID",  nullable = false)
	@JsonBackReference
    private CounterParty counterParty;
	
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
	
    @OneToMany(mappedBy = "email",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    @JsonIgnore
    private List<FileMaster> file=new ArrayList<>();
    
    @OneToMany(mappedBy = "email")
    @JsonManagedReference
    @JsonIgnore
    private List<EmailInstance> emailInstance;

}
