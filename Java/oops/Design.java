import javax.swing.*;
import java.awt.*;

class Design {
	public static void main(String[] args) {
		//create JFrame Instance
		JFrame frame = new JFrame(); 
		frame.setTitle("Morse Code Translator by Seun Matt (@SeunMatt2)");
		frame.setLayout(new BorderLayout());

		frame.setSize(new Dimension(800, 650));

		//this terminate the app when the close button is clicked
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//this will make the app to always display at the center
		frame.setLocationRelativeTo(null);

		//well, I don't want you to resize the window
		frame.setResizable(true);

		//and yes this will show the visible frame/app
		frame.setVisible(true);

		// =====================================================================
		JPanel morseControlPanel = new JPanel();

		//set the layout style
		morseControlPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton englishTomorseBt = new JButton("English to Morse");
		//add the Morse >> English button
		morseControlPanel.add(englishTomorseBt);

		JButton clearEnglishText = new JButton("<< Clear Text");
		//add the Clear Text >> button
		morseControlPanel.add(clearEnglishText);
		// =============================================================
		//set the layout style
		morseControlPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		JButton morseToEnglishBt = new JButton("Morse to English");
		//add the Morse >> English button
		morseControlPanel.add(morseToEnglishBt);

		JButton clearMorseText = new JButton("<< Clear Text");
		//add the Clear Text >> button
		morseControlPanel.add(clearMorseText);

		// ==================================================================
		TextArea englishTomorseTextArea = new TextArea("", 5, 4);

		//add other containers and elements to the JFrame
		frame.add(morseControlPanel, BorderLayout.CENTER);
		frame.add(englishTomorseTextArea, -BorderLayout.CENTER);

	}
}
