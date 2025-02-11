package com.fragmadata.mtm.entity;

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
@Table(name = "FileAttachmentSheetInstance")
public class FileAttachmentSheetInstance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FileAttachmentSheetInstanceID")
    private Long fileAttachmentSheetInstanceId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "EmailAttachmentInstanceID", referencedColumnName = "EmailAttachmentInstanceID")
    private EmailAttachmentInstance emailAttachmentInstance;

    @ManyToOne
    @JoinColumn(name = "ParentSheetMasterID", referencedColumnName = "ParentSheetMasterID")
    private ParentSheet parentSheetMaster;

    @Column(name = "SheetName")
    private String sheetName;

    @Enumerated(EnumType.STRING)
    @Column(name = "Status")
    private EmailStatus status;

    @Column(name = "StatusLog")
    private String failureReason;

    @Column(name = "RecordsImported")
    private Integer recordsImported;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "UpdatedBy")
    private String updatedBy;

    @Column(name = "UpdatedDate")
    private LocalDateTime updatedDate;

    @OneToMany(mappedBy = "fileAttachmentSheetInstance")
    private List<MTMParsedData> mtmParsedData;

    @Column(name = "NextRetryDate")
    private LocalDateTime nextRetryDate;

    @Column(name = "RetryCount")
    private int retryCount;

    @Version
    @Column(name = "Version")
    private Long version;

}
