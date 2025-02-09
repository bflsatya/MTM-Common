package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CounterPartyMaster")
public class CounterParty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CounterPartyID")
	private Long counterPartyId;

	@Column(name = "Name",nullable = false)
	@Nonnull
	private String name;

	@Column(name = "CustomerLiabilityID")
	private String customerLiabilityIdPrimary;
	
	@Column(name = "SecondaryCustomerLiabilityID")
	private String customerLiabilityIdSecondary;


	@Column(name = "IsCollateral")
	private Boolean isCollateral;

	@Column(name = "IsBoth")
	private Boolean isBoth;

	@Column(name = "Subject")
	private String subject;

	@Column(name = "CreatedBy")
	private String createdBy;

	@Column(name = "CreatedDate")
	private LocalDateTime createdDate;

	@Column(name = "UpdatedBy")
	private String updatedBy;

	@Column(name = "UpdatedDate")
	private LocalDateTime updatedDate;

	@OneToMany(mappedBy = "counterParty", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Email> email =new ArrayList<>();

	@OneToMany(mappedBy = "counterPartyId")
	@JsonBackReference
	@JsonIgnore
	private List<MTMParsedData> mtmParsedData;

	
	public void setEmails(List<Email> emails) {
		this.email = emails;
		for (Email email : emails) {
			email.setCounterParty(this); // Ensure bidirectional relationship
		}
	}
}
