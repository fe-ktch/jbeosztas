/*
* File: MainModel.java
* Author: Sangare Fantha Felisha
* Copyright: 2022, Sangare Fantha Felisha
* Group: Szoft I N
* Date: 2022-05-31
* Github: https://github.com/fe-ktch/
* Licenc: GNU GPL
*/
package models;

import java.util.Arrays;
import java.util.Vector;

public class MainModel {
    Beosztas[] BeosztasArray = {
        new Beosztas(1, "beosztas1"),
        new Beosztas(2, "beosztas2"),
        new Beosztas(3, "beosztas3"),
        new Beosztas(4, "beosztas4"),
        new Beosztas(5, "beosztas5"),
        new Beosztas(1, "beosztas6"),
        new Beosztas(2, "beosztas7"),
        new Beosztas(3, "beosztas8"),
        new Beosztas(4, "beosztas9"),
        new Beosztas(5, "beosztas10")
    };
    
    public Vector<Beosztas> beosztasList = 
        new Vector<>(Arrays.asList(BeosztasArray)); 
}    



