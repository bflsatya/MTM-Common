package com.fragmadata.mtm.entity;

import com.fragmadata.mtm.enums.EmailStatus;
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

    @ManyToOne
    @JoinColumn(name = "EmailAttachmentInstanceID", nullable = false)
    private EmailAttachmentInstance emailAttachmentInstance;

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
