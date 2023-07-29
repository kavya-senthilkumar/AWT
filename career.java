import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class career extends Frame {
    private Panel p1, p2, p3, p4,p5,p6,p7,p8,p9,p10,p11,p12 ;
    private Button b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    private Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    private Choice choice1,choice2;
    private TextField tf1,tf2,tf3,tf4,tf5,tf6;
    private ImagePanel i1,i2,i3,i4,i5,i6,i7,i8,i9;
    private CheckboxGroup obj1,obj2,obj3,obj4,obj5;
    private Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11;

    public career() {
        setSize(1500, 800);
        setLayout(null);


        // panel 1
        p1 = new Panel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1500, 800);

        i1 = new ImagePanel("image1.jpg");
        i1.setBounds(100, 50, 1250, 600);
        p1.add(i1);

        b1 = new Button("CONTINUE");
        b1.setBounds(700, 700, 100, 30);
        b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p1);
                    add(p2);
                    repaint();
                }
            });
        p1.add(b1);


        // panel 2
        p2=new Panel();
        p2.setLayout(null);
        p2.setBounds(0, 0, 1500, 800);

        i2 = new ImagePanel("image2.jpg");
        i2.setBounds(100, 50, 700, 600);
        p2.add(i2);

        b2 = new Button("DEVELOPER");
        b2.setBounds(1000, 200, 100, 300);
        b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p2);
                    add(p3);
                    repaint();
                }
            });
        p2.add(b2);
        
        b3 = new Button("OTHERS");
        b3.setBounds(1150, 200, 100, 300);
        b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e)
                { 
                    remove(p2);
                    add(p4);
                    repaint();
                }
            });
        p2.add(b3);
    

        // panel 3 ( developer )
        p3 = new Panel();
        p3.setLayout(null);
        p3.setBounds(0, 0, 1500, 800);
        
        b4 = new Button("FRONT END DEVELOPER");
        b4.setBounds(350, 60, 300, 300);
        b4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p3);
                    add(p5);
                    repaint();
                }
            });
        p3.add(b4); 

        b5 = new Button("BACK END DEVELOPER");
        b5.setBounds(850, 60, 300, 300);
        b5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p3);
                    add(p6);
                    repaint();
                }
            });
        p3.add(b5);

        b7 = new Button("FULL STACK DEVELOPER");
        b7.setBounds(600, 380, 300, 300);
        b7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p3);
                    add(p7);
                    repaint();
                }
            });
        p3.add(b7);

        b24 = new Button("BACK");
        b24.setBounds(700, 725, 100, 30);
        b24.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p3);
                    add(p2);
                    repaint();
                }
            });
        p3.add(b24);


        // panel 4 ( OTHERS )
        p4 = new Panel();
        p4.setLayout(null);
        p4.setBounds(0, 0, 1500, 800);

        b8 = new Button("CLOUD ENGINEERING");
        b8.setBounds(300, 150, 400, 400);
        b8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p4);
                    add(p8);
                    repaint();
                }
            });
        p4.add(b8);
        
        b9 = new Button("DATA ANALYST");
        b9.setBounds(900, 150, 400, 400);
        b9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p4);
                    add(p9);
                    repaint();
                }
            });
        p4.add(b9);

        b25 = new Button("BACK");
        b25.setBounds(750, 650, 100, 30);
        b25.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p4);
                    add(p2);
                    repaint();
                }
            });
        p4.add(b25);
    

        // panel 5  FRONT
        p5 = new Panel();
        p5.setLayout(null);
        p5.setBounds(0, 0, 1500, 800);

        i4 = new ImagePanel("fe.jpg");
        i4.setBounds(250, 50, 1000, 600);
        p5.add(i4);

        b12 = new Button("APPLY");
        b12.setBounds(850, 700, 100, 30);
        b12.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p5);
                    add(p10);
                    repaint();
                }
            });
        p5.add(b12);

        b13 = new Button("BACK");
        b13.setBounds(550, 700, 100, 30);
        b13.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p5);
                    add(p3);
                    repaint();
                }
            });
        p5.add(b13);


        // panel 6  BACK
        p6 = new Panel();
        p6.setLayout(null);
        p6.setBounds(0, 0, 1500, 800);

        i5 = new ImagePanel("be.jpg");
        i5.setBounds(250, 50, 1000, 600);
        p6.add(i5);

        b14 = new Button("APPLY");
        b14.setBounds(850, 700, 100, 30);
        b14.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p6);
                    add(p10);
                    repaint();
                }
            });
        p6.add(b14);

        b15 = new Button("BACK");
        b15.setBounds(550, 700, 100, 30);
        b15.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p6);
                    add(p3);
                    repaint();
                }
            });
        p6.add(b15);


        // panel 7 FULL STACK
        p7 = new Panel();
        p7.setLayout(null);
        p7.setBounds(0, 0, 1500, 800);

        i6 = new ImagePanel("fs.jpg");
        i6.setBounds(250, 50, 1000, 600);
        p7.add(i6);

        b16 = new Button("APPLY");
        b16.setBounds(850, 700, 100, 30);
        b16.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p7);
                    add(p10);
                    repaint();
                }
            });
        p7.add(b16);

        b17 = new Button("BACK");
        b17.setBounds(550, 700, 100, 30);
        b17.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p7);
                    add(p3);
                    repaint();
                }
            });
        p7.add(b17);


        // panel 8  CLOUD
        p8 = new Panel();
        p8.setLayout(null);
        p8.setBounds(0, 0, 1500, 800);

        i7 = new ImagePanel("cloud.jpg");
        i7.setBounds(250, 50, 1000, 600);
        p8.add(i7);

        b18 = new Button("APPLY");
        b18.setBounds(850, 700, 100, 30);
        b18.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p8);
                    add(p10);
                    repaint();
                }
            });
        p8.add(b18);

        b19 = new Button("BACK");
        b19.setBounds(550, 700, 100, 30);
        b19.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p8);
                    add(p4);
                    repaint();
                }
            });
        p8.add(b19);


        // panel 9   DATA
        p9 = new Panel();
        p9.setLayout(null);
        p9.setBounds(0, 0, 1500, 800);

        i8 = new ImagePanel("data.jpg");
        i8.setBounds(250, 50, 1000, 600);
        p9.add(i8);

        b20 = new Button("APPLY");
        b20.setBounds(850, 700, 100, 30);
        b20.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p9);
                    add(p10);
                    repaint();
                }
            });
        p9.add(b20);

        b21 = new Button("BACK");
        b21.setBounds(550, 700, 100, 30);
        b21.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p9);
                    add(p4);
                    repaint();
                }
            });
        p9.add(b21);


        // panel 10 ( applying )
        p10 = new Panel();
        p10.setLayout(null);
        p10.setBounds(0, 0, 1500, 800);

        b22 = new Button("CANCEL");
        b22.setBounds(500, 700, 100, 30);
        b22.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ 
                    remove(p10);
                    add(p2);
                    repaint();
                }
            });
        p10.add(b22);

        b23 = new Button(" APPLY ");
        b23.setBounds(800, 700, 100, 30);
        b23.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){ 
                    remove(p10);
                    add(p11);
                    repaint();
                }
            });
        /*b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Dialog dialog=new Dialog(p10,"applied");
                dialog.setBounds(300,300,200,100);
                dialog.add(new Label("Applied successfully :) "));
                dialog.setVisible(true);
            }
        });*/
        p10.add(b23);

        l1=new Label("Firstname");
        l1.setBounds(600,100,120,20);
        p10.add(l1);

        tf1=new TextField();
        tf1.setBounds(750,100,200,20);
        p10.add(tf1);
        
        l2=new Label("Lastname");
        l2.setBounds(600,140,120,20);
        p10.add(l2);

        tf2=new TextField();
        tf2.setBounds(750,140,200,20);
        p10.add(tf2);

        l3=new Label("Email-id");
        l3.setBounds(600,180,120,20);
        p10.add(l3);

        tf3=new TextField();
        tf3.setBounds(750,180,200,20);
        p10.add(tf3);

        l4=new Label("Gender");
        l4.setBounds(600,220,120,20);
        p10.add(l4);

        obj1=new CheckboxGroup();
        cb1=new Checkbox("Male",obj1,false);
        cb2=new Checkbox("Female",obj1,false);
        cb1.setBounds(750,220,100,20);
        cb2.setBounds(850,220,100,20);
        p10.add(cb1);
        p10.add(cb2);

        l5=new Label("Phone");
        l5.setBounds(600,260,120,20);
        p10.add(l5);

        tf4=new TextField();
        tf4.setBounds(750,260,200,20);
        p10.add(tf4);

        l6=new Label("Graduation");
        l6.setBounds(600,300,120,20);
        p10.add(l6);

        tf5=new TextField();
        tf5.setBounds(750,300,200,20);
        p10.add(tf5);

        l7=new Label("Pick the course");
        l7.setBounds(600,340,120,20);
        p10.add(l7);
        
        obj2=new CheckboxGroup();
        cb3=new Checkbox("Developer",obj2,false);
        cb4=new Checkbox("Other",obj2,false);
        cb3.setBounds(750, 340, 100, 20);
        cb4.setBounds(850, 340, 100, 20);

        p10.add(cb3);
        p10.add(cb4);

        obj3=new CheckboxGroup();
        cb5=new Checkbox("Back end",obj3,false);
        cb6=new Checkbox("Front end",obj3,false);
        cb7=new Checkbox("Full stack",obj3,false);
        cb5.setBounds(750, 380, 100, 20);
        cb6.setBounds(750, 420, 100, 20);
        cb7.setBounds(750, 460, 100, 20);

        obj4=new CheckboxGroup();
        cb8=new Checkbox("Cloud engineer",obj4,false);
        cb9=new Checkbox("Data analyst",obj4,false);
        cb8.setBounds(750, 380, 120, 20);
        cb9.setBounds(750, 420, 120, 20);

        cb3.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    Checkbox ch =(Checkbox)ie.getItemSelectable();
                    if(ch.getState()==true)
                    {
                        p10.remove(cb8);
                        p10.remove(cb9);
                        p10.add(cb5);
                        p10.add(cb6);
                        p10.add(cb7);
                    }
                }
            });

        cb4.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    Checkbox ch =(Checkbox)ie.getItemSelectable();
                    if(ch.getState()==true)
                    {
                        p10.remove(cb5);
                        p10.remove(cb6);
                        p10.remove(cb7);
                        p10.add(cb8);
                        p10.add(cb9);
                    }
                }
            });

        l8=new Label("Experience");
        l8.setBounds(600,500,120,20);
        p10.add(l8);
        
        obj5=new CheckboxGroup();
        cb10=new Checkbox("YES",obj5,false);
        cb11=new Checkbox("NO",obj5,false);
        cb10.setBounds(750, 500, 100, 20);
        cb11.setBounds(850, 500, 100, 20);

        p10.add(cb10);
        p10.add(cb11);
        
        l9=new Label("Number of years");
        l9.setBounds(750,540,120,20);

        tf6=new TextField();
        tf6.setBounds(900,540,200,20);

        l10=new Label("CGPA");
        l10.setBounds(600,580,120,20);
        p10.add(l10);

        Choice choice1=new Choice();
        choice1.setBounds(780,580,200,20);
        choice1.add("Select");
        choice1.add("9 above");
        choice1.add("8 above");
        choice1.add("7 above");
        choice1.add("6 above");
        choice1.add("below 5");
        p10.add(choice1);

        l11=new Label("Specialized certificates in");
        l11.setBounds(600,620,160,20);
        p10.add(l11);

        Choice choice2=new Choice();
        choice2.setBounds(780,620,200,20);
        choice2.add("Select");
        choice2.add("Web Development");
        choice2.add("Artificial Intelligence");
        choice2.add("Cloud Computing");
        choice2.add("Machine Learning");
        choice2.add("UI/UX Designing");
        p10.add(choice2); 


        cb10.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    Checkbox ch =(Checkbox)ie.getItemSelectable();
                    if(ch.getState()==true)
                    {
                        p10.add(l9);
                        p10.add(tf6);
                    }
                }
            });
        
        cb11.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent ie){
                    Checkbox ch =(Checkbox)ie.getItemSelectable();
                    if(ch.getState()==true)
                    {
                        p10.remove(l9);
                        p10.remove(tf6);
                    }
                }
            });
        

        // panel 11 ( thankyou )
        p11 = new Panel();
        p11.setLayout(null);
        p11.setBounds(0, 0, 1500, 800);

        i9 = new ImagePanel("tq.jpg");
        i9.setBounds(100, 50, 1000, 600);
        p11.add(i9);


        add(p1);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        career c= new career();
    }
}


class ImagePanel extends Panel {
    private Image image;

    public ImagePanel(String imagePath) {
        image = Toolkit.getDefaultToolkit().getImage(imagePath);
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }
}

