package com.fragmadata.mtm.entity.scheduler;

import com.fragmadata.mtm.enums.scheduler.SchedulerStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "EmailProcessingSchedulerDetails")
public class EmailProcessingSchedulerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "StartDateTime")
    private LocalDateTime startDateTime;

    @Column(name = "EndDateTime")
    private LocalDateTime endDateTime;

    @Column(name = "Status")
    @Enumerated(EnumType.STRING)
    private SchedulerStatus status;

    @Version
    @Column(name = "Version", nullable = false)
    private Long version;
}

