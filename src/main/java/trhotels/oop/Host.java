package trhotels.oop;

public class Host extends User{
    private String companyWebsite;
    private String taxCode;
    private boolean verified;

    public Host(String username, String password, String email, String phoneNumber, Location location, String companyWebsite, String taxCode, boolean verified) {
        super(username, password, email, phoneNumber, location);
        this.companyWebsite = companyWebsite;
        this.taxCode = taxCode;
        this.verified = verified;
    }
    
    // Getters
    public String getCompanyWebsite() {
        return companyWebsite;
    }
    
    public String getTaxCode() {
        return taxCode;
    }

    public boolean isVerified() {
        return verified;
    }
    
    // Setters
    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }


    public void setVerified(boolean verified) {
        this.verified = verified;
    }

}
