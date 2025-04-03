package com.fragmadata.mtm.entity.EmailNotification;

import com.fragmadata.mtm.enums.scheduler.EmailStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailNotification {
    private String scheduler;
    private String component;
    private String status; // Mostly Failure
    private String reason;

    public EmailNotification(String scheduler, String component, String status, String reason) {
        this.scheduler = scheduler;
        this.component = component;
        this.status = status;
        this.reason = reason;
    }

}
