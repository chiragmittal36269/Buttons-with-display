import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {

    JFrame jFrame;
    JTextArea jTextArea;
    JButton jButton;
    JMenuBar jMenuBar;
    JMenu File;
    JMenuItem New;
    JMenuItem Open;
    JMenuItem Save;
    JMenuItem Print;
    JMenu Edit;
    JMenuItem Cut;
    JMenuItem Copy;
    JMenuItem Paste;
    JMenu Close;
    JMenuItem CloseEditor;


    FirstSession()
    {
        jFrame = new JFrame("First Demo");
        jTextArea = new JTextArea("Window is all yours");
        jButton = new JButton("Button");
        jMenuBar = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Close = new JMenu("Close");
        New = new JMenuItem("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Print = new JMenuItem("Print");
        Cut = new JMenuItem("Cut");
        Copy = new JMenuItem("Copy");
        Paste = new JMenuItem("Paste");
        CloseEditor = new JMenuItem("Close");


        jFrame.add(jTextArea);
        jFrame.add(jButton);
        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(Print);
        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);
        Close.add(CloseEditor);
        jMenuBar.add(File);
        jMenuBar.add(Edit);
        jMenuBar.add(Close);
        jFrame.setJMenuBar(jMenuBar);


        jFrame.setLayout(null);


        jButton.addActionListener(this);
        New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Print.addActionListener(this);
        Cut.addActionListener(this);
        Copy.addActionListener(this);
        Paste.addActionListener(this);
        CloseEditor.addActionListener(this);


        jFrame.setBounds(200, 100, 400, 600);
        jTextArea.setBounds(10, 100, 390, 100);
        jButton.setBounds(225, 350, 90, 50);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jButton.setVisible(true);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        FirstSession f = new FirstSession();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("New"))
        {
            jTextArea.setText("You want to open new file for work.");
        }
        else if(s.equals("Open"))
        {
            jTextArea.setText("You want to open existing file for editing or reading purpose.");
        }
        else if(s.equals("Save"))
        {
            jTextArea.setText("You want to save this file as a new file or in the existing file");
        }
        else if(s.equals("Print"))
        {
            jTextArea.setText("You want to print this document or save it in pdf format.");
        }
        else if(s.equals("Cut"))
        {
            jTextArea.setText("You want to cut some data from the file.");
        }
        else if(s.equals("Copy"))
        {
            jTextArea.setText("You want to copy some data from the file.");
        }
        else if(s.equals("Paste"))
        {
            jTextArea.setText("You want to paste some data in the file.");
        }
        else if(s.equals("Close"))
        {
            jTextArea.setText("You want to close the file.");
        }
        else if(s.equals("Button"))
        {
            jTextArea.setText(":)");
        }
    }
}
