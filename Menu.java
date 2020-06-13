import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Menu extends JPanel implements ActionListener {
    private JLabel title;
    private JButton play,instruction;
    private ImageIcon logo;
    public Menu(){
		this.setPreferredSize(new Dimension(1300,700));
        logo = new ImageIcon("TitleLogo.png");
        play = new JButton("Play");
        instruction = new JButton("Instructions");
        title = new JLabel(logo);
        play.addActionListener(this);
		play.setBackground(Color.GREEN);
		play.setOpaque(true);
        instruction.addActionListener(this);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        title.setBounds(0,0,1300,350);
        play.setBounds(400,400,500,75);
        instruction.setBounds(400,550,500,75);
        this.add(title);
        this.add(play);
        this.add(instruction);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
		g.setFont(new Font("Open Sans",Font.PLAIN,20));
		g.drawString("By:Bryan Jiang and Eric Chen",1000,650);
    }
    public void actionPerformed(ActionEvent event) {
            if(event.getSource()==play){
		TFT.LoadGame();
            }
            if(event.getSource()==instruction){
                TFT.LoadInstructions();
            }
    }
}
