/** This is a class about a company that the user may consider
 * as a sponsor for a project or event.
 * 
 * @author mariachrisochoou 
 */


public class Sponsor {
    
    private int companyID;
    private String companyName;
    private String businessIndustry;
    private int companyNumber;
    private String companyEmail;
    private String companyAddress;

    public Sponsor (int ID, String name, String industry, int number, String email, String address) {
        companyID = ID;
        companyName = name;
        businessIndustry = industry;
        companyNumber = number;
        companyEmail = email;
        companyAddress = address;
    }

    public void setID(int ID) {
        companyID = ID;
    }

    public int getID() {
        return companyID;
    }

    public void setName(String name) {
        companyName = name;
    }

    public String getName() {
        return companyName;
    }

    public void setIndustry(String industry) {
        businessIndustry = industry;
    }

    public String getIndustry() {
        return businessIndustry;
    }

    public void setNumber(int number) {
        companyNumber = number;
    }

    public int getNumber() {
        return companyNumber;
    }

    public void setEmail(String email) {
        companyEmail = email;
    }

    public String getEmail() {
        return companyEmail;
    }

    public void setAddress(String address) {
        companyAddress = address;
    }

    public String getAddress() {
        return companyAddress;
    }

    @Override
    public String toString() {
        return "Company: " + companyName + "\nCompany ID:" + companyID + "\nBusiness Field: " + businessIndustry +
                "\nPhone number: " + companyNumber + "\nCorporate Email: " + companyEmail +
                "\nAddress: " + companyAddress;
    }

}