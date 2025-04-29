package com.fragmadata.mtm.entity.scheduler;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "SchedulerControl")
public class SchedulerControl {

    @Id
    @Column(name = "scheduler_name", nullable = false, unique = true)
    private String schedulerName;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Version
    @Column(name = "version")
    private Long version;
}
