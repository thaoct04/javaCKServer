/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import static swing.Home.ist;
import static swing.Home.list;
import static swing.Home.model;
import static swing.Home.socket;

/**
 *
 * @author Thuan Thao
 */
public class myprocess extends Thread {

    Socket socket;
    Home home;

    public myprocess(Socket socket, Home home) {
        this.socket = socket;
        this.home = home;
        try {

        } catch (Exception e) {
        }
    }

    @Override
    public void run() {

   

    }

}
