package com.mariachrisochoou.lab;
import java.util.ArrayList;

/** This is a class representing the management of the sponsors
 * in a list. It does all the CRUD stuff.
 * 
 * @author mariachrisochoou
 */
public class SponsorsManagement {

    private ArrayList<Sponsor> sponsorList;

    public SponsorsManagement() {
        sponsorList = new ArrayList<>();
        addListSponsors();
    }


    public void addListSponsors() {
        Sponsor sp1 = new Sponsor(10001,"AB Vasilopoulos", "Supermarket", "2101231234", "ab@gmail.com", "Marousi");
        Sponsor sp2 = new Sponsor(10002,"Nike", "Footwear", "2101231245", "nike@gmail.com", "Athens");
        Sponsor sp3 = new Sponsor(10003,"Agrino", "Food", "2101231256", "agrino@gmail.com", "Patras");
        Sponsor sp4 = new Sponsor(10004,"Aueb", "Education", "2102231256", "aueb@gmail.com", "Athens");
        sponsorList.add(sp1);
        sponsorList.add(sp2);
        sponsorList.add(sp3);
        sponsorList.add(sp4);

    }

    public void addSponsor(int ID, String name, String industry, String number, String email, String address) {
        sponsorList.add(new Sponsor(ID, name, industry, number, email, address));
    }

    public void showSponsors() {
        for (Sponsor sponsor: sponsorList) {
            System.out.println(sponsor.toString());
            System.out.println("-------------------------------");
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