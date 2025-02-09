package com.fragmadata.mtm.enums;

public enum ImportStatus {
    FAILED("failed"),
    QUEUED("queued"),
    PARTIALLY_PROCESSED("partially processed"),
    PROCESSED("processed");

    private final String status;

    ImportStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static String getErrorStatuses() {
        return String.format("'%s','%s','%s'", FAILED.getStatus(), QUEUED.getStatus(), PARTIALLY_PROCESSED.getStatus());
    }

    public static String getSuccessStatuses() {
        return String.format("'%s'", PROCESSED.getStatus());
    }
}