package main;
import javax.swing.*;  
public class CalculatorUsingSwing {  
	public static void main(String[] args) {  
		int x=5, y=5, sp=2, w=50, h=40;
		JFrame f=new JFrame();//creating instance of JFrame 
		
		JButton monitor=new JButton("       ");//creating instance of JButton  
		monitor.setBounds(x, y, 211, 40);//x axis, y axis, width, height
		
		f.add(monitor);//adding button in JFrame
	 
		y+=40+sp;        
		JButton seven=new JButton("7");  
		seven.setBounds(x, y, w, h); 
		f.add(seven); 
		
		x+=w+sp;
		JButton eight=new JButton("8"); 
		eight.setBounds(x, y, w, h);
		f.add(eight);
		
		x+=w+sp;
		JButton nine=new JButton("9");
		nine.setBounds(x, y, w, h);
		f.add(nine);
		
		x+=w+sp;
		JButton plus=new JButton("+");
		plus.setBounds(x, y, w+5, h);           
		f.add(plus);  
		
		x=5;
		y+=h+sp;
		
		JButton four=new JButton("4");  
		four.setBounds(x, y, w, h); 
		f.add(four); 
		
		x+=w+sp;
		JButton five=new JButton("5"); 
		five.setBounds(x, y, w, h);
		f.add(five);
		
		x+=w+sp;
		JButton six=new JButton("6");
		six.setBounds(x, y, w, h);
		f.add(six);
		
		x+=w+sp;
		JButton minus=new JButton("-");
		minus.setBounds(x, y, w+5, h);           
		f.add(minus);
	
		x=5;
		y+=h+sp;
		
		JButton one=new JButton("1");  
		one.setBounds(x, y, w, h); 
		f.add(one); 
		
		x+=w+sp;
		JButton two=new JButton("2"); 
		two.setBounds(x, y, w, h);
		f.add(two);
		
		x+=w+sp;
		JButton three=new JButton("3");
		three.setBounds(x, y, w, h);
		f.add(three);
		
		x+=w+sp;
		JButton multiply=new JButton("*");
		multiply.setBounds(x, y, w+5, h); 
		f.add(multiply);
		
		x=5;
		y+=h+sp;
		
		JButton zero=new JButton("0");  
		zero.setBounds(x, y, w, h); 
		f.add(zero); 
		
		x+=w+sp;
		JButton dot=new JButton("."); 
		dot.setBounds(x, y, w, h);
		f.add(dot);
		
		x+=w+sp;
		JButton equal=new JButton("=");
		equal.setBounds(x, y, w, h);
		f.add(equal);
		
		x+=w+sp;
		JButton divison=new JButton("/");
		divison.setBounds(x, y, w+5, h); 
		f.add(divison);
		
		
		f.setSize(236,258);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
	}  
}  