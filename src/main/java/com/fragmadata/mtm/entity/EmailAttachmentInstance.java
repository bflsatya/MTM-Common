package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fragmadata.mtm.enums.scheduler.EmailStatus;
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
@Table(name = "EmailAttachmentInstance")
public class EmailAttachmentInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmailAttachmentInstanceID")
    private Long emailAttachmentId;

    @ManyToOne
    @JoinColumn(name = "EmailInstanceID", nullable = false)
    private EmailInstance emailInstance;

    @Column(name = "AttachmentName")
    private String attachmentName;

    @Column(name = "AttachmentFilePathInFileSystem")
    private String attachmentFilePathInFileSystem;

    @Column(name = "NextRetryDate")
    private LocalDateTime nextRetryDate;

    @Column(name = "RetryCount")
    private int retryCount;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @ManyToOne
    @JoinColumn(name = "FileMasterID", nullable = false)
    @JsonBackReference
    private FileMaster file;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private EmailStatus status;

    @Column(name = "StatusLog")
    private String failureReason;

    @OneToMany(mappedBy = "emailAttachmentInstance")
    private List<FileAttachmentSheetInstance> fileAttachmentSheetInstance;

    @OneToMany(mappedBy = "emailAttachmentInstance")
    @JsonManagedReference
    private List<MTMParsedData> mtmParsedData;

    @Version
    @Column(name = "Version")
    private Long version;

}
