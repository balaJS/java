import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Pattern;
import java.awt.Toolkit;

public class Container {

	private JFrame frmCalculator;
	private JTextField textField_1;
	private JLabel lblNumber_2;
	private JTextField textField_2;
	private JComboBox<?> comboBoxOpr;
	private JLabel lblOperation;
	private JLabel lblOutput;
	private JLabel errLabel1;
	private JLabel errLabel2;
	private JButton btnCalculate;
	
	Operation op = new Operation();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Container window = new Container();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Container() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setEnabled(false);
		frmCalculator.setSize(500, 450);
		frmCalculator.setLocation(450, 250);
		frmCalculator.setTitle("Calculator");
		frmCalculator.getContentPane().setLayout(null);
		Toolkit.getDefaultToolkit().getImage(Container.class.getResource("image2.jpeg"));
//		System.out.println(Container.class.getResource("image2.jpeg"));
		
		JLabel lblNumber_1 = new JLabel("Number 1:");
		lblNumber_1.setBounds(24, 27, 90, 15);
		frmCalculator.getContentPane().add(lblNumber_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 25, 114, 19);
		frmCalculator.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNumber_2 = new JLabel("Number 2:");
		lblNumber_2.setBounds(24, 72, 90, 15);
		frmCalculator.getContentPane().add(lblNumber_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(112, 70, 114, 19);
		frmCalculator.getContentPane().add(textField_2);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Boolean errorFree1 = field_validate(textField_1, errLabel1);
				Boolean errorFree2 = field_validate(textField_2, errLabel2);
				btnCalculate.setEnabled(true);
				if (!errorFree1 || !errorFree2) {
					return;
				}
				float fNum1, fNum2;
				int operationIndex = comboBoxOpr.getSelectedIndex();
				float output;
				fNum1 = Float.parseFloat(textField_1.getText());
				fNum2 = Float.parseFloat(textField_2.getText());
				output = op.calculate(fNum1, fNum2, operationIndex);
				lblOutput.setText("Output is " + output);
				
			}
		});
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalculate.setBounds(24, 162, 117, 25);
		frmCalculator.getContentPane().add(btnCalculate);
		
		String options[] = {"ADD", "SUBTRACT", "MULTYPLY", "DIVIDE"}; 
		comboBoxOpr = new JComboBox<Object>(options);
		comboBoxOpr.setBounds(112, 105, 100, 24);
		frmCalculator.getContentPane().add(comboBoxOpr);
		
		lblOperation = new JLabel("Operation:");
		lblOperation.setBounds(24, 110, 90, 15);
		frmCalculator.getContentPane().add(lblOperation);
		
		lblOutput = new JLabel("");
		lblOutput.setBounds(192, 167, 190, 15);
		frmCalculator.getContentPane().add(lblOutput);
		
		errLabel1 = new JLabel("");
		errLabel1.setBounds(255, 27, 210, 15);
		frmCalculator.getContentPane().add(errLabel1);
		
		errLabel2 = new JLabel("");
		errLabel2.setBounds(255, 72, 210, 15);
		frmCalculator.getContentPane().add(errLabel2);
		
	}
	
	protected Boolean field_validate(JTextField textField, JLabel errLabel) {
		Boolean output = true;
		String text = textField.getText();
		Pattern pattern = Pattern.compile("[0-9.]+");
		if (text != "" && pattern.matcher(text).matches()) {
			errLabel.setText("");
			return output;
		}
		output = false;
		errLabel.setText("Numbers only allowed.");
//		System.out.println(text + "-" + pattern.matcher(text).matches());
		return output;
	}
}
