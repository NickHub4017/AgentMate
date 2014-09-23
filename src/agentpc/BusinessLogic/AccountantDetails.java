package agentpc.BusinessLogic;

import agentpc.DBOperations.DBOperations;

public class AccountantDetails {
    private String regid;
    private String firstname;
    private String lastname;
    private int age;
    private String company;
    private String email;
    private String username;
    private String password;
    
    //private static int autoIncrement=1;
    
    DBOperations dbo=new DBOperations();
    public String getRegid() {
        return regid;
    }

    public void setRegid() {
        
        this.regid ="AC0"+ dbo.AccountantcheckRegID();
        //autoIncrement++;
    }
    public void setRegID(String regid) {
        this.regid=regid;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the country
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param country the country to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
