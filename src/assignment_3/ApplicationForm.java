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
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

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
	private JPanel communicatonPanel;
	private JLabel communicationLabel;
	private JRadioButton emailButton;
	private JRadioButton mobileButton;
	private JRadioButton noneButton;
	
	//flag to keep track if it is the applicant's first time clicking the personal statement box
	private boolean firstClick = true; 
	private JLabel majorLabel;
	private JComboBox comboBox;
	private JLabel addyLabel_1;
	private JTextArea addyText_1;

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
		frame.setBounds(100, 100, 815, 821);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// add the characters on each side
		characterLabel = new JLabel("");
		characterLabel.setIcon(
				new ImageIcon(ApplicationForm.class.getResource("/images/IMG_2402-removebg-preview_resized.png")));
		characterLabel.setBounds(-32, 541, 196, 246);
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
		personalInfoPanel.setBounds(350, 88, 436, 295);
		frame.getContentPane().add(personalInfoPanel);
		personalInfoPanel.setLayout(new GridLayout(0, 2, 0, 10));

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
		
		majorLabel = new JLabel("Intended Major:  ");
		majorLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		majorLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(majorLabel);
		
		comboBox = new JComboBox();
		personalInfoPanel.add(comboBox);

		// create previously attended university label and text area
		prevUniLabel = new JLabel("Attended University (for Graduates):  ");
		prevUniLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		prevUniLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(prevUniLabel);

		prevUniText = new JTextArea();
		prevUniText.setFont(new Font("PingFang TC", Font.PLAIN, 12));
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
		addyText.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(addyText);
		
		addyLabel_1 = new JLabel("Home Address:  ");
		addyLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		addyLabel_1.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(addyLabel_1);
		
		addyText_1 = new JTextArea();
		addyText_1.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		personalInfoPanel.add(addyText_1);

		// create a personal statement panel
		personalStatementPanel = new JPanel();
		personalStatementPanel.setBounds(322, 400, 464, 305);
		frame.getContentPane().add(personalStatementPanel);
		personalStatementPanel.setLayout(null);

		personalStatementLabel = new JLabel("Personal Statement");
		personalStatementLabel.setFont(new Font("PingFang TC", Font.PLAIN, 13));
		personalStatementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		personalStatementLabel.setBounds(136, 6, 205, 33);
		personalStatementPanel.add(personalStatementLabel);

		personalStatementText = new JTextArea();
		personalStatementText.setLineWrap(true);
		personalStatementText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// if it is the applicant's first time clicking on the personal statement text area,
				// clear out the "At least 100 words" message
				if(firstClick) {
					personalStatementText.setText("");
					firstClick = false;
					// change font to match the rest of the GUI
					personalStatementText.setFont(new Font("PingFang TC", Font.PLAIN, 12));
				}
			}
		});
		personalStatementText.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		personalStatementText.setText(" At least 100 words");
		personalStatementText.setBounds(31, 33, 433, 259);
		personalStatementPanel.add(personalStatementText);

		// create submit button
		submitBtn = new JButton("Submit Application");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String applicantName = nameText.getText();
				String birthDate = bdayText.getText();
				String email = emailText.getText();
				String phoneNum = phoneText.getText();
				String degree = degreeText.getText();
				String prevUni = prevUniText.getText();
				String GPA = gpaText.getText();
				String homeAddy = addyText.getText();
				String personalStatement = personalStatementText.getText();
				int errorCount = 1;

				try {
					if (isValidName(applicantName) && isValidBday(birthDate) && isValidEmail(email)
							&& isValidPhoneNumber(phoneNum) && isValidDegree(degree) && isValidAddy(homeAddy)
							&& isValidPersonalStatement(personalStatement) && isValidCommunicationMode()) {

						if (isValidGPA(GPA, degree) && isValidPrevUni(prevUni, degree)) {
							JOptionPane.showMessageDialog(null, "Successfully Submitted", "Success!",
									JOptionPane.INFORMATION_MESSAGE);
							
							//reset all fields
							nameText.setText("");
							bdayText.setText("");
							emailText.setText("");
							phoneText.setText("");
							degreeText.setText("");
							prevUniText.setText("");
							gpaText.setText("");
							addyText.setText("");
							personalStatementText.setFont(new Font("Times New Roman", Font.ITALIC, 12));
							personalStatementText.setText(" At least 100 words");
							firstClick = true;
							emailButton.setSelected(false);
							mobileButton.setSelected(false);
							noneButton.setSelected(false);
							
						} else {
							throw new Exception();
						}
					} else {
						throw new Exception();
					}

				} catch (Exception e) {
					String errorMessage = "";

					// if an error exists in the name field
					if (!isValidName(applicantName)) {
						errorMessage += errorCount + getNameErrorMessage(applicantName);
						errorCount++;
					}
					// if an error exists in the birth date field
					if (!isValidBday(birthDate)) {
						errorMessage += errorCount + getBdayErrorMessage(birthDate);
						errorCount++;
					}
					// if an error exists in the email field
					if (!isValidEmail(email)) {
						errorMessage += errorCount + getEmailErrorMessage(email);
						errorCount++;
					}
					// if an error exists in the phone number field
					if (!isValidPhoneNumber(phoneNum)) {
						errorMessage += errorCount + getPhoneNumErrorMessage(phoneNum);
						errorCount++;
					}
					// if an error exists in the degree field
					if (!isValidDegree(degree)) {
						errorMessage += errorCount + getDegreeErrorMessage(degree);
						errorCount++;
					} else {
						// if an error exists in the previous university field
						if (!isValidPrevUni(prevUni, degree)) {
							errorMessage += errorCount + getPrevUniErrorMessage(prevUni, degree);
							errorCount++;
						}
						// if an error exists in the GPA field
						if (!isValidGPA(GPA, degree)) {
							errorMessage += errorCount + getGPAErrorMessage(GPA, degree);
							errorCount++;
						}
					}
					// if error exists in the home address field
					if (!isValidAddy(homeAddy)) {
						errorMessage += errorCount + getAddyErrorMessage(homeAddy);
						errorCount++;
					}
					// if error exists in the personal statement field
					if (!isValidPersonalStatement(personalStatement)) {
						errorMessage += errorCount + getPersonalStatementErrorMessage(personalStatement);
						errorCount++;
					}
					// if error exists in the preferred mode of communication field
					if(!isValidCommunicationMode()){
						errorMessage += errorCount + getValidCommModeMessage();
						errorCount++;
					}
					// display the error message
					JOptionPane.showMessageDialog(null, errorMessage, "You have the following problems",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		submitBtn.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		submitBtn.setBounds(474, 747, 164, 29);
		frame.getContentPane().add(submitBtn);

		communicatonPanel = new JPanel();
		communicatonPanel.setBounds(350, 706, 436, 40);
		frame.getContentPane().add(communicatonPanel);

		communicationLabel = new JLabel("Preferred Mode of Communication:  ");
		communicationLabel.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		communicatonPanel.add(communicationLabel);

		emailButton = new JRadioButton("Email");
		emailButton.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		communicatonPanel.add(emailButton);

		mobileButton = new JRadioButton("Mobile");
		mobileButton.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		communicatonPanel.add(mobileButton);

		noneButton = new JRadioButton("None");
		noneButton.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		communicatonPanel.add(noneButton);

	}

	// checks if the name is valid
	public boolean isValidName(String name) {
		// the regex is alphabets + any white space + alphabets + checks if line end
		// follows
		// if the name follows the regex pattern, return true
		if (Pattern.matches("^[a-zA-Z]+\\s[a-zA-Z]+$", name)) {
			return true;
		} else {
			return false;
		}
	}

	// get the error message for when the name field is invalid
	public String getNameErrorMessage(String name) {
		if (name.equals("")) {
			// this is not working for some reason
			return ". You forgot to fill the name text field. Please fill your name.\n";
		} else if (name.split("\\s+").length > 2) {
			return ". You entered more than two names. Please enter your first and last name.\n";
		} else {
			return ". You forgot to write your name or surname.\n";
		}
	}

	// checks if the bday is valid
	public boolean isValidBday(String bday) {
		// regex is two digits/two digits/four digits
		if (Pattern.matches("^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]$", bday)) {
			String[] bdayArray = bday.split("/");
			int month = Integer.parseInt(bdayArray[0]);
			int day = Integer.parseInt(bdayArray[1]);
			int year = Integer.parseInt(bdayArray[2]);

			// checks if the month is between 1 and 12, day is between 1 and 31, and year is
			// between 1 and 2023
			if (month > 0 && month < 13 && day > 0 && day < 32 && year > 1899 && year < 2024) {
				return true;
			}
			return false;
		} else {
			return false;
		}
	}

	// get the error message for when the birth date field is invalid
	public String getBdayErrorMessage(String bday) {
		if (Pattern.matches("^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]$", bday)) {
			String[] bdayArray = bday.split("/");
			int month = Integer.parseInt(bdayArray[0]);
			int day = Integer.parseInt(bdayArray[1]);
			int year = Integer.parseInt(bdayArray[2]);

			// if the date is not within the date range of 01/01/1900-01/01/2023, return
			// error message
			if (!(month > 0 && month < 13 && day > 0 && day < 32 && year > 1899 && year < 2024)) {
				return ". Birth date must be a valid date between 01/01/1900-01/01/2023.\n";
			}
		} else {
			return ". Birth date must be in 'mm/dd/year' format.\n";
		}
		return "";
	}

	// checks if the email is valid
	public boolean isValidEmail(String email) {
		// regex format is (combination of alphabet, numebers, and .) + @ + (alphabets)
		// + . + (alphabets)
		if (Pattern.matches("^[A-Za-z0-9.]+@[A-Za-z]+.[A-Za-z]+$", email)) {
			return true;
		} else {
			return false;
		}
	}

	// get the error message for when the email field is invalid
	public String getEmailErrorMessage(String email) {
		return ". Email must be in example@some.some\n";
	}

	// checks if the phone number is valid
	public boolean isValidPhoneNumber(String phoneNum) {
		// regex format is xx xxxx-xxxx (ex: 10 1234-1234)
		if (Pattern.matches("^[0-9]{2}\\s[0-9]{4}-[0-9]{4}$", phoneNum)) {
			return true;
		} else {
			return false;
		}
	}

	// get the error message for when the phone number field is invalid
	public String getPhoneNumErrorMessage(String phoneNum) {
		return ". Phone number must be in xx xxxx-xxxx format (ex: 10 1234-5678).\n";
	}

	// checks if the degree is valid
	public boolean isValidDegree(String degree) {
		// if entered degree is either bachelor or phd, the input is valid
		if (degree.equalsIgnoreCase("bachelor") || degree.equalsIgnoreCase("phd")) {
			return true;
		} else {
			return false;
		}
	}

	// get the error message for when the degree field is invalid
	public String getDegreeErrorMessage(String degree) {
		return ". Degree must be either bachelor or PhD.\n";
	}

	// checks if the previous university attended is valid according to the degree
	// selected
	public boolean isValidPrevUni(String prevUni, String degree) {
		if (degree.equalsIgnoreCase("phd")) {
			// regex checks if previously attended university only contains alphabets and
			// white spaces
			if (Pattern.matches("^[a-zA-Z/\\s/]+$", prevUni)) {
				return true;
			} else {
				return false;
			}
		} else if (degree.equalsIgnoreCase("bachelor")) {
			// bachelor applicants do not need to enter their previously attended university
			if (prevUni.equals(""))
				return true;
			else
				return false;

		}
		return false;
	}

	// gets the error message when the previously attended university field is
	// invalid
	public String getPrevUniErrorMessage(String prevUni, String degree) {
		if (degree.equalsIgnoreCase("phd")) {
			if (prevUni.equals("")) {
				return ". For graduate students, previous university must be entered.\n";
			} else {
				return ". Enter a proper univeristy name.\n";
			}
		}
		// if bachelor applicant entered previous university
		else if (degree.equalsIgnoreCase("bachelor")) {
			if (!prevUni.equals("")) {
				return ". For bachelor students, previous university is not needed.\n";
			}
		}
		return "";
	}

	// checks if the GPA is valid according to the degree selected
	public boolean isValidGPA(String GPA, String degree) {
		if (degree.equalsIgnoreCase("phd")) {
			// if GPA only contains numbers and a decimal point and is between the range
			// [0.0. 4.5], return true
			if (Pattern.matches("^[0-9.]+$", GPA) && Double.parseDouble(GPA) >= 0.0 && Double.parseDouble(GPA) <= 4.5) {
				return true;
			} else {
				return false;
			}
		} else if (degree.equalsIgnoreCase("bachelor")) {
			// bachelor applicants do not need to enter their GPA
			if (GPA.equals(""))
				return true;
			else
				return false;

		}
		return false;
	}

	// gets the error message when the GPA field is invalid
	public String getGPAErrorMessage(String GPA, String degree) {
		if (degree.equalsIgnoreCase("phd")) {
			if (GPA.equals("")) {
				return ". For graduate students, GPA must be entered.\n";
			} else {
				return ". GPA must be a number between 0.0 and 4.5.\n";
			}
		}
		// if bachelor applicant entered GPA
		else if (degree.equalsIgnoreCase("bachelor")) {
			if (!GPA.equals("")) {
				return ". For bachelor students, GPA is not needed.\n";
			}
		}
		return "";
	}

	// checks if the home address is valid
	public boolean isValidAddy(String addy) {
		// address format should be street, city, country (all in alphabets
		if (Pattern.matches("^[\\w,]+\\s[\\w,]+\\s[\\w,]+$", addy)) {
			return true;
		} else {
			return false;
		}
	}

	// gets the error message when the home address field is invalid
	public String getAddyErrorMessage(String addy) {
		if (addy.equals("")) {
			return ". Home address must be entered.\n";
		} else {
			return ". Home address must be in 'street, city, country' format.\n";
		}
	}

	// checks if the personal statement is valid
	public boolean isValidPersonalStatement(String pStatement) {
		// if the number of words for the personal statement is greater than 100, return
		// true
		if (pStatement.split("\\s+").length >= 100) {
			return true;
		} else {
			return false;
		}
	}

	// gets the error message when the personal statement field is invalid
	public String getPersonalStatementErrorMessage(String pStatement) {
		return ". Personal statement must be at least 100 words.\n";
	}

	// checks if the preferred mode of communication buttons selections are valid
	public boolean isValidCommunicationMode() {
		// if no mode of communication is selected
		if (!emailButton.isSelected() && !mobileButton.isSelected() && !noneButton.isSelected()) {
			return false;
		}

		if (noneButton.isSelected()) {
			// if "none" is selected, email and mobile must be not selected to be a valid
			// mode of communication
			if (!emailButton.isSelected() && !mobileButton.isSelected())
				return true;
			else
				return false;
		} // if either email or mobile is selected and none is not selected, the mode of
			// communication is valid
		else {
			if (emailButton.isSelected() || mobileButton.isSelected())
				return true;
			else
				return false;
		}
	}

	// gets the error message when the preferred mode of communication buttons selections are invalid
	public String getValidCommModeMessage() {
		// if no mode of communication is selected
		if (!emailButton.isSelected() && !mobileButton.isSelected() && !noneButton.isSelected()) {
			return ". A preferred mode of communication must be chosen.\n";
		}

		if (noneButton.isSelected()) {
			// if "none" is selected, email and mobile must be not selected to be a valid
			// mode of communication
			if (emailButton.isSelected() || mobileButton.isSelected())
				return ". Uncompatible options for preferred mode of communication were chosen.\n";
		} 
		return "";
	}
}
