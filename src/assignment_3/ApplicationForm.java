package assignment_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ApplicationForm {

	private JFrame frame;
	private JPanel personalInfoPanel;
	private JLabel nameLabel;
	private JLabel gpaLabel;
	private JLabel degressLabel;
	private JLabel prevUniLabel;
	private JLabel emailLabel;
	private JLabel bdayLabel;
	private JTextArea nameText;
	private JTextArea bdayText;
	private JTextArea emailText;
	private JTextArea degreeText;
	private JTextArea prevUniText;
	private JTextArea gpaText;
	private JLabel applicationFormLabel;
	private JLabel addyLabel;
	private JTextArea addyText;
	private JPanel personalStatementPanel;
	private JLabel personalStatementLabel;
	private JTextArea personalStatementText;
	private JButton submitBtn;
	private JLabel skkuImage;
	private JLabel characterLabel;
	private JLabel phoneLabel;
	private JTextArea phoneText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm window = new ApplicationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 815, 798);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// add the characters on each side
		characterLabel = new JLabel("");
		characterLabel.setIcon(
				new ImageIcon(ApplicationForm.class.getResource("/images/IMG_2402-removebg-preview_resized.png")));
		characterLabel.setBounds(-33, 518, 196, 246);
		frame.getContentPane().add(characterLabel);

		// add image of skku on the left and right
		skkuImage = new JLabel("");
		skkuImage.setIcon(new ImageIcon(ApplicationForm.class.getResource("/images/IMG_0830.jpg")));
		skkuImage.setBounds(-77, 0, 387, 800);
		frame.getContentPane().add(skkuImage);

		// add form title at the top
		applicationFormLabel = new JLabel("");
		applicationFormLabel
				.setIcon(new ImageIcon(ApplicationForm.class.getResource("/images/title_label-removebg-preview.png")));
		applicationFormLabel.setBounds(340, 0, 422, 88);
		frame.getContentPane().add(applicationFormLabel);

		// stores the fields related to personal information
		personalInfoPanel = new JPanel();
		personalInfoPanel.setBounds(350, 88, 436, 253);
		frame.getContentPane().add(personalInfoPanel);
		personalInfoPanel.setLayout(new GridLayout(0, 2, 0, 15));

		// create applicant name label and text area
		nameLabel = new JLabel("Applicant Name:  ");
		nameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		nameLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(nameLabel);

		nameText = new JTextArea();
		personalInfoPanel.add(nameText);

		// create birth date label and text area
		bdayLabel = new JLabel("Birth Date:  ");
		bdayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		bdayLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(bdayLabel);

		bdayText = new JTextArea();
		personalInfoPanel.add(bdayText);

		// create email label and text area
		emailLabel = new JLabel("Email:  ");
		emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(emailLabel);

		emailText = new JTextArea();
		personalInfoPanel.add(emailText);

		// create phone number label and text area
		phoneLabel = new JLabel("Phone Number:  ");
		phoneLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		phoneLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(phoneLabel);

		phoneText = new JTextArea();
		personalInfoPanel.add(phoneText);

		// create degree label and text area
		degressLabel = new JLabel("Degree:  ");
		degressLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		degressLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(degressLabel);

		degreeText = new JTextArea();
		personalInfoPanel.add(degreeText);

		// create previously attended university label and text area
		prevUniLabel = new JLabel("Attended University (for Graduates):  ");
		prevUniLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		prevUniLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(prevUniLabel);

		prevUniText = new JTextArea();
		personalInfoPanel.add(prevUniText);

		// create GPA label and text area
		gpaLabel = new JLabel("GPA (for Graduates):  ");
		gpaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		gpaLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(gpaLabel);

		gpaText = new JTextArea();
		personalInfoPanel.add(gpaText);

		// create home address label and text area
		addyLabel = new JLabel("Home Address:  ");
		addyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		addyLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(addyLabel);

		addyText = new JTextArea();
		personalInfoPanel.add(addyText);

		// create a personal statement panel
		personalStatementPanel = new JPanel();
		personalStatementPanel.setBounds(301, 363, 485, 352);
		frame.getContentPane().add(personalStatementPanel);
		personalStatementPanel.setLayout(null);

		personalStatementLabel = new JLabel("Personal Statement");
		personalStatementLabel.setFont(new Font("PingFang TC", Font.PLAIN, 13));
		personalStatementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		personalStatementLabel.setBounds(169, 6, 205, 33);
		personalStatementPanel.add(personalStatementLabel);

		personalStatementText = new JTextArea();
		personalStatementText.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		personalStatementText.setText(" At least 100 words");
		personalStatementText.setBounds(46, 34, 439, 300);
		personalStatementPanel.add(personalStatementText);

		// create submit button
		submitBtn = new JButton("Submit Application");
		submitBtn.addActionListener(new ActionListener() {
			String applicantName = nameText.getText();
			String birthDate = bdayText.getText();
			String email = emailText.getText();
			String phoneNum = phoneText.getText();
			String degree = degreeText.getText();
			String prevUni = prevUniText.getText();
			String GPA = gpaText.getText();
			String homeAddy = addyText.getText();
			String personalStatement = personalStatementText.getText();

			public void actionPerformed(ActionEvent arg0) {
				try {
					if (isValidName(applicantName) && isValidBday(birthDate) && isValidEmail(email)
							&& isValidPhoneNumber(phoneNum) && isValidDegree(degree) && isValidAddy(homeAddy)
							&& isValidPersonalStatement(personalStatement)) {

						if (isValidGPA(GPA, degree) && isValidPrevUni(prevUni, degree)) {
							JOptionPane.showMessageDialog(null, "Successfully Submitted", "Success!", JOptionPane.INFORMATION_MESSAGE);
						} else {
							throw new Exception();
						}

					} else {
						throw new Exception();
					}

				} catch (Exception e) {

				}
			}
		});
		submitBtn.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		submitBtn.setBounds(473, 727, 164, 29);
		frame.getContentPane().add(submitBtn);

	}

	// checks if the name is valid
	public boolean isValidName(String name) {
		return true;
	}

	// checks if the bday is valid
	public boolean isValidBday(String bday) {
		return true;
	}

	// checks if the email is valid
	public boolean isValidEmail(String email) {
		return true;
	}

	// checks if the phone number is valid
	public boolean isValidPhoneNumber(String phoneNum) {
		return true;
	}

	// checks if the degree is valid
	public boolean isValidDegree(String degree) {
		return true;
	}

	// checks if the previous university attended is valid according to the degree
	// selected
	public boolean isValidPrevUni(String prevUni, String degree) {
		return true;
	}

	// checks if the GPA is valid according to the degree selected
	public boolean isValidGPA(String GPA, String degree) {
		return true;
	}

	// checks if the home address is valid
	public boolean isValidAddy(String addy) {
		return true;
	}

	// checks if the personal statement is valid
	public boolean isValidPersonalStatement(String pStatement) {
		return true;
	}
}
