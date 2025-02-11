package com.fragmadata.mtm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EmailInstance")
public class EmailInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmailInstanceID")
    private Long emailInstanceId;

    @Column(name = "Uid")
    private long uid;

    @Column(name = "OutlookIDForEmail")
    private String conversationId;

    @Column(name = "FromEmail")
    private String from;

    @Column(name = "ToEmail")
    private String to;

    @Column(name = "Subject")
    private String subject;

    @Column(name = "EmailBody")
    private String emailBody;

//	@Column(name = "EmailStoredAsBLOB")
//	private byte[] emailStoredAsBlob;

    @ManyToOne
    @JoinColumn(name = "EmailMasterID", nullable = false)
    private Email email;

    @Column(name = "Status")
    private String status;

    @Column(name = "StatusLog")
    private String failureReason;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "emailInstance")
    private List<EmailAttachmentInstance> emailAttachmentInstance;

    @OneToMany(mappedBy = "emailInstance")
    private List<MTMParsedData> mtmParsedData;

    @Column(name = "EmailReceivedDateTime")
    private LocalDateTime emailReceivedDateTime;

    @Column(name = "EmailFilePathInFileSystem")
    private String emailFilePathInFileSystem;

    @Column(name = "NextRetryDate")
    private LocalDateTime nextRetryDate;

    @Column(name = "RetryCount")
    private Integer retryCount;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @Version
    @Column(name = "Version")
    private Integer version;

}