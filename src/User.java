public class User {

    private String username;
    private String password;
    private String fullName;
    private String contact;
    private String emailid;

    public User(String username, String password, String fullName,String emailid, String contact) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.contact = contact;
        this.emailid = emailid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    @Override
    public String toString() {
        return fullName + " ("+username+")";
    }
}
