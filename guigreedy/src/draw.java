package dsaProject;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;  
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class draw extends Canvas{
 public static void main(String[] args) {
     JFrame frame = new JFrame("Shortest Path Project");
     Canvas canvas = new draw();
     canvas.setBounds(0, 0, 600, 600);
     canvas.setBackground(Color.lightGray);
     frame.add(canvas);
     frame.pack();
     frame.setVisible(true);

 }


// create new random nodes and linking them through edges
 public void paint(Graphics g) {
     int n = 5;
     node[] nodes = new node[n];
   
     for (int i = 0; i < n; i++) {
         nodes[i] = new node();
     }
     for (int i = 0; i < n; i++) {
    	 //draw the oval nodes
    	//set the nodes colour to be blue
    	 g.setColor(Color.BLUE);
         g.drawOval(nodes[i].x, nodes[i].y, 20, 10);
         g.fillOval(nodes[i].x, nodes[i].y, 20, 10);

         for (int j = i; j < n; j++){
        	 g.setColor(Color.BLACK);
             g.drawLine(nodes[i].x + 10, nodes[i].y + 5, nodes[j].x + 10, nodes[j].y + 5);
         }

     }
 }

}
