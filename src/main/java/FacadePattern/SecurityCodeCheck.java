package FacadePattern;

public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isValidSecurityCode(int securityCode){

        return securityCode == getSecurityCode();
    }


}
