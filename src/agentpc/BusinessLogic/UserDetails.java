package agentpc.BusinessLogic;

import agentpc.DBOperations.DBOperations;

public class UserDetails {
    private String regid;
    private String firstname;
    private String lastname;
    private int age;
    private String company;
    private String email;
    private String username;
    private String password;
    private String question;
    private String answer;
    private boolean sync;

    
    //private static int autoIncrement=1;
    
    DBOperations dbo=new DBOperations();
    /*
    public UserDetails(String table){
    this.table=table;
    }
    */
    public String getRegid() {
        return regid;
    }

    public void setRegid(String table, String colomn) {
        
        if(dbo.checkRegID(table,colomn)<10){
            if (table=="accountant"){
                this.regid ="AC0"+ dbo.checkRegID(table,colomn);
            }
            else if (table=="rep"){
                this.regid ="RP0"+ dbo.checkRegID(table,colomn);
            }
            else if (table=="agentdetails"){
                this.regid ="AG0"+ dbo.checkRegID(table,colomn);
            }
        }
        else{
           if (table=="accountant"){
            this.regid ="AC"+ dbo.checkRegID(table,colomn);
            }
            else if (table=="rep"){
                this.regid ="RP"+ dbo.checkRegID(table,colomn);
            }
            else if (table=="agentdetails"){
                this.regid ="AG"+ dbo.checkRegID(table,colomn);
            } 
        }
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

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return the sync
     */
    public boolean isSync() {
        return sync;
    }

    /**
     * @param sync the sync to set
     */
    public void setSync(boolean sync) {
        this.sync = sync;
    }
}
