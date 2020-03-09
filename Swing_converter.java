
package swing_converter;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Swing_converter extends JFrame {
    
    double milimetre, centimetre, metre, kilometre ; 
    int flag ;
    
    JTextField field_input ;
    JTextField field_output1;
    JTextField field_output2;
    JTextField field_output3;
    
    JLabel lebel_mililmetre ;
    JLabel lebel_centimetre ;
    JLabel lebel_metre ;
    JLabel lebel_kilometre ;
    
    JRadioButton button_milimetre;
    JRadioButton button_centimetre ;
    JRadioButton button_metre;
     JRadioButton button_kilometre;
    
    Swing_converter(){
        
        init_frame();
        
        lebel_mililmetre = new JLabel ("Input");
        lebel_centimetre = new JLabel ("Output");
        lebel_metre      = new JLabel ("Output");
        lebel_kilometre  = new JLabel ("Output");
        
        field_input    = new JTextField(10);
        field_output1  = new JTextField(10);
        field_output2  = new JTextField(10);
        field_output3  = new JTextField(10);
        
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(new FlowLayout(FlowLayout.LEADING));
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(new GridLayout (4,2,5,5));
        
        JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout (4,1,5,5));
        
        
        
        JButton convert = new JButton ("Convert");
        
         button_milimetre = new JRadioButton("Milimetre");
         button_centimetre = new JRadioButton("Centimetre");
         button_metre      = new JRadioButton("Mitre");
         button_kilometre  = new JRadioButton("Kilometre");
        
        ButtonGroup group = new ButtonGroup () ;
        
        group.add(button_milimetre);
        group.add(button_centimetre);
        group.add(button_metre);
        group.add(button_kilometre);
        
        panel_3.add(button_milimetre);
        panel_3.add(button_centimetre);
        panel_3.add(button_metre);
        panel_3.add(button_kilometre);
        
        panel_2.add(lebel_mililmetre);
        panel_2.add(field_input);
        panel_2.add(lebel_centimetre);
        panel_2.add(field_output1);
        panel_2.add(lebel_metre);
        panel_2.add(field_output2);
        panel_2.add(lebel_kilometre);
        panel_2.add(field_output3);
        
        panel_1.add(panel_2);
        panel_1.add(panel_3);
        
        this.setLayout(new BorderLayout(20,20));
        add(panel_1,BorderLayout.CENTER);
        add(convert,BorderLayout.SOUTH);
        
        Radiobutton  Rb = new Radiobutton ();
        //Textfield    Tf = new Textfield ();
        Convert      c  = new Convert ();
        
        
        
        button_milimetre.addItemListener(Rb);
        button_centimetre.addItemListener(Rb);
        button_metre.addItemListener(Rb);
        button_kilometre.addItemListener(Rb);
        
         //field_input.addActionListener(Tf);
        /* field_output1.addActionListener(Tf);
         field_output2.addActionListener(Tf);
         field_output3.addActionListener(Tf);*/
         
         convert.addActionListener(c);
        
     }
    
    class Radiobutton implements ItemListener {

        public void itemStateChanged(ItemEvent e) {
            
            if(button_milimetre.isSelected()){
                
                flag = 1;
                
                lebel_mililmetre.setText("Milimetre");
                lebel_centimetre.setText("Centimetre");
                lebel_metre.setText("Metre");
                lebel_kilometre.setText("Kilometre");
                
                
            }
            
          else  if(button_centimetre.isSelected()){
                flag = 2;
                
                lebel_mililmetre.setText("centimetre");
                lebel_centimetre.setText("Milimetre");
                lebel_metre.setText("Metre");
                lebel_kilometre.setText("Kilometre");
                
                
            }
            
            
          else   if(button_metre.isSelected()){
                 flag = 3 ;
                 
                lebel_mililmetre.setText("Metre");
                lebel_centimetre.setText("Milimetre");
                lebel_metre.setText("centimetre");
                lebel_kilometre.setText("Kilometre");
                
                
             }
             
         else if(button_kilometre.isSelected()){
                 flag = 4 ;
                 
                lebel_mililmetre.setText("Kilometre");
                lebel_centimetre.setText("Milimetre");
                lebel_metre.setText("centimetre");
                lebel_kilometre.setText("Metre");
                
                
             }
            
        }
    }
    
        
    
    class Convert implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            switch(flag){
                case 1 :
                         milimetre = Double.parseDouble(field_input.getText());
                    
                    
                         centimetre = milimetre * 0.1 ;
                         metre = milimetre * 0.001 ;
                         kilometre = metre* 0.001 ;
                         
                         field_output1.setText(String.valueOf(centimetre));
                         field_output2.setText(String.valueOf(metre));
                         field_output3.setText(String.valueOf(kilometre));
                         
                         break;
                         
                case 2 :
                    centimetre = Double.parseDouble(field_input.getText());
                    
                    milimetre = centimetre * 10 ;                      
                    metre = centimetre *0.01 ;                     
                    kilometre = metre * 0.001 ;
                    
                    field_output1.setText(String.valueOf(milimetre));
                    field_output2.setText(String.valueOf(metre));
                    field_output3.setText(String.valueOf(kilometre));
                    
                    break ;
                    
                case 3 :  
                    metre = Double.parseDouble(field_input.getText());
                    milimetre = metre * 1000 ;                     
                    centimetre = metre * 100 ;                     
                    kilometre = metre * 0.001 ;
                    
                    field_output1.setText(String.valueOf(milimetre));
                    field_output2.setText(String.valueOf(centimetre));
                    field_output3.setText(String.valueOf(kilometre));
                    
                    break;
                    
                case 4 : 
                    kilometre = Double.parseDouble(field_input.getText());
                    
                    metre = kilometre * 1000 ;                     
                    centimetre = metre * 100 ;                     
                    milimetre = centimetre * 10 ;
                    
                    field_output1.setText(String.valueOf(milimetre));
                    field_output2.setText(String.valueOf(centimetre));
                    field_output3.setText(String.valueOf(metre));
                    
                    break;
            }
            
           
        }
        
    }
    void init_frame(){
        
        this.setTitle("Simple Converter");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    
    }

 
     
    public static void main(String[] args) {
        try {
UIManager . setLookAndFeel ("javax . swing . pl a f . metal .MetalLookAndFeel " ) ;
} catch ( Exception e ) {
System.out.println(" Except ion : " + e.getMessage()) ;
}
        Swing_converter frame = new Swing_converter ();
        
          frame.setResizable(false); // important 
          frame.setVisible(true);
          frame.pack();
        
    }
    
       
    
}
