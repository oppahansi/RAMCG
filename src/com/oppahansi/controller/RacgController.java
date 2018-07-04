package com.oppahansi.controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class RacgController {

    @FXML
    private Group submissionTypeGroup;

    @FXML
    private RadioButton submissionTypeAny;

    @FXML
    private ToggleGroup submissionType;

    @FXML
    private RadioButton submissionTypeSubmission;

    @FXML
    private RadioButton submissionTypeComment;

    @FXML
    private RadioButton submissionTypeText;

    @FXML
    private RadioButton submissionTypeLink;

    @FXML
    private RadioButton submissionTypeCrosspost;

    @FXML
    private Pane subTitle;

    @FXML
    private CheckBox checkFieldTitle;

    @FXML
    private TextArea titleTextArea;

    @FXML
    private CheckBox checkTitleRegex;

    @FXML
    private CheckBox checkTitleInverse;

    @FXML
    private CheckBox checkTitleCaseSensitive;

    @FXML
    private Group titleCheckGroup;

    @FXML
    private RadioButton titleCheckIncludesWord;

    @FXML
    private ToggleGroup titleCheck;

    @FXML
    private RadioButton titleCheckIncludes;

    @FXML
    private RadioButton titleCheckStartsWith;

    @FXML
    private RadioButton titleCheckEndsWith;

    @FXML
    private RadioButton titleCheckFullExact;

    @FXML
    private RadioButton titleCheckFullText;

    @FXML
    private Pane subDomain;

    @FXML
    private CheckBox checkFieldDomain;

    @FXML
    private TextArea domainTextArea;

    @FXML
    private CheckBox checkDomainRegex;

    @FXML
    private CheckBox checkDomainInverse;

    @FXML
    private CheckBox checkDomainCaseSensitive;

    @FXML
    private Group domainCheckGroup;

    @FXML
    private RadioButton domainCheckIncludesWord;

    @FXML
    private ToggleGroup domainCheck;

    @FXML
    private RadioButton domainCheckIncludes;

    @FXML
    private RadioButton domainCheckStartsWith;

    @FXML
    private RadioButton domainCheckEndsWith;

    @FXML
    private RadioButton domainCheckFullExact;

    @FXML
    private RadioButton domainCheckFullText;

    @FXML
    private Pane subUrl;

    @FXML
    private CheckBox checkFieldUrl;

    @FXML
    private TextArea urlTextArea;

    @FXML
    private CheckBox checkUrlRegex;

    @FXML
    private CheckBox checkUrlInverse;

    @FXML
    private CheckBox checkUrlCaseSensitive;

    @FXML
    private Group urlCheckGroup;

    @FXML
    private RadioButton urlCheckIncludesWord;

    @FXML
    private ToggleGroup urlCheck;

    @FXML
    private RadioButton urlCheckIncludes;

    @FXML
    private RadioButton urlCheckStartsWith;

    @FXML
    private RadioButton urlCheckEndsWith;

    @FXML
    private RadioButton urlCheckFullExact;

    @FXML
    private RadioButton urlCheckFullText;

    @FXML
    private Pane subBody;

    @FXML
    private CheckBox checkFieldBody;

    @FXML
    private TextArea bodyTextArea;

    @FXML
    private CheckBox checkBodyRegex;

    @FXML
    private CheckBox checkBodyInverse;

    @FXML
    private CheckBox checkBodyCaseSensitive;

    @FXML
    private Group bodyCheckGroup;

    @FXML
    private RadioButton bodyCheckIncludesWord;

    @FXML
    private ToggleGroup bodyCheck;

    @FXML
    private RadioButton bodyCheckIncludes;

    @FXML
    private RadioButton bodyCheckStartsWith;

    @FXML
    private RadioButton bodyCheckEndsWith;

    @FXML
    private RadioButton bodyCheckFullExact;

    @FXML
    private RadioButton bodyCheckFullText;

    @FXML
    private Pane subFlairText;

    @FXML
    private CheckBox checkFieldFlairText;

    @FXML
    private TextArea flairTextTextArea;

    @FXML
    private CheckBox checkFlairTextRegex;

    @FXML
    private CheckBox checkFlairTextInverse;

    @FXML
    private CheckBox checkFlairTextCaseSensitive;

    @FXML
    private Group flairCheckGroup;

    @FXML
    private RadioButton flairCheckIncludesWord;

    @FXML
    private ToggleGroup flairCheck;

    @FXML
    private RadioButton flairCheckIncludes;

    @FXML
    private RadioButton flairCheckStartsWith;

    @FXML
    private RadioButton flairCheckEndsWith;

    @FXML
    private RadioButton flairCheckFullExact;

    @FXML
    private RadioButton flairCheckFullText;

    @FXML
    private Pane subFlairCss;

    @FXML
    private CheckBox checkFieldFlairCss;

    @FXML
    private TextArea flairCssTextArea;

    @FXML
    private CheckBox checkFlairCssRegex;

    @FXML
    private CheckBox checkFlairCssInverse;

    @FXML
    private CheckBox checkFlairCssCaseSensitive;

    @FXML
    private Group flairCssCheckGroup;

    @FXML
    private RadioButton flairCssCheckIncludesWord;

    @FXML
    private ToggleGroup flairCssCheck;

    @FXML
    private RadioButton flairCssCheckIncludes;

    @FXML
    private RadioButton flairCssCheckStartsWith;

    @FXML
    private RadioButton flairCssCheckEndsWith;

    @FXML
    private RadioButton flairCssCheckFullExact;

    @FXML
    private RadioButton flairCssCheckFullText;

    @FXML
    private Pane userName;

    @FXML
    private CheckBox checkUserName;

    @FXML
    private TextArea userNameTextArea;

    @FXML
    private CheckBox checkUserNameRegex;

    @FXML
    private CheckBox checkUserNameInverse;

    @FXML
    private Group userNameCheckGroup;

    @FXML
    private RadioButton userNameCheckIncludesWord;

    @FXML
    private ToggleGroup userNameCheck;

    @FXML
    private RadioButton userNameCheckIncludes;

    @FXML
    private RadioButton userNameCheckStartsWith;

    @FXML
    private RadioButton userNameCheckEndsWith;

    @FXML
    private RadioButton userNameCheckFullExact;

    @FXML
    private RadioButton userNameCheckFullText;

    @FXML
    private Pane commentKarma;

    @FXML
    private CheckBox checkUserCommentKarma;

    @FXML
    private Group typeGroup12111;

    @FXML
    private RadioButton commentKarmaCheckGreater;

    @FXML
    private ToggleGroup commentKarmaCheck;

    @FXML
    private Spinner<Integer> commentKarmaValue;

    @FXML
    private RadioButton commentKarmaCheckGreaterEquals;

    @FXML
    private RadioButton commentKarmaCheckSmaller;

    @FXML
    private RadioButton commentKarmaCheckSmallerEquals;

    @FXML
    private Pane linkKarma;

    @FXML
    private CheckBox checkUserLinkKarma;

    @FXML
    private Group linkKarmaCheckGroup;

    @FXML
    private RadioButton linkKarmaCheckGreater;

    @FXML
    private ToggleGroup linkKarmaCheck;

    @FXML
    private Spinner<Integer> linkKarmaValue;

    @FXML
    private RadioButton linkKarmaCheckGreaterEquals;

    @FXML
    private RadioButton linkKarmaCheckSmaller;

    @FXML
    private RadioButton linkKarmaCheckSmallerEquals;

    @FXML
    private Pane totalKarma;

    @FXML
    private CheckBox checkUserTotalKarma;

    @FXML
    private Group totalKarmaCheckGroup;

    @FXML
    private RadioButton totalKarmaCheckGreater;

    @FXML
    private ToggleGroup totalKarmaCheck;

    @FXML
    private Spinner<Integer> totalKarmaValue;

    @FXML
    private RadioButton totalKarmaCheckGreaterEquals;

    @FXML
    private RadioButton totalKarmaCheckSmaller;

    @FXML
    private RadioButton totalKarmaCheckSmallerEquals;

    @FXML
    private Pane accAge;

    @FXML
    private CheckBox checkUserAccountAge;

    @FXML
    private Group accAgeCheckGroup;

    @FXML
    private RadioButton accAgeCheckGreater;

    @FXML
    private ToggleGroup accAgeCheck;

    @FXML
    private Spinner<Integer> accAgeValue;

    @FXML
    private RadioButton accAgeCheckGreaterEquals;

    @FXML
    private RadioButton accAgeCheckSmaller;

    @FXML
    private RadioButton accAgeCheckSmallerEquals;

    @FXML
    private CheckBox checkUserSatisfyAny;

    @FXML
    private CheckBox checkModerate;

    @FXML
    private Group actionTypeGroup;

    @FXML
    private RadioButton actionTypeApprove;

    @FXML
    private ToggleGroup actionType;

    @FXML
    private RadioButton actionTypeRemove;

    @FXML
    private RadioButton actionTypeSpam;

    @FXML
    private RadioButton actionTypeFilter;

    @FXML
    private RadioButton actionTypeReport;

    @FXML
    private TextField actionReason;

    @FXML
    private Pane userName2;

    @FXML
    private CheckBox checkLeaveComment;

    @FXML
    private TextArea leaveCommentTextArea;

    @FXML
    private CheckBox checkStickyComment;

    @FXML
    private Pane userName21;

    @FXML
    private CheckBox checkSendModmail;

    @FXML
    private TextArea sendModmailTextArea;

    @FXML
    private TextField modmailSubject;

    @FXML
    private Pane userName211;

    @FXML
    private CheckBox checkSendMessage;

    @FXML
    private TextArea sendMessageTextArea;

    @FXML
    private TextField messageSubject;

    @FXML
    private Button createRuleBtn;

    @FXML
    private Button resetBtn;

    @FXML
    private Button saveToFileBtn;

    @FXML
    private TextArea ruleResultTextArea;

    @FXML
    private Button copyClipboardBtn;

    public void initialize() {
        /* Initialize Spinners with proper values and formatter */
        SpinnerValueFactory<Integer> commentKarmaSpinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, Integer.MAX_VALUE, -100);
        commentKarmaValue.setValueFactory(commentKarmaSpinnerValueFactory);
        TextFormatter<Integer> commentKarmaFormatter = new TextFormatter<>(commentKarmaSpinnerValueFactory.getConverter(), commentKarmaSpinnerValueFactory.getValue());
        commentKarmaValue.getEditor().setTextFormatter(commentKarmaFormatter);
        commentKarmaSpinnerValueFactory.valueProperty().bindBidirectional(commentKarmaFormatter.valueProperty());

        SpinnerValueFactory<Integer> linkKarmaSpinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, Integer.MAX_VALUE, -100);
        linkKarmaValue.setValueFactory(linkKarmaSpinnerValueFactory);
        TextFormatter<Integer> linkKarmaFormatter = new TextFormatter<>(linkKarmaSpinnerValueFactory.getConverter(), linkKarmaSpinnerValueFactory.getValue());
        linkKarmaValue.getEditor().setTextFormatter(linkKarmaFormatter);
        linkKarmaSpinnerValueFactory.valueProperty().bindBidirectional(linkKarmaFormatter.valueProperty());

        SpinnerValueFactory<Integer> totalKarmaSpinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(-100, Integer.MAX_VALUE, -100);
        totalKarmaValue.setValueFactory(totalKarmaSpinnerValueFactory);
        TextFormatter<Integer> totalKarmaFormatter = new TextFormatter<>(totalKarmaSpinnerValueFactory.getConverter(), totalKarmaSpinnerValueFactory.getValue());
        totalKarmaValue.getEditor().setTextFormatter(totalKarmaFormatter);
        totalKarmaSpinnerValueFactory.valueProperty().bindBidirectional(totalKarmaFormatter.valueProperty());

        SpinnerValueFactory<Integer> accAgeSpinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, Integer.MAX_VALUE, 1);
        accAgeValue.setValueFactory(accAgeSpinnerValueFactory);
        TextFormatter<Integer> accAgeFormatter = new TextFormatter<>(accAgeSpinnerValueFactory.getConverter(), accAgeSpinnerValueFactory.getValue());
        accAgeValue.getEditor().setTextFormatter(accAgeFormatter);
        accAgeSpinnerValueFactory.valueProperty().bindBidirectional(accAgeFormatter.valueProperty());
    }
}
