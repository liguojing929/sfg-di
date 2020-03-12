package guru.springframework.sfgdi.examplebeans;

public class SampleDataSource {

    private String username;
    private String password;
    private String dbURL;

    private String customizeName;

    public String getUsername() {
        return username;
    }

    public String getCustomizeName() {
        return customizeName;
    }

    public void setCustomizeName(String customizeName) {
        this.customizeName = customizeName;
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

    public String getDbURL() {
        return dbURL;
    }

    public void setDbURL(String dbURL) {
        this.dbURL = dbURL;
    }
}
