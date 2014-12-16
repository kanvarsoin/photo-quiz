

	 // Copyright Wintriss Technical Schools 2013
	import java.awt.Component;
	import java.awt.Frame;
	import java.net.MalformedURLException;
	import java.net.URL;

	import javax.swing.Icon;
	import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;

	public class photoQuiz {

		public static void main(String[] args) throws Exception {
			Frame quizWindow = new Frame();
			quizWindow.setVisible(true);

			// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select ÒCopy Image URLÓ)
			String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyQ45c3HoEBldwfyPif_zMUrgoXxcGybO1JlKYta2eB9EpP3vHZw";
			// 2. create a variable of type "Component" that will hold your image
            Component ur;
			// 3. use the "createImage()" method below to initialize your Component
            ur = createImage(url);
			// 4. add the image to the quiz window
            quizWindow.add(ur);
			// 5. call the pack() method on the quiz window
            quizWindow.pack();
			// 6. ask a question that relates to the image
            String hi= JOptionPane.showInputDialog("Is this a 18 calaber?"); 
			// 7. print "CORRECT" if the user gave the right answer
            if (hi .equals("no")) {
				JOptionPane.showMessageDialog(null,"Excellent!!!!!");
			}
			// 8. print "INCORRECT" if the answer is wrong
            else {
				JOptionPane.showMessageDialog(null,"Incorrect!!!!!");
			}
			// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		    quizWindow.remove(ur);
			// 10. find another image and create it
            String kilo = "http://upload.wikimedia.org/wikipedia/en/3/37/Mount_Kilimanjaro_2007.jpg";
			// 11. add the second image to the quiz window
            Component ki;
            ki = createImage(kilo);
            quizWindow.add(ki);
			// 12. pack the quiz window
            quizWindow.pack();
			// 13. ask another question
            String me = JOptionPane.showInputDialog("What mountan is this?");
			// 14+ check answer, say if correct or incorrect, etc.
           if (me .equalsIgnoreCase("Mount Kilomanjaro")) {
			JOptionPane.showMessageDialog(null, "Correct!!!!!");
		}
           else {
			JOptionPane.showMessageDialog(null, "Incorrect!!!!!!");
		}
		}

		private static Component createImage(String imageUrl) throws MalformedURLException {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			return imageLabel;
		}

		/* OPTIONAL */
		// *14. add scoring to your quiz
		// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
	}


