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

    public void addSponsor(int ID, String name, String industry, int number, String email, String address) {
        sponsorList.add(new Sponsor(ID, name, industry, number, email, address));
    }

    public void showSponsors() {
        for (Sponsor sponsor: sponsorList) {
            System.out.println(sponsor.toString());
        }
    }

    public void deleteSponsor(int ID) {

        Sponsor object = null;
        for (Sponsor sponsor: sponsorList) {
            if (sponsor.getID() == ID) {
                object = sponsor;
                sponsorList.remove(sponsor);
            }
        }
        // sponsorList.remove(sponsorList.indexOf(object));
    }

    public void updateSponsor(int ID, int number, String email) {
        for (Sponsor sponsor: sponsorList) {
            if (sponsor.getID() == ID) {
                sponsor.setNumber(number);
                sponsor.setEmail(email);
            }
        }
        
    }
}