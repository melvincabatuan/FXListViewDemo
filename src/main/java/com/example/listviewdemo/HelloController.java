package com.example.listviewdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ObservableList<ProfileModel> friendList;

    @FXML
    private ListView<ProfileModel> listView;

    public HelloController(){
        this.friendList = FXCollections.observableArrayList();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.friendList.add(new ProfileModel("Jose Rizal"));
        this.friendList.add(new ProfileModel("Bill Gates"));
        listView.setItems(this.friendList);
        listView.setCellFactory(categoryList -> new ProfileCell());
    }
}