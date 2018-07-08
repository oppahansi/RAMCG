package com.oppahansi.models;

import com.oppahansi.service.ConfigDefinitions;

import java.util.HashSet;

public class Rule {

    private ConfigDefinitions.SubmissionType submissionType;

    private HashSet<SearchCheck> searchCheckList;
    private HashSet<NonSearchCheck> nonSearchCheckList;

    private ConfigDefinitions.ActionType actionType;

    private String comment;
    private String message;
    private String messageSubject;
    private String modMail;
    private String modmailSubject;

}
