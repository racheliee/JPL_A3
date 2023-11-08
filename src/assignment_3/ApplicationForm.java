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
import java.util.Arrays;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.util.regex.*;

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
		personalStatementPanel.setBounds(322, 373, 464, 352);
		frame.getContentPane().add(personalStatementPanel);
		personalStatementPanel.setLayout(null);

		personalStatementLabel = new JLabel("Personal Statement");
		personalStatementLabel.setFont(new Font("PingFang TC", Font.PLAIN, 13));
		personalStatementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		personalStatementLabel.setBounds(136, 6, 205, 33);
		personalStatementPanel.add(personalStatementLabel);

		personalStatementText = new JTextArea();
		personalStatementText.setFont(new Font("Times New Roman", Font.ITALIC, 12));
		personalStatementText.setText(" At least 100 words");
		personalStatementText.setBounds(31, 33, 433, 300);
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
					String errorMessage = "";
					// if an error exists in the name field
					if(!isValidName(applicantName)) {
						if(applicantName == null) {
							// this is not working for some reason
							errorMessage += errorCount + ". You forgot to fill the name text field. Please fill your name.\n";
							errorCount++;
						}
						else {
							errorMessage += errorCount + ". You forgot to write your name or surname.\n";
							errorCount++;
						}
					}
					// if an error exists in the birth date field
					if(!isValidBday(birthDate)) {
						errorMessage += errorCount + ". Birth date must be in 'mm/dd/year' format.\n";
						errorCount++;
					}
					
					// if an error exists in the email field
					if(!isValidEmail(email)) {
						errorMessage += errorCount + ". Email must be in email@domain.TLD\n";
						errorCount++;
					}
					
					// if an error exists in the phone number field
					if(!isValidPhoneNumber(phoneNum)) {
						errorMessage += errorCount + ". Phone number must be in 'xx-xxxx-xxxx' format.\n";
						errorCount++;
					}

					// if an error exists in the degree field
					if(!isValidDegree(degree)) {
						errorMessage += errorCount + ". Degree must be either 'Bachelor' or 'Graduate'.\n";
						errorCount++;
					}

					// if an error exists in the previous university field
					if(!isValidPrevUni(prevUni, degree)) {
						if(degree.equalsIgnoreCase("phd")) {
							if(prevUni == ""){
								errorMessage += errorCount + ". For graduate students, previous university must be entered.\n";
								errorCount++;
							}else{
								errorMessage += errorCount + ". Enter a proper univeristy name.\n";
								errorCount++;
							}
						}
						// if bachelor applicant entered previous university
						else if(degree.equalsIgnoreCase("bachelor")){
							if(prevUni != ""){
								errorMessage += errorCount + ". For bachelor students, previous university is not needed.\n";
								errorCount++;
							}
						}
					}

					// if an error exists in the GPA field
					if(!isValidGPA(GPA, degree)) {
						if(degree.equalsIgnoreCase("phd")) {
							if(GPA == ""){
								errorMessage += errorCount + ". For graduate students, GPA must be entered.\n";
								errorCount++;
							}else{
								errorMessage += errorCount + ". GPA must be a number between 0.0 and 4.5.\n";
								errorCount++;
							}
						}
						// if bachelor applicant entered GPA 
						else if (degree.equalsIgnoreCase("bachelor")){
							if(GPA != ""){
								errorMessage += errorCount + ". For bachelor students, GPA is not needed.\n";
								errorCount++;
							}
						}
						
					}

					if(!isValidAddy(homeAddy)){
						if(homeAddy == ""){
							errorMessage += errorCount + ". Home address must be entered.\n";
							errorCount++;
						}else{
							errorMessage += errorCount + ". Home address must be in 'street, city, country' format.\n";
							errorCount++;
						}
					}

					if(!isValidPersonalStatement(personalStatement)){
						errorMessage += errorCount + ". Personal statement must be at least 100 words.\n";
						errorCount++;
					}

					JOptionPane.showMessageDialog(null, errorMessage, "You have the following problems", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		submitBtn.setFont(new Font("PingFang TC", Font.PLAIN, 12));
		submitBtn.setBounds(473, 727, 164, 29);
		frame.getContentPane().add(submitBtn);

	}

	// checks if the name is valid
	public boolean isValidName(String name) {
		// the regex is alphabets + any white space + alphabets + checks if line end follows
		// if the name follows the regex pattern, return true
		if (Pattern.matches("^[a-zA-Z]+\\s[a-zA-Z]+$", name)) {
			return true;
		} else {
			return false;
		}
	}

	// checks if the bday is valid
	public boolean isValidBday(String bday) {
		// regex is two digits/two digits/four digits
		if (Pattern.matches("^[0-9][0-9]/[0-9][0-9]/[0-9][0-9][0-9][0-9]$", bday)) {
			return true;
		}
		else {
			return false;
		}
	}

	// checks if the email is valid
	public boolean isValidEmail(String email) {
		if(Pattern.matches("^[\\w-\\.]+@[\\w-]+\\.+[\\w-]", email)) {
			return true;
		}else {
			return false;
		}
	}

	// checks if the phone number is valid
	public boolean isValidPhoneNumber(String phoneNum) {
		//regex format is xx-xxxx-xxxx (ex: 10-1234-1234)
		if(Pattern.matches("^[0-9]{2}-[0-9]{4}-[0-9]{4}$", phoneNum)) {
			return true;
		}else {
			return false;
		}
	}

	// checks if the degree is valid
	public boolean isValidDegree(String degree) {
		// if entered degree is either bachelor or phd, the input is valid
		if(degree.equalsIgnoreCase("bachelor") || degree.equalsIgnoreCase("phd")){
			return true;
		}else {
			return false;
		}
	}

	// checks if the previous university attended is valid according to the degree
	// selected
	public boolean isValidPrevUni(String prevUni, String degree) {
		if(degree.equalsIgnoreCase("phd")) {
			//regex checks if previously attended university only contains alphabets and white spaces 
			if(Pattern.matches("^[a-zA-Z/\\s/]+$", prevUni)) {
				return true;
			}else {
				return false;
			}
		}else if (degree.equalsIgnoreCase("bachelor")) {
			// bachelor applicants do not need to enter their previously attended university
			if(prevUni == "") return true;
			else return false;
			
		}
		return false;
	}

	// checks if the GPA is valid according to the degree selected
	public boolean isValidGPA(String GPA, String degree) {
		if(degree.equalsIgnoreCase("phd")) {
			//if GPA only contains numbers and a decimal point and is between the range [0.0. 4.5], return true
			if(Pattern.matches("^[0-9.]+$", GPA) && Double.parseDouble(GPA) >= 0.0 && Double.parseDouble(GPA) <= 4.5) {
				return true;
			}else {
				return false;
			}
		}else if (degree.equalsIgnoreCase("bachelor")) {
			// bachelor applicants do not need to enter their GPA
			if(GPA == "") return true;
			else return false;
			
		}
		return false;
	}

	// checks if the home address is valid
	public boolean isValidAddy(String addy) {
		// address format should be street, city, country (all in alphabets
		if(Pattern.matches("^[\\w,]+\\s[\\w,]+\\s[\\w,]+$", addy)) {
			return true;
		}else {
			return false;
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
	
	//empty strings == "" doesn't work
	//issue with the email delimeter idk why
}
