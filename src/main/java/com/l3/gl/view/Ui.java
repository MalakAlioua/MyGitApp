package com.l3.gl.view;

import javax.swing.*;

public class Ui extends JFrame {

    public Ui() {
        super("My Git App");
        JButton btn = new JButton("Click Me");
        this.add(btn);
        this.setSize(200, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showUi() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.showUi();
    }
}
