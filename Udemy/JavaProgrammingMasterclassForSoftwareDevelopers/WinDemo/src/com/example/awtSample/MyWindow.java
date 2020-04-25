package com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font f1 = new Font("Roboto",Font.BOLD,18);
        Font f2 = new Font("Roboto",Font.BOLD,12);

        g.setFont(f1);
        g.drawString("Filip Starczewski", 60,60);
        g.setFont(f2);
        g.drawString("Jest przechujem",60,100);

    }

    public MyWindow(String title) {
        super(title);
        setSize(400,180);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
