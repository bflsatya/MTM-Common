package com.fragmadata.mtm.enums.scheduler;

import java.util.ArrayList;
import java.util.List;

public enum EmailStatus {

    SUCCESS,
    FAILURE,
    SYSTEM_ERROR,
    VALIDATION,
    INFORMATION,
    READ_START,
    PENDING,
    READ_COMPLETE,
    QUEUED_FOR_SHEET_IDENTIFICATION,
    CONFIG_NOT_MATCHED,
    CONFIG_MATCHED_AND_STAGED_FOR_QUEUING,
    QUEUED_FOR_SHEET_PROCESSING,
    QUEUED_FOR_PROCESSING,
    SHEET_CONFIG_MISMATCHED,
    PARSING_FAILED,
    EMAIL_CONFIG_NOT_MATCHED,
    QUEUED_FOR_ATTACHMENT_IDENTIFICATION,
    PROCESSED,
    FAILED;

    EmailStatus() {}


    private static List<String> successStatusList = new ArrayList<>();
    private static List<String> errorStatusList = new ArrayList<>();

    static {
        successStatusList.add(SUCCESS.name());
        successStatusList.add(PROCESSED.name());
        errorStatusList.add(FAILED.name());
        errorStatusList.add(FAILURE.name());
        errorStatusList.add(CONFIG_NOT_MATCHED.name());
        errorStatusList.add(EMAIL_CONFIG_NOT_MATCHED.name());
        errorStatusList.add(SHEET_CONFIG_MISMATCHED.name());
        errorStatusList.add(PARSING_FAILED.name());
        successStatusList.add(READ_COMPLETE.name());
    }


    public static List<String> getSuccessStatusList() {
        return successStatusList;
    }

    public static List<String> getErrorStatusList() {
        return errorStatusList;
    }
}
