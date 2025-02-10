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
@Table(name = "PollingUidTracker")
public class PollingUidTracker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "LastPolledUID", nullable = false)
    private Long lastPolledUID;

    @Version
    @Column(name = "Version")
    private Long version;
}
