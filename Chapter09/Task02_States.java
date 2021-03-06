package ru.ereshchenko.MyJava.Chapter09;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Task02_States extends JFrame implements ItemListener {

    public static void main(String[] args) {

        Task02_States gui = new Task02_States();

    }

    JPanel pnl = new JPanel();
    String[] styles = {"В глубокой форме", "Для гурманов", "Тонкая"};
    JComboBox<String> box = new JComboBox<String>(styles);
    JRadioButton rad1 = new JRadioButton("Белое");
    JRadioButton rad2 = new JRadioButton("Красное");
    ButtonGroup wines = new ButtonGroup();
    JCheckBox chk = new JCheckBox("Пеперони");
    JTextArea txtArea = new JTextArea(5, 38);


    public Task02_States() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        wines.add(rad1);
        wines.add(rad2);
        pnl.add(chk);
        pnl.add(box);
        pnl.add(txtArea);

        rad1.addItemListener(this);
        rad2.addItemListener(this);
        chk.addItemListener(this);
        box.addItemListener(this);
    }


    @Override
    public void itemStateChanged(ItemEvent event) {

        if ( event.getItemSelectable() == rad1 )
            txtArea.setText( "Выбрано белое вино" ) ;
        if ( event.getItemSelectable() == rad2 )
            txtArea.setText( "Выбрано красное вино" ) ;
        if ( ( event.getItemSelectable() == chk ) &&
                ( event.getStateChange() == ItemEvent.SELECTED ) )
            txtArea.append( "\nВыбрана Пеперони\n" ) ;
        if ( ( event.getItemSelectable() == box ) &&
                ( event.getStateChange() == ItemEvent.SELECTED ) )
            txtArea.append("Выбрана" + event.getItem().toString()) ;


    }
}