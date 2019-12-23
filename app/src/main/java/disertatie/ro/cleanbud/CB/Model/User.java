package disertatie.ro.cleanbud.CB.Model;

import android.util.Patterns;

public class User {
    private String strName;
    private String strEmailAdress;
    private String strMobileNumber;
    private String strPassword;

    public User(String strEmailAdress, String strPassword) {
        this.strEmailAdress = strEmailAdress;
        this.strPassword = strPassword;
    }

    public User(String strName, String strEmailAdress, String strMobileNumber, String strPassword) {
        this.strName = strName;
        this.strEmailAdress = strEmailAdress;
        this.strMobileNumber = strMobileNumber;
        this.strPassword = strPassword;
    }

    public String getStrName() {
        return strName;
    }

    public String getStrEmailAdress() {
        return strEmailAdress;
    }

    public String getStrMobileNumber() {
        return strMobileNumber;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public boolean isEmailValid(){
        return Patterns.EMAIL_ADDRESS.matcher(getStrEmailAdress()).matches();
    }

    public boolean isPasswordGreaterThan5(){
        return getStrPassword().length() > 5;
    }
}
