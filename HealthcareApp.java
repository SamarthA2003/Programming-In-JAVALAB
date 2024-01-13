import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HealthcareApp extends JFrame {
    private JTextField patientNameTextField;
    private JTextField patientAgeTextField;
    private JTextField patientGenderTextField;
    private JTextField patientHistoryTextField; 
    private JComboBox<String> bloodTypeComboBox;

    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;

    public HealthcareApp() {
        setTitle("Healthcare Application");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel nameLabel = new JLabel("Patient Name:");
        patientNameTextField = new JTextField(20);
        
        JLabel ageLabel = new JLabel("Patient Age:");
        patientAgeTextField = new JTextField(10);

        JLabel genderLabel = new JLabel("Patient Gender:");

        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
      
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
     
        JPanel genderPanel = new JPanel(new GridLayout()); 
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        
        JLabel bloodTypeLabel = new JLabel("Blood Type:");
        String[] bloodTypes = {"Enter Blood Group", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
        bloodTypeComboBox = new JComboBox<>(bloodTypes);

        JLabel historyLabel = new JLabel("Patient History:");
        patientHistoryTextField = new JTextField(30); 

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");

        setLayout(new GridLayout(8, 2, 5, 15)); 
        add(nameLabel);
        add(patientNameTextField);
        add(ageLabel);
        add(patientAgeTextField);
        add(genderLabel);
        add(genderPanel);
        add(bloodTypeLabel);
        add(bloodTypeComboBox);
        add(historyLabel);
        add(patientHistoryTextField);
        add(new JLabel()); 
        add(new JLabel());
        add(new JLabel());
        add(new JLabel());
        add(resetButton);
        add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = patientNameTextField.getText();
                String age = patientAgeTextField.getText();
                String gender = getSelectedGender();
                String bloodType = (String) bloodTypeComboBox.getSelectedItem();
                String history = patientHistoryTextField.getText();
                String result = "Patient Name: " + name + "\nPatient Age: " + age + "\nPatient Gender: " +
                        gender + "\nBlood Type: " + bloodType + "\nPatient History: " + history;

                JOptionPane.showMessageDialog(HealthcareApp.this, result, "Patient Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                patientNameTextField.setText("");
                patientAgeTextField.setText("");
                clearGenderSelection();
                bloodTypeComboBox.setSelectedIndex(0);
                patientHistoryTextField.setText("");
            }
        });
    }

    private String getSelectedGender() {
        if (maleRadioButton.isSelected()) {
            return "Male";
        } else if (femaleRadioButton.isSelected()) {
            return "Female";
        } else {
            return "";
        }
    }

    private void clearGenderSelection() {
        maleRadioButton.setSelected(true);
        femaleRadioButton.setSelected(false);
    }

    public static void main(String[] args) {
                new HealthcareApp().setVisible(true);
            }
        }