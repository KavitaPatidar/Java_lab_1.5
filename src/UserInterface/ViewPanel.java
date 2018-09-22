/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.Person;

/**
 *
 * @author Kavita
 */
public class ViewPanel extends javax.swing.JPanel {

    private Person person;
    
    /**
     * Creates new form ViewPanel
     */
    public ViewPanel(Person person) {
        this.person = person;
        initComponents();
        displayData();
    }

    private void displayData(){
        firstNameTextField.setText(person.getFirstName());
        lastNameTextField.setText(person.getLastName());
        dobTextField.setText(person.getDob());
        streetAdTextField.setText(person.getStreetAddress());
        
        
        strt1LWATextField.setText(person.getWorkAddress().getStreetLine1());
        strt2LWATextField.setText(person.getWorkAddress().getStreetLine2());
        cityWATextField.setText(person.getWorkAddress().getCity());
        countryWATextField.setText(person.getWorkAddress().getCountry());
        stateWATextField.setText(person.getWorkAddress().getState());
        zipCWATextField.setText(person.getWorkAddress().getZipCode());
        
        strtL1LATextField.setText(person.getLocalAddress().getStreetLine1());
        strt2LLATextField.setText(person.getLocalAddress().getStreetLine2());
        cityLATextField8.setText(person.getLocalAddress().getCity());
        countryLATextField.setText(person.getLocalAddress().getCountry());
        stateLATextField.setText(person.getLocalAddress().getState());
        zipCLATextField.setText(person.getLocalAddress().getZipCode());
        
        strtL1HATextField.setText(person.getHomeAddress().getStreetLine1());
        strtL2HATextField.setText(person.getHomeAddress().getStreetLine2());
        cityHATextField.setText(person.getHomeAddress().getCity());
        countryHATextField.setText(person.getHomeAddress().getCountry());
        stateHATextField.setText(person.getHomeAddress().getState());
        zipCodeHATextField.setText(person.getHomeAddress().getZipCode());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personProfile = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastName = new javax.swing.JLabel();
        streetAd = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        streetAdTextField = new javax.swing.JTextField();
        dob = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        workAd = new javax.swing.JLabel();
        strtL1WA = new javax.swing.JLabel();
        strt1LWATextField = new javax.swing.JTextField();
        strtL2WA = new javax.swing.JLabel();
        cityWA = new javax.swing.JLabel();
        stateWA = new javax.swing.JLabel();
        zipCodeWA = new javax.swing.JLabel();
        countryWA = new javax.swing.JLabel();
        strt2LWATextField = new javax.swing.JTextField();
        cityWATextField = new javax.swing.JTextField();
        stateWATextField = new javax.swing.JTextField();
        zipCWATextField = new javax.swing.JTextField();
        countryWATextField = new javax.swing.JTextField();
        localAD = new javax.swing.JLabel();
        strtL1LA = new javax.swing.JLabel();
        strtL1LATextField = new javax.swing.JTextField();
        strtL2LA = new javax.swing.JLabel();
        strt2LLATextField = new javax.swing.JTextField();
        cityLA = new javax.swing.JLabel();
        cityLATextField8 = new javax.swing.JTextField();
        stateLA = new javax.swing.JLabel();
        stateLATextField = new javax.swing.JTextField();
        zipCodeLA = new javax.swing.JLabel();
        zipCLATextField = new javax.swing.JTextField();
        countryLA = new javax.swing.JLabel();
        countryLATextField = new javax.swing.JTextField();
        homeAd = new javax.swing.JLabel();
        strtL1HA = new javax.swing.JLabel();
        strtL1HATextField = new javax.swing.JTextField();
        strtL2HA = new javax.swing.JLabel();
        strtL2HATextField = new javax.swing.JTextField();
        cityHA = new javax.swing.JLabel();
        cityHATextField = new javax.swing.JTextField();
        stateHA = new javax.swing.JLabel();
        stateHATextField = new javax.swing.JTextField();
        zipCodeHA = new javax.swing.JLabel();
        zipCodeHATextField = new javax.swing.JTextField();
        countryHA = new javax.swing.JLabel();
        countryHATextField = new javax.swing.JTextField();

        personProfile.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        personProfile.setText("View Person Profile");

        firstName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        firstName.setText("First Name");

        lastName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lastName.setText("Last Name");

        streetAd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        streetAd.setText("Street Adderess");

        firstNameTextField.setEditable(false);

        lastNameTextField.setEditable(false);

        streetAdTextField.setEditable(false);

        dob.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dob.setText("DOB (YYYY/MM/DD)");

        dobTextField.setEditable(false);

        workAd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        workAd.setText("Work Address");

        strtL1WA.setText("Street Line 1");

        strt1LWATextField.setEditable(false);

        strtL2WA.setText("Street Line 2");

        cityWA.setText("City");

        stateWA.setText("State");

        zipCodeWA.setText("Zip Code");

        countryWA.setText("Country");

        strt2LWATextField.setEditable(false);

        cityWATextField.setEditable(false);

        stateWATextField.setEditable(false);

        zipCWATextField.setEditable(false);

        countryWATextField.setEditable(false);

        localAD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        localAD.setText("Local Address");

        strtL1LA.setText("Street Line 1");

        strtL1LATextField.setEditable(false);

        strtL2LA.setText("Street Line 2");

        strt2LLATextField.setEditable(false);

        cityLA.setText("City");

        cityLATextField8.setEditable(false);

        stateLA.setText("State");

        stateLATextField.setEditable(false);

        zipCodeLA.setText("Zip Code");

        zipCLATextField.setEditable(false);

        countryLA.setText("Country");

        countryLATextField.setEditable(false);

        homeAd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        homeAd.setText("Home Address");

        strtL1HA.setText("Street Line 1");

        strtL1HATextField.setEditable(false);

        strtL2HA.setText("Street Line 2");

        strtL2HATextField.setEditable(false);

        cityHA.setText("City");

        cityHATextField.setEditable(false);

        stateHA.setText("State");

        stateHATextField.setEditable(false);

        zipCodeHA.setText("Zip Code");

        zipCodeHATextField.setEditable(false);

        countryHA.setText("Country");

        countryHATextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName)
                            .addComponent(workAd))
                        .addGap(61, 61, 61)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstName)
                        .addGap(80, 80, 80)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(dob))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(streetAd)
                                .addGap(48, 48, 48))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strtL1WA)
                                    .addComponent(strtL2WA)
                                    .addComponent(cityWA)
                                    .addComponent(stateWA)
                                    .addComponent(zipCodeWA)
                                    .addComponent(countryWA))
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetAdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(strt1LWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(strt2LWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stateWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipCWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(countryWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(localAD)
                                        .addGap(252, 252, 252))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(strtL1LA)
                                            .addComponent(strtL2LA)
                                            .addComponent(cityLA)
                                            .addComponent(stateLA)
                                            .addComponent(zipCodeLA)
                                            .addComponent(countryLA))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(strtL1LATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(strt2LLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cityLATextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stateLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zipCLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(countryLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeAd)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strtL1HA)
                            .addComponent(strtL2HA)
                            .addComponent(cityHA)
                            .addComponent(stateHA)
                            .addComponent(zipCodeHA)
                            .addComponent(countryHA))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(strtL1HATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strtL2HATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCodeHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(personProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(personProfile)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(streetAdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(streetAd))
                        .addGap(42, 42, 42)
                        .addComponent(workAd)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL1WA)
                            .addComponent(strt1LWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL2WA)
                            .addComponent(strt2LWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityWA)
                            .addComponent(cityWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stateWA)
                            .addComponent(stateWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeWA)
                            .addComponent(zipCWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryWA)
                            .addComponent(countryWATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(localAD)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL1LA)
                            .addComponent(strtL1LATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL2LA)
                            .addComponent(strt2LLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityLA)
                            .addComponent(cityLATextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stateLA)
                            .addComponent(stateLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeLA)
                            .addComponent(zipCLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryLA)
                            .addComponent(countryLATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeAd)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL1HA)
                            .addComponent(strtL1HATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(strtL2HA)
                            .addComponent(strtL2HATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityHA)
                            .addComponent(cityHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stateHA)
                            .addComponent(stateHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeHA)
                            .addComponent(zipCodeHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryHA)
                            .addComponent(countryHATextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cityHA;
    private javax.swing.JTextField cityHATextField;
    private javax.swing.JLabel cityLA;
    private javax.swing.JTextField cityLATextField8;
    private javax.swing.JLabel cityWA;
    private javax.swing.JTextField cityWATextField;
    private javax.swing.JLabel countryHA;
    private javax.swing.JTextField countryHATextField;
    private javax.swing.JLabel countryLA;
    private javax.swing.JTextField countryLATextField;
    private javax.swing.JLabel countryWA;
    private javax.swing.JTextField countryWATextField;
    private javax.swing.JLabel dob;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel homeAd;
    private javax.swing.JLabel lastName;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel localAD;
    private javax.swing.JLabel personProfile;
    private javax.swing.JLabel stateHA;
    private javax.swing.JTextField stateHATextField;
    private javax.swing.JLabel stateLA;
    private javax.swing.JTextField stateLATextField;
    private javax.swing.JLabel stateWA;
    private javax.swing.JTextField stateWATextField;
    private javax.swing.JLabel streetAd;
    private javax.swing.JTextField streetAdTextField;
    private javax.swing.JTextField strt1LWATextField;
    private javax.swing.JTextField strt2LLATextField;
    private javax.swing.JTextField strt2LWATextField;
    private javax.swing.JLabel strtL1HA;
    private javax.swing.JTextField strtL1HATextField;
    private javax.swing.JLabel strtL1LA;
    private javax.swing.JTextField strtL1LATextField;
    private javax.swing.JLabel strtL1WA;
    private javax.swing.JLabel strtL2HA;
    private javax.swing.JTextField strtL2HATextField;
    private javax.swing.JLabel strtL2LA;
    private javax.swing.JLabel strtL2WA;
    private javax.swing.JLabel workAd;
    private javax.swing.JTextField zipCLATextField;
    private javax.swing.JTextField zipCWATextField;
    private javax.swing.JLabel zipCodeHA;
    private javax.swing.JTextField zipCodeHATextField;
    private javax.swing.JLabel zipCodeLA;
    private javax.swing.JLabel zipCodeWA;
    // End of variables declaration//GEN-END:variables
}
