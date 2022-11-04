import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Robot {
	private DisplayImage imagen = new DisplayImage();
	public void startApp() throws IOException{
		System.out.println(": Hi, I'm Donald, the personal robot of the incredible group 4 formed by Isa Latorre, Diego Beltrán, Gabriela Gaviria and Alejandro Pinilla."
				+ " My job today is to share with you some information about the amazon project that my bosses "
				+ "have been doing every day since they arrived from their field trip.");
		System.out.println("But before we start, let's test your general knowledge about the amazon region!");
		ArrayList<Question> list = new ArrayList<>();
		Question q1 = new Question("Is it true that the Amazon River is considered the longest river in the world?",  "True");
		Question q2 = new Question("The Ticunas and the Boras are indigenous communities of the department of the Amazon", "True");
		Question q3 = new Question("It is true that pink dolphins possess an intellectual capacity 40% greater than that of human beings", "True");
		Question q4 = new Question("The main municipalities of the department of Amazonas are Tarapaca and Puerto Nariño", "False");
		Question q5 = new Question("Is the department of Amazonas the Lung of the World? ", "False");
		Question q6 = new Question("The amazon has never been deforested", "False");
		Question q7 = new Question("There are no endangered animals or plants in Brazil", "False");
		list.add(q1);
		list.add(q2);
		list.add(q3);
		list.add(q4);
		list.add(q5);
		list.add(q6);
		list.add(q7);
		int num = 0;
		for (int i=0; i<list.size(); i++) {
			String resp = input(list.get(i).getQuestion());
			if (resp.toLowerCase().equals(list.get(i).getAnswer().toLowerCase())){
				System.out.println("That is correct");
				num += 1;
			}
			else {
				System.out.println("That is incorrect");
			}
		}
		System.out.println("You had " + num + " correct answers");
		
		System.out.println("Okay, now that we tested your knowledge, we will continue with the explanation of the project itself");
		imagen.DisplayImg("src/data/Imagen1.jpg");
		System.out.println("The objective of the experiment was to analyze the relationship between the concentration of Nitrates and Phosphates \nin 3 different locations of the Marasha lake and the human activity carried out there.");
		System.out.println("Click on the popup to see the image");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OH! I almost forgot to tell you that all measurements were performed with 2 kits, each one to measure nitrates and phosphate in the water. ");
		imagen.DisplayImg("src/data/Imagen2.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Okay, Finally, here is a curious fact about the amazon:\r\n"
				+ "\r\n"
				+ "The Amazon is so big that if it were a country, it would be considered the ninth largest in terms of size.\r\n"
				+ "");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you for your attention, I hope you enjoyed it.");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int cal = Integer.valueOf(input("From 1 to 5, rate your experience with Donald" ));
		if (cal < 4){
			System.out.println("oh no, forgive me, my bosses are giving me a hard time");
		}
		else {
			System.out.println("Yayyy, i am glad you enjoyed it, i tried my best");
		}
	}

	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}
	
	public void DisplayImage(String file) throws IOException
    {
        BufferedImage img=ImageIO.read(new File(file));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
	
	
	
	public static void main(String[] args) throws IOException
	{
		Robot robot = new Robot();
		robot.startApp();
		
	}
	
	

}
