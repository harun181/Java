import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Admin implements ActionListener{
	JFrame frame;
	JButton b1_patient;
	JButton	b2_doctor;
	JButton b3_addPatient;

	Admin(){
		JFrame frame=new JFrame();
		JPanel p2_yellow=new JPanel();
		JPanel p3_green=new JPanel();
		p2_yellow.setBounds(200,40,500,150);
		p3_green.setBounds(200,190,500,50);
		b1_patient=new JButton("Check Patient");
		b1_patient.setBackground(Color.BLUE);
		b1_patient.setForeground(Color.WHITE);
		b1_patient.setFocusable(false);
		b1_patient.setLayout(new FlowLayout(FlowLayout.LEFT));
		b1_patient.addActionListener(this);
		b2_doctor=new JButton("Check Doctor");
		b2_doctor.setBackground(Color.BLUE);
		b2_doctor.setForeground(Color.WHITE);
		b2_doctor.setFocusable(false);
		b2_doctor.addActionListener(this);
		b2_doctor.setLayout(new FlowLayout(FlowLayout.CENTER));
		b3_addPatient=new JButton("Add Patient");
		b3_addPatient.setBackground(Color.BLUE);
		b3_addPatient.setForeground(Color.WHITE);
		b3_addPatient.setFocusable(false);
		b3_addPatient.addActionListener(this);
		
		b3_addPatient.setLayout(new FlowLayout(FlowLayout.RIGHT));


		JLabel label3=new JLabel("WELCOME TO YOUR DASHBOARD");
		label3.setHorizontalTextPosition(label3.CENTER);
		label3.setVerticalTextPosition(label3.BOTTOM);
		label3.setForeground(Color.BLUE);
		label3.setFont(new Font("Helvetica",Font.BOLD,20));
		p2_yellow.add(label3);
		p3_green.add(b1_patient);
		p3_green.add(b2_doctor);
		p3_green.add(b3_addPatient);
		frame.add(p2_yellow);
		frame.add(p3_green);
		frame.setTitle("Admin Dashboard");
		frame.setSize(700,500);
		frame.setLayout(null);
		frame.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b3_addPatient) {
			String num;
			num = JOptionPane.showInputDialog(null, "Enter a Patient Name:", "Patient Details", 1);
			double num1 = Double.parseDouble(num);
	    }
			  
		if(e.getSource()==b2_doctor) {
			String num;
			num = JOptionPane.showInputDialog(null, "Enter a Doctor Name:", "Patient Details", 1);
			double num1 = Double.parseDouble(num);
		}

		if(e.getSource()==b1_patient) {
			String num;
			num = JOptionPane.showInputDialog(null, "Enter a Patient:", "Patient Lists", 1);
			double num1 = Double.parseDouble(num);
		}

	}
}

