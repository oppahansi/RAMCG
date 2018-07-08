package com.oppahansi.controller;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXToggleButton;

import java.io.IOException;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class RamcgController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // fx:id="subTypeContainer"
    private HBox subTypeContainer; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeAny"
    private JFXToggleButton submissionTypeAny; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeMedia"
    private JFXToggleButton submissionTypeMedia; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeComment"
    private JFXToggleButton submissionTypeComment; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeTextPost"
    private JFXToggleButton submissionTypeTextPost; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeLink"
    private JFXToggleButton submissionTypeLink; // Value injected by FXMLLoader

    @FXML // fx:id="submissionTypeCrosspost"
    private JFXToggleButton submissionTypeCrosspost; // Value injected by FXMLLoader

    @FXML // fx:id="topLevelChecksContainer"
    private VBox topLevelChecksContainer; // Value injected by FXMLLoader

    @FXML // fx:id="checkId"
    private JFXCheckBox checkId; // Value injected by FXMLLoader

    @FXML // fx:id="checkTitle"
    private JFXCheckBox checkTitle; // Value injected by FXMLLoader

    @FXML // fx:id="checkDomain"
    private JFXCheckBox checkDomain; // Value injected by FXMLLoader

    @FXML // fx:id="checkUrl"
    private JFXCheckBox checkUrl; // Value injected by FXMLLoader

    @FXML // fx:id="checkBody"
    private JFXCheckBox checkBody; // Value injected by FXMLLoader

    @FXML // fx:id="checkFlair"
    private JFXCheckBox checkFlair; // Value injected by FXMLLoader

    @FXML // fx:id="checkFlairCssClass"
    private JFXCheckBox checkFlairCssClass; // Value injected by FXMLLoader

    @FXML // fx:id="checkMediaAuthor"
    private JFXCheckBox checkMediaAuthor; // Value injected by FXMLLoader

    @FXML // fx:id="checkMediaAuthorUrl"
    private JFXCheckBox checkMediaAuthorUrl; // Value injected by FXMLLoader

    @FXML // fx:id="checkMediaTitle"
    private JFXCheckBox checkMediaTitle; // Value injected by FXMLLoader

    @FXML // fx:id="checkMediaDescription"
    private JFXCheckBox checkMediaDescription; // Value injected by FXMLLoader

    @FXML // fx:id="checkCrosspostId"
    private JFXCheckBox checkCrosspostId; // Value injected by FXMLLoader

    @FXML // fx:id="checkCrosspostTitle"
    private JFXCheckBox checkCrosspostTitle; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpParentSub"
    private JFXCheckBox subGrpParentSub; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpAuthor"
    private JFXCheckBox subGrpAuthor; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCrosspostAuthor"
    private JFXCheckBox subGrpCrosspostAuthor; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCrosspostSubreddit"
    private JFXCheckBox subGrpCrosspostSubreddit; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckId"
    private JFXCheckBox subGrpCheckId; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckTitle"
    private JFXCheckBox subGrpCheckTitle; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckDomain"
    private JFXCheckBox subGrpCheckDomain; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckUrl"
    private JFXCheckBox subGrpCheckUrl; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckBody"
    private JFXCheckBox subGrpCheckBody; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckFlairText"
    private JFXCheckBox subGrpCheckFlairText; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckFlairCssClass"
    private JFXCheckBox subGrpCheckFlairCssClass; // Value injected by FXMLLoader

    @FXML // fx:id="subGrpCheckName"
    private JFXCheckBox subGrpCheckName; // Value injected by FXMLLoader

    @FXML // fx:id="subGroupChecksContainer"
    private VBox subGroupChecksContainer; // Value injected by FXMLLoader

    private Map<HBox, List<VBox>> topLevelChecksMap = new HashMap<>();
    private Map<HBox, List<VBox>> subGrpChecksMap = new HashMap<>();

    @FXML
    void onCheckSelected(ActionEvent event) {
        if (((JFXCheckBox)event.getSource()).isSelected()) {
            addCheck((JFXCheckBox) event.getSource(), true);
        } else {
            removeCheck((JFXCheckBox) event.getSource(), true);
        }
    }

    @FXML
    void onSubGrpCheckSelected(ActionEvent event) {
        if (((JFXCheckBox)event.getSource()).isSelected()) {
            addCheck((JFXCheckBox) event.getSource(), false);
        } else {
            removeCheck((JFXCheckBox) event.getSource(), false);
        }
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert subTypeContainer != null : "fx:id=\"subTypeContainer\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeAny != null : "fx:id=\"submissionTypeAny\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeMedia != null : "fx:id=\"submissionTypeMedia\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeComment != null : "fx:id=\"submissionTypeComment\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeTextPost != null : "fx:id=\"submissionTypeTextPost\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeLink != null : "fx:id=\"submissionTypeLink\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert submissionTypeCrosspost != null : "fx:id=\"submissionTypeCrosspost\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert topLevelChecksContainer != null : "fx:id=\"topLevelChecksContainer\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkId != null : "fx:id=\"checkId\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkTitle != null : "fx:id=\"checkTitle\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkDomain != null : "fx:id=\"checkDomain\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkUrl != null : "fx:id=\"checkUrl\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkBody != null : "fx:id=\"checkBody\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkFlair != null : "fx:id=\"checkFlair\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkFlairCssClass != null : "fx:id=\"checkFlairCssClass\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkMediaAuthor != null : "fx:id=\"checkMediaAuthor\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkMediaAuthorUrl != null : "fx:id=\"checkMediaAuthorUrl\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkMediaTitle != null : "fx:id=\"checkMediaTitle\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkMediaDescription != null : "fx:id=\"checkMediaDescription\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkCrosspostId != null : "fx:id=\"checkCrosspostId\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert checkCrosspostTitle != null : "fx:id=\"checkCrosspostTitle\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpParentSub != null : "fx:id=\"subGrpParentSub\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpAuthor != null : "fx:id=\"subGrpAuthor\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCrosspostAuthor != null : "fx:id=\"subGrpCrosspostAuthor\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCrosspostSubreddit != null : "fx:id=\"subGrpCrosspostSubreddit\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckId != null : "fx:id=\"subGrpCheckId\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckTitle != null : "fx:id=\"subGrpCheckTitle\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckDomain != null : "fx:id=\"subGrpCheckDomain\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckUrl != null : "fx:id=\"subGrpCheckUrl\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckBody != null : "fx:id=\"subGrpCheckBody\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckFlairText != null : "fx:id=\"subGrpCheckFlairText\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckFlairCssClass != null : "fx:id=\"subGrpCheckFlairCssClass\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGrpCheckName != null : "fx:id=\"subGrpCheckName\" was not injected: check your FXML file 'Ramcg.fxml'.";
        assert subGroupChecksContainer != null : "fx:id=\"subGroupChecksContainer\" was not injected: check your FXML file 'Ramcg.fxml'.";

        submissionTypeTextPost.selectedProperty().addListener((observable, oldValue, newValue) -> checkUrl.setDisable(newValue));
        submissionTypeLink.selectedProperty().addListener((observable, oldValue, newValue) -> checkBody.setDisable(newValue));
        submissionTypeMedia.selectedProperty().addListener((observable, oldValue, newValue) -> updateMediaCheckBoxes(newValue));
        submissionTypeCrosspost.selectedProperty().addListener((observable, oldValue, newValue) -> updateCrosspostCheckBoxes(newValue));
        subGrpParentSub.selectedProperty().addListener((observable, oldValue, newValue) -> updateParentSubCheckBoxes(newValue));
        subGrpAuthor.selectedProperty().addListener((observable, oldValue, newValue) -> updateAuthorSubCheckBoxes(newValue));
        subGrpCrosspostAuthor.selectedProperty().addListener((observable, oldValue, newValue) -> updateCrosspostAuthorSubCheckBoxes(newValue));
        subGrpCrosspostSubreddit.selectedProperty().addListener((observable, oldValue, newValue) -> subGrpCheckName.setDisable(!newValue && !subGrpAuthor.isSelected() && !subGrpCrosspostAuthor.isSelected()));
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

    private void updateParentSubCheckBoxes(boolean disabled) {
        subGrpCheckTitle.setDisable(!disabled);
        subGrpCheckDomain.setDisable(!disabled);
        subGrpCheckUrl.setDisable(!disabled);
        subGrpCheckBody.setDisable(!disabled);

        if (disabled) {
            subGrpCheckId.setDisable(false);
            subGrpCheckFlairText.setDisable(false);
            subGrpCheckFlairCssClass.setDisable(false);
        } else {
            subGrpCheckId.setDisable(!subGrpAuthor.isSelected() && !subGrpCrosspostAuthor.isSelected());
            subGrpCheckFlairText.setDisable(!subGrpAuthor.isSelected() && !subGrpCrosspostAuthor.isSelected());
            subGrpCheckFlairCssClass.setDisable(!subGrpAuthor.isSelected() && !subGrpCrosspostAuthor.isSelected());
        }
    }

    private void updateAuthorSubCheckBoxes(boolean disabled) {
        if (!subGrpCrosspostAuthor.isSelected()) {
            if (disabled) {
                subGrpCheckId.setDisable(false);
                subGrpCheckFlairText.setDisable(false);
                subGrpCheckFlairCssClass.setDisable(false);
                subGrpCheckName.setDisable(false);
            } else {
                subGrpCheckId.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckFlairText.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckFlairCssClass.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckName.setDisable(!subGrpCrosspostSubreddit.isSelected());
            }
        }
    }

    private void updateCrosspostAuthorSubCheckBoxes(boolean disabled) {
        if (!subGrpAuthor.isSelected()) {
            if (disabled) {
                subGrpCheckId.setDisable(false);
                subGrpCheckFlairText.setDisable(false);
                subGrpCheckFlairCssClass.setDisable(false);
                subGrpCheckName.setDisable(false);
            } else {
                subGrpCheckId.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckFlairText.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckFlairCssClass.setDisable(!subGrpParentSub.isSelected());
                subGrpCheckName.setDisable(!subGrpCrosspostSubreddit.isSelected());
            }
        }
    }

    private void addCheck(JFXCheckBox checkBox, boolean topLevel) {
        Map<HBox, List<VBox>> checksMap = topLevel ? topLevelChecksMap : subGrpChecksMap;
        VBox checksContainer = topLevel ? topLevelChecksContainer : subGroupChecksContainer;

        VBox newCheck = createCheck(checkBox);

        if (newCheck == null)
            return;

        HBox newChecksRow = null;

        for (HBox row : checksMap.keySet()) {
            if (checksMap.get(row).size() < 3)
                newChecksRow = row;
        }

        if (newChecksRow == null) {
            newChecksRow = createNewRow(newCheck, checksMap);
            checksContainer.getChildren().add(newChecksRow);
        } else
            checksMap.get(newChecksRow).add(newCheck);

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

    private HBox createNewRow(VBox newCheck, Map<HBox, List<VBox>> checksMap) {
        HBox newChecksRow = new HBox();

        newChecksRow.setPrefWidth(Region.USE_COMPUTED_SIZE);
        newChecksRow.setPrefHeight(Region.USE_COMPUTED_SIZE);
        newChecksRow.setAlignment(Pos.TOP_CENTER);

        checksMap.put(newChecksRow, new ArrayList<>(Arrays.asList(newCheck)));

        return newChecksRow;
    }

    private void removeCheck(JFXCheckBox checkBox, boolean topLevel) {
        Map<HBox, List<VBox>> checksMap = topLevel ? topLevelChecksMap : subGrpChecksMap;
        VBox checksContainer = topLevel ? topLevelChecksContainer : subGroupChecksContainer;
        HBox containingRow = null;
        VBox checkToRemove = null;

        for (HBox row : checksMap.keySet()) {
            for (VBox check : checksMap.get(row)) {
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

        checksMap.get(containingRow).remove(checkToRemove);

        if (checksMap.get(containingRow).size() == 0)
            checksMap.remove(containingRow);

        for (Node row : checksContainer.getChildren()) {
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

