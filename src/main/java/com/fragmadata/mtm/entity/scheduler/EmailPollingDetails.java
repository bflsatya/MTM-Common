package com.fragmadata.mtm.entity.scheduler;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fragmadata.mtm.enums.scheduler.SchedulerStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "EmailPollingDetails")
@Getter
@Setter
public class EmailPollingDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EmailPollingId")
    private Long id;

    @Column(name = "StartDateTime")
    private LocalDateTime startDateTime;

    @Column(name = "EndDateTime")
    private LocalDateTime endDateTime;

    @Column(name = "NoOfEmailsDownloaded")
    private int noOfEmailsDownloaded;

    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    private SchedulerStatus status;

    @OneToMany(mappedBy = "emailPollingDetails",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JsonIgnore
    private List<EmailPollingStatusHistory> emailStatusHistories;

    @Version
    @Column(name = "Version")
    private Long version;
}

