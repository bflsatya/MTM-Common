package com.fragmadata.mtm.entity.scheduler;

import com.fragmadata.mtm.enums.scheduler.SchedulerStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EmailPollingStatusHistory")
@Getter
@Setter
public class EmailPollingStatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmailPollingStatusHistoryId")
    private Long id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "PollingId", referencedColumnName = "EmailPollingId", nullable = false)
    private EmailPollingDetails emailPollingDetails;

    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    private SchedulerStatus status;

    @Version
    @Column(name = "Version")
    private Long version;
}

