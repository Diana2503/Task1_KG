package ru.vsu.cs.cg2021.g41.beshmelnicyna_d_yu.task1;

import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow()  {
        this.setSize(1000, 700);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Village");

        add(new DrawPanel());
        //this.setLocationRelativeTo(null);
        //mainWindow.setEnabled(false);

    }
}
