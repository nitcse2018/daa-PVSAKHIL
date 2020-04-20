import java.io.*;
import java.awt.*;
import java.awt.event.*;
public class resume implements ActionListener{
    TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
    Choice c1,c2;
    Button b1;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    resume()
    {
        Frame f = new Frame("Resume Builder");
        f.setBackground(Color.LIGHT_GRAY);
        l1=new Label("Name:");
        l1.setBounds(100,100,150,20);
        f.add(l1);
        tf1=new TextField(30);
        tf1.setBounds(350,100,170,20);
        f.add(tf1);
        l6=new Label("EmailID:");
        l6.setBounds(100,200,150,20);
        f.add(l6);
        tf5=new TextField(30);
        tf5.setBounds(350, 200,170, 20);
        f.add(tf5);
        l2=new Label("Qualifications:");
        l2.setBounds(100,300,250,20);
        f.add(l2);
        c1 = new Choice();
        c1.add("Select");
        c1.addItem("High School");
        c1.addItem("Graduation");
        c1.addItem("Post Graduation");
        c1.addItem("Ph.D");
        c1.setBounds(350,300,170,20);
        f.add(c1);

        l3=new Label("Address:");
        l3.setBounds(100,400,150,20);
        f.add(l3);
        tf2 = new TextField(30);
        tf2.setBounds(350,400,170,20);
        f.add(tf2);
        l4=new Label("Phone No:");
        l4.setBounds(100, 500, 150, 20);
        f.add(l4);
        tf3 = new TextField(30);
        tf3.setBounds(350,500,170,20);
        f.add(tf3);

        l5=new Label("Hobbies:");
        l5.setBounds(100, 600,150,20);
        f.add(l5);
        tf4 = new TextField(30);
        tf4.setBounds(350,600,170,20);
        f.add(tf4);
        l7=new Label("DOB(dd/mm/yyyy):");
        l7.setBounds(700,200,200,20);
        f.add(l7);

        tf6=new TextField(30);
        tf6.setBounds(1000,200,200,20);
        f.add(tf6);

        l8=new Label("Gender:");
        l8.setBounds(700,100, 200, 20);
        f.add(l8);
        c2 = new Choice();
        c2.addItem("Select");
        c2.addItem("Male");
        c2.addItem("Female");
        c2.addItem("Others");
        c2.setBounds(1000,100,200,20);
        f.add(c2);
        l10=new Label("Job Title:");
        l10.setBounds(700,450,330,150);
        f.add(l10);
        tf9=new TextField(40);
        tf9.setBounds(1060,500,300,150);
        f.add(tf9);

        b1=new Button("Submit");
        b1.setBackground(Color.GRAY);
        b1.addActionListener(this);
        b1.setBounds(700,700,150, 50);
        f.add(b1);
        l9=new Label("Skills:");
        l9.setBounds(700,300,200,20);
        f.add(l9);
        tf7=new TextField(50);
        tf7.setBounds(1000,300,250,130);
        f.add(tf7);
        f.setSize(1650,800);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font myFont = new Font("Serif",Font.BOLD,20);
        l1.setFont(myFont);
        l2.setFont(myFont);
        l3.setFont(myFont);
        l4.setFont(myFont);
        l5.setFont(myFont);
        l6.setFont(myFont);
        b1.setFont(myFont);
        l7.setFont(myFont);
        l8.setFont(myFont);
        l9.setFont(myFont);
        l10.setFont(myFont);
    }
    public void actionPerformed(ActionEvent a){
        try {
            FileWriter myWriter = new FileWriter("Resume.txt");
            myWriter.write("NAME: "+tf1.getText()+"\n");
            myWriter.write("GENDER :"+c2.getItem(c2.getSelectedIndex())+"\n");
            myWriter.write("EMAIL ID :"+tf5.getText()+"\n");
            myWriter.write("DATE OF BIRTH :"+tf6.getText()+"\n");
            myWriter.write("QUALIFICATION: "+ c1.getItem(c1.getSelectedIndex())+"\n");
            myWriter.write("SKILLS :"+tf7.getText()+"\n");
            myWriter.write("POSITIONS OF RESPONSIBILITY :"+tf9.getText()+"\n");
            myWriter.write("ADDRESS: "+tf2.getText()+"\n");
            myWriter.write("MOBILE NO: "+tf3.getText()+"\n");
            myWriter.write("HOBBIES: "+tf4.getText());


            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        resume f = new resume();
    }
}