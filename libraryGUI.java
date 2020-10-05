import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.sql.*;

public class libraryGUI extends JPanel
{
  private JPanel panel;
  private JFrame frame;

  private final int WIDTH = 600;
  private final int LENGTH = 600;

  private JButton inventory;
  private JButton takenBook;
  private JButton returnedBook;

  public libraryGUI()
  {
    mainPanel();
    mainFrame();
  }

  public void mainFrame()
  {
    JFrame frame = new JFrame();
    frame.setTitle("Library Management System");
    frame.setSize(WIDTH, LENGTH);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void mainPanel()
  {
    panel = new JPanel(new GridLayout(0, 2, 3, 8));

    inventory = new JButton("Books Available");
    inventory.addActionListener(new ActionListener)
    {
      public void actionPerformed(ActionEvente)
      {
        available();
      }
    }
    panel.add(inventory);


    takenBook = new JButton("Check Out Book");
    takenBook.addActionListener(new ActionListener)
    {
      public void actionPerformed(ActionEvente)
      {
        checkOut();
      }
    }
    panel.add(takenBook);

    returnedBook = new JButton("Return Book");
    returnedBook.addActionListener(new ActionListener)
    {
      public void actionPerformed(ActionEvente)
      {
        returned();
      }
    }
    panel.add(returnedBook);
  }

  public void available()
  {
    JOptionPane.showMessageDialog(frame, "", "Available Books", JOptionPane.PLAIN_MESSAGE);

    // SELECT * FROM library_inventory table
  }

  public void checkOut()
  {
    /*
    Checking out a book will be based on the ID number of a book
    "Enter ID number of Book you would like to check out"
    Will subtract 1 from the quantity of books in the database
    */
    String input;

    input = JOptionPane.showInputDialog(frame, "Enter ID number of Book you would like to check out: ");

  }

  public void returned()
  {
    /*
    Returning a book will be based on the ID number of a book
    "Enter ID number of Book you are returning"
    Will add 1 from the quantity of books in the database
    */
    String input;

    input = JOptionPane.showInputDialog(frame, "Enter ID number of Book you would like to return: ");

  }

  public static void main(String[] args)
  {
    new libraryGUI();
  }
}
