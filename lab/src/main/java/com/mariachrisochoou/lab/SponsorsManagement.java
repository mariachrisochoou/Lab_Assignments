package com.mariachrisochoou.lab;
import java.util.ArrayList;

/** This is a class representing the management of the sponsors
 * in a list. It does all the CRUD stuff.
 * 
 * @author mariachrisochoou
 */
public class SponsorsManagement {

    private ArrayList<Sponsor> sponsorList;

    // Constructor: Management of the List of Sponsors
    public SponsorsManagement() {
        sponsorList = new ArrayList<>();
    }

    public void addSponsor(int ID, String name, String industry, String number, String email, String address) {
        sponsorList.add(new Sponsor(ID, name, industry, number, email, address));
    }

    public void showSponsors() {
        for (Sponsor sponsor: sponsorList) {
            System.out.println(sponsor.toString());
        }
    }

    public void deleteSponsor(int ID) {

        for (Sponsor sponsor: sponsorList) {
            if (ID == sponsor.getID()) {
                sponsorList.remove(sponsor);
                return;
            }
        }
    }

    public void updateSponsor(int ID, String industry, String number, String email, String address) {
        for (Sponsor sponsor: sponsorList) {
            if (sponsor.getID() == ID) {
                sponsor.setIndustry(industry);
                sponsor.setNumber(number);
                sponsor.setEmail(email);
                sponsor.setAddress(address);
            }
        }
        
    }
}