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
    NO_ATTACHMENTS_FOUND_TO_PROCESS,
    PARSING_IN_PROGRESS,
    PARTIALLY_PROCESSED,
    FAILED;

    EmailStatus() {}


    private static List<String> successStatusList = new ArrayList<>();
    private static List<String> errorStatusList = new ArrayList<>();
    private static List<String> errorStatusListForEmailInstance = new ArrayList<>();
    private static List<String> errorStatusListForEmailAttachmentInstance = new ArrayList<>();
    private static List<String> errorStatusListForFileAttachmentSheetInstance = new ArrayList<>();
    private static List<String> inProgressStatusListForAll = new ArrayList<>();

    static {
        successStatusList.add(SUCCESS.name());
        successStatusList.add(PROCESSED.name());
        successStatusList.add(PARTIALLY_PROCESSED.name());
        errorStatusList.add(FAILED.name());
        errorStatusList.add(FAILURE.name());
        errorStatusList.add(CONFIG_NOT_MATCHED.name());
        errorStatusList.add(EMAIL_CONFIG_NOT_MATCHED.name());
        errorStatusList.add(SHEET_CONFIG_MISMATCHED.name());
        errorStatusList.add(PARSING_FAILED.name());
        successStatusList.add(READ_COMPLETE.name());
        errorStatusListForEmailInstance.add(FAILED.name());
        errorStatusListForEmailInstance.add(NO_ATTACHMENTS_FOUND_TO_PROCESS.name());
        errorStatusListForEmailAttachmentInstance.add(PARSING_FAILED.name());
        errorStatusListForEmailAttachmentInstance.add(CONFIG_NOT_MATCHED.name());
        errorStatusListForFileAttachmentSheetInstance.add(FAILED.name());
        errorStatusListForFileAttachmentSheetInstance.add(SHEET_CONFIG_MISMATCHED.name());
        inProgressStatusListForAll.add(PARSING_IN_PROGRESS.name());
    }


    public static List<String> getSuccessStatusList() {
        return successStatusList;
    }

    public static List<String> getErrorStatusList() {
        return errorStatusList;
    }

	public static List<String> getErrorStatusListForEmailInstance() {
		return errorStatusListForEmailInstance;
	}

	public static List<String> getErrorStatusListForEmailAttachmentInstance() {
		return errorStatusListForEmailAttachmentInstance;
	}

	public static List<String> getErrorStatusListForFileAttachmentSheetInstance() {
		return errorStatusListForFileAttachmentSheetInstance;
	}

    public static List<String> getInProgressStatusListForAll() {
        return inProgressStatusListForAll;
    }
  
}
