package com.oppahansi.controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXToggleButton;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.*;

public class RamcgController {

    @FXML
    private JFXToggleButton submissionTypeAny;

    @FXML
    private ToggleGroup submissionType;

    @FXML
    private JFXToggleButton submissionTypeMedia;

    @FXML
    private JFXToggleButton submissionTypeComment;

    @FXML
    private JFXToggleButton submissionTypeTextPost;

    @FXML
    private JFXToggleButton submissionTypeLink;

    @FXML
    private JFXToggleButton submissionTypeCrosspost;

    @FXML
    private JFXCheckBox checkId;

    @FXML
    private JFXCheckBox checkTitle;

    @FXML
    private JFXCheckBox checkDomain;

    @FXML
    private JFXCheckBox checkUrl;

    @FXML
    private JFXCheckBox checkBody;

    @FXML
    private JFXCheckBox checkFlair;

    @FXML
    private JFXCheckBox checkFlairCssClass;

    @FXML
    private JFXCheckBox checkCrosspostId;

    @FXML
    private JFXCheckBox checkCrosspostTitle;

    @FXML
    private JFXCheckBox checkMediaAuthor;

    @FXML
    private JFXCheckBox checkMediaAuthorUrl;

    @FXML
    private JFXCheckBox checkMediaTitle;

    @FXML
    private JFXCheckBox checkMediaDescription;

    @FXML
    private HBox checksBox;

    @FXML
    private VBox topLevelChecksContainer;

    private Map<HBox, List<VBox>> topLevelCheckRow = new HashMap<>();

    public void initialize() {
        submissionTypeTextPost.selectedProperty().addListener((observable, oldValue, newValue) -> checkUrl.setDisable(newValue));
        submissionTypeLink.selectedProperty().addListener((observable, oldValue, newValue) -> checkBody.setDisable(newValue));
        submissionTypeMedia.selectedProperty().addListener((observable, oldValue, newValue) -> updateMediaCheckBoxes(newValue));
        submissionTypeCrosspost.selectedProperty().addListener((observable, oldValue, newValue) -> updateCrosspostCheckBoxes(newValue));
    }

    private void updateMediaCheckBoxes(boolean disabled) {
        checkMediaAuthor.setDisable(!disabled);
        checkMediaAuthorUrl.setDisable(!disabled);
        checkMediaTitle.setDisable(!disabled);
        checkMediaDescription.setDisable(!disabled);
    }

    private void updateCrosspostCheckBoxes(boolean disabled) {
        checkCrosspostId.setDisable(!disabled);
        checkCrosspostTitle.setDisable(!disabled);
    }

    @FXML
    void onAnySubmission(ActionEvent event) {

    }

    @FXML
    void onCommentSubmission(ActionEvent event) {

    }

    @FXML
    void onCrosspostSubmission(ActionEvent event) {

    }

    @FXML
    void onLinkSubmission(ActionEvent event) {

    }

    @FXML
    void onTextSubmission(ActionEvent event) {

    }

    @FXML
    void onCheckSelected(ActionEvent event) {
        if (((JFXCheckBox)event.getSource()).isSelected())
            addCheck((JFXCheckBox) event.getSource());
        else
            removeCheck((JFXCheckBox) event.getSource());
    }

    private void addCheck(JFXCheckBox checkBox) {
        VBox newCheck = createCheck(checkBox);

        if (newCheck == null)
            return;

        HBox newChecksRow = null;

        for (HBox row : topLevelCheckRow.keySet()) {
            if (topLevelCheckRow.get(row).size() < 3)
                newChecksRow = row;
        }

        if (newChecksRow == null) {
            newChecksRow = createNewRow(newCheck);
            topLevelChecksContainer.getChildren().add(newChecksRow);
        } else {
            topLevelCheckRow.get(newChecksRow).add(newCheck);
        }

        newChecksRow.getChildren().add(newCheck);
    }

    private VBox createCheck(JFXCheckBox checkBox) {
        VBox newCheck = null;

        try {
            newCheck = FXMLLoader.load(getClass().getResource("../fxml/Check.fxml"));

            for (Node child : newCheck.getChildren()) {
                if (child instanceof Text) {
                    ((Text) child).setText(checkBox.getText());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return newCheck;
    }

    private HBox createNewRow(VBox newCheck) {
        HBox newChecksRow = new HBox();

        newChecksRow.setPrefWidth(Region.USE_COMPUTED_SIZE);
        newChecksRow.setPrefHeight(Region.USE_COMPUTED_SIZE);
        newChecksRow.setAlignment(Pos.TOP_CENTER);

        topLevelCheckRow.put(newChecksRow, new ArrayList<>(Arrays.asList(newCheck)));

        return newChecksRow;
    }

    private void removeCheck(JFXCheckBox checkBox) {

        HBox containingRow = null;
        VBox checkToRemove = null;

        for (HBox row : topLevelCheckRow.keySet()) {
            for (VBox check : topLevelCheckRow.get(row)) {
                for (Node child : check.getChildren()) {
                    if (child instanceof Text) {
                        if (((Text) child).getText().compareTo(checkBox.getText()) == 0) {
                            containingRow = row;
                            checkToRemove = check;
                            break;
                        }
                    }
                }
                if (containingRow != null) break;
            }
            if (containingRow!= null) break;
        }

        topLevelCheckRow.get(containingRow).remove(checkToRemove);

        for (Node row : topLevelChecksContainer.getChildren()) {
            if (row.equals(containingRow)) {
                for (Node check : ((HBox) row).getChildren()) {
                    if (check.equals(checkToRemove)) {
                        ((HBox) row).getChildren().remove(checkToRemove);
                        return;
                    }
                }
            }
        }
    }

}

