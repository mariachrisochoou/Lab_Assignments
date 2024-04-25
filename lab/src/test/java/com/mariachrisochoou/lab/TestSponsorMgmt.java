package com.mariachrisochoou.lab;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;  

public class TestSponsorMgmt {

    private Sponsor sponsor;
    private ArrayList<Sponsor> list = new ArrayList<>();

    @Test
    public void testAdd() {
        int id = 123;
        String name = "Nike";
        String industry = "Shoes";
        String number = "210 123 4567";
        String email = "info@nike.com";
        String address = "Kifisias 168 Av.";
        sponsor = new Sponsor(id, name, industry, number, email, address);
        list.add(sponsor);
        assertEquals("Adding a new sponsor to the list", 1, list.size());

    }

    @Test 
    public void testUpdate() {
        int id = 123;
        String name = "Nike";
        String industry = "Shoes";
        String number = "210 123 4567";
        String email = "info@nike.com";
        String address = "Kifisias 168 Av.";
        sponsor = new Sponsor(id, name, industry, number, email, address);
        list.add(sponsor);

        id = 123;
        name = "Nike";
        industry = "Footwear";
        number = "691 234 5678";
        email = "support@nike.com";
        address = "Marousi";

        Sponsor sp2 = null;
        for (Sponsor sponsor:list) {
            if (sponsor.getID() == id) {
                sponsor.setIndustry(industry);
                sponsor.setNumber(number);
                sponsor.setEmail(email);
                sponsor.setAddress(address);
                sp2 = sponsor;
            }
        }

        assertEquals("Update of Industry", sp2.getIndustry(), industry);
        assertEquals("Update of Number", sp2.getNumber(), number);
        assertEquals("Update of Email", sp2.getEmail(), email);
        assertEquals("Update of Address", sp2.getAddress(), address);

    }

    @Test
    public void testShowSponsors() {
        int id = 123;
        String name = "Nike";
        String industry = "Shoes";
        String number = "210 123 4567";
        String email = "info@nike.com";
        String address = "Kifisias 168 Av.";
        sponsor = new Sponsor(id, name, industry, number, email, address);
        list.add(sponsor);

        String toString = "Company: " + name + "\nCompany ID:" + id + "\nBusiness Field: " + industry +
        "\nPhone number: " + number + "\nCorporate Email: " + email +
        "\nAddress: " + address;

        assertEquals("Show Sponsors Correctly", sponsor.toString(), toString);
    }

    @Test
    public void testDeleteSponsors() {
        int id = 123;
        String name = "Nike";
        String industry = "Shoes";
        String number = "210 123 4567";
        String email = "info@nike.com";
        String address = "Kifisias 168 Av.";
        sponsor = new Sponsor(id, name, industry, number, email, address);
        list.add(sponsor);

        for (Sponsor sponsors: list) {
            if (sponsors.getID() == sponsor.getID()) {
                list.remove(sponsor);
                break;
            }
        }

        assertEquals("Size of a list after deletion", 0, list.size());

    }
}