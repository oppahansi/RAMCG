package com.oppahansi.controller;

import com.jfoenix.controls.JFXButton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class CheckController {
    @FXML
    private GridPane checkItemsGrid;

    @FXML
    private JFXTextField inputField;

    @FXML
    private JFXButton addButton;

    @FXML
    private ToggleGroup checkModifier;

    @FXML
    void onAddButtonClicked(ActionEvent event) {
        int result = checkItemsGrid.getRowCount();

        if (result >= 0) {
            JFXTextField newInputField = new JFXTextField();
            newInputField.setFocusColor(inputField.getFocusColor());
            newInputField.setUnFocusColor(inputField.getUnFocusColor());

            checkItemsGrid.getChildren().remove(addButton);
            checkItemsGrid.add(newInputField, 1, result-1);
            checkItemsGrid.add(addButton, 1, result);
        }
    }

    @FXML
    void initialize() {
        assert checkItemsGrid != null : "fx:id=\"checkItemsGrid\" was not injected: check your FXML file 'Check.fxml'.";
        assert addButton != null : "fx:id=\"addButton\" was not injected: check your FXML file 'Check.fxml'.";
        assert checkModifier != null : "fx:id=\"checkModifier\" was not injected: check your FXML file 'Check.fxml'.";
    }
}
