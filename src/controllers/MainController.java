/*
* File: MainController.java
* Author: Sangare Fantha Felisha
* Copyright: 2022, Sangare Fantha Felisha
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/
package controllers;

import models.MainModel;
import views.MainFrame;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
        this.mainModel.beosztasList.forEach(beosztas ->{
            this.mainFrame.groupModel.addElement(beosztas.name);            
        });
    }
}
