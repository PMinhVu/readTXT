public class User {
    private int id;
    private String userFullName;
    private String userUserName;
    private String userPassword;
    private String userEmail;
    private String userRole;

    public User(int id, String userFullName, String userUserName, String userPassword, String userEmail, String userRole) {
        this.id = id;
        this.userFullName = userFullName;
        this.userUserName = userFullName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userRole = userRole;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userFullName + '\'' +
                ", username='" + userFullName + '\'' +
                ", password='" + userPassword + '\'' +
                ", email='" + userEmail + '\'' +
                ", role='" + userRole + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserUserName() {
        return userUserName;
    }

    public void setUserUserName(String userUserName) {
        this.userUserName = userUserName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
