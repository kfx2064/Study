package ch07.part05.main5.sub2;

import javax.swing.*;

public class MainUi extends JFrame {

    public MainUi() {
        this.setSize(300, 300);

        String[] header = {"항목1", "항목2", "항목3"};
        String[][] data = {{"값11", "값12", "값13"}, {"값21", "값22", "값23"}, {"값31", "값32", "값33"}};

        JTable table = new JTable(data, header);

        JScrollPane pane = new JScrollPane();

        pane.setViewportView(table);

        this.add(pane);
    }

    public static void main(String[] args) {
        MainUi mainUi = new MainUi();
        mainUi.setVisible(true);
    }

}
