import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Admin implements ActionListener{
	JFrame frame;
	JButton b1_books;
	JButton	b2_issue;
	JButton b3_addBooks;

	Admin(){
		JFrame frame=new JFrame();
		JPanel p2_yellow=new JPanel();
		JPanel p3_green=new JPanel();
		p2_yellow.setBounds(200,40,500,150);
		p3_green.setBounds(200,190,500,50);
		b1_books=new JButton("Check Books");
		b1_books.setBackground(Color.BLUE);
		b1_books.setForeground(Color.WHITE);
		b1_books.setFocusable(false);
		b1_books.setLayout(new FlowLayout(FlowLayout.LEFT));
		b1_books.addActionListener(this);
		b2_issue=new JButton("Issue Books");
		b2_issue.setBackground(Color.BLUE);
		b2_issue.setForeground(Color.WHITE);
		b2_issue.setFocusable(false);
		b2_issue.addActionListener(this);
		b2_issue.setLayout(new FlowLayout(FlowLayout.CENTER));
		b3_addBooks=new JButton("Add Books");
		b3_addBooks.setBackground(Color.BLUE);
		b3_addBooks.setForeground(Color.WHITE);
		b3_addBooks.setFocusable(false);
		b3_addBooks.addActionListener(this);
		
		b3_addBooks.setLayout(new FlowLayout(FlowLayout.RIGHT));


		JLabel label3=new JLabel("WELCOME TO YOUR DASHBOARD");
		label3.setHorizontalTextPosition(label3.CENTER);
		label3.setVerticalTextPosition(label3.BOTTOM);
		label3.setForeground(Color.BLUE);
		label3.setFont(new Font("Helvetica",Font.BOLD,20));
		p2_yellow.add(label3);
		p3_green.add(b1_books);
		p3_green.add(b2_issue);
		p3_green.add(b3_addBooks);
		frame.add(p2_yellow);
		frame.add(p3_green);
		frame.setTitle("Admin Dashboard");
		frame.setSize(700,500);
		frame.setLayout(null);
		frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b3_addBooks) {

	    }
			  
		if(e.getSource()==b2_issue) {

		}

		if(e.getSource()==b1_books) {

		}

	}
}

