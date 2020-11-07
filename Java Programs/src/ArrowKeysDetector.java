import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

class ArrowKeysDetector{
	
	
	public ArrowKeysDetector() {
		
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		JLabel Up=new JLabel();
		JLabel Down=new JLabel();
		JLabel Left=new JLabel();
		JLabel Right=new JLabel();
		
		Up.setText("Up 0 ");
		Down.setText("Down 0 ");
		Left.setText("Left 0 ");
		Right.setText("Right 0 ");
		
		panel.add(Up);
		panel.add(Down);
		panel.add(Left);
		panel.add(Right);
		
		frame.add(panel);
		
		frame.addKeyListener(new KeyListener() {
			
			int upcount=0;
			int downcount=0;
			int leftcount=0;
			int rightcount=0;
			
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				 int keycode=e.getKeyCode();
				  switch(keycode) {
				  
				  case KeyEvent.VK_LEFT:
					  Left.setText("Left " + leftcount++);
					  break;
					  
				  case KeyEvent.VK_RIGHT:
					  Right.setText("Right " + rightcount++);
					  break;
					  
				  case KeyEvent.VK_UP:
					  Up.setText("Up " + upcount++);
					  break;
					  
				  case KeyEvent.VK_DOWN:
					  Down.setText("Down " + downcount++);
					  break;
					}
				
				
			}
		});
		
		
		
		
		
		
	}
	
	public static void main(String[] args ) {
		new ArrowKeysDetector();
		}
	
	}