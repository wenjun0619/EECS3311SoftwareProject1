


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPanel extends JFrame implements ActionListener {
	
	private BubbleSort bubble=null;


	
	private JButton load;
	private JButton sort;
	
		
	public MyPanel() {
		//Creating the button to load the shapes.

		//create two buttons
		load=new JButton("Load shapes");
		load.addActionListener(this);
		load.setBounds(130, 15, 180, 25);
		add(load);
		//
		sort=new JButton("Sort shapes");
		sort.addActionListener(this);
		sort.setBounds(330, 15, 180, 25);
		add(sort);
		setTitle("Display shapes");
		setSize(650, 650);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		if(bubble==null) return;
		//create and draw shapes
		for(int i=0;i<bubble.getShapes().size();i++)
		{
			Shape shape=bubble.getShapes().get(i);
			//set the top-left location
			int upperX=70*(i+1);
			int upperY=70*(i+2);
			shape.setlocation(upperX, upperY);
			shape.paint(g);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//load button
				if(e.getSource()==load)
				{
					
					bubble=new BubbleSort();
					
					this.repaint();
				}
				//sort button
				else if(e.getSource()==sort)
				{
					//sort
					if(bubble==null) return;
					bubble.sorting();
					
					this.repaint();
				}
		
	}
	public static void main(String[] args)
	{
		new MyPanel();
	}
		
}