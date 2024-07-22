package com.example.listviewdemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

import java.io.IOException;

public class ProfileCell extends ListCell<ProfileModel> {


    private final HBox cell;
    private final Label nameLabel;

    private ImageView imageView;

    public ProfileCell(){
        cell = new HBox();
        nameLabel = new Label();
        Image picture = new Image("file:src/main/resources/unknown.jpg");
        imageView = new ImageView(picture);
        imageView.setFitHeight(40);
        imageView.setFitWidth(40);
        cell.getChildren().add(imageView);
        final double MAX_FONT_SIZE = 24.0;
        nameLabel.setFont(new Font(MAX_FONT_SIZE));
        cell.getChildren().add(nameLabel);
    }
    @Override
    protected void updateItem(ProfileModel profile, boolean empty) {
        super.updateItem(profile, empty);
        if (empty || profile == null) {
            setText(null);
            setGraphic(null);
        } else {
            setGraphic(cell);
            nameLabel.setText(profile.getName());
        }
    }
}
