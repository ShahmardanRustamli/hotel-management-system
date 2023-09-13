package enums;

public enum ExceptionEnum {
    CUSTOMER_NOT_FOUND_EXCEPTION("Customer does not exist!"),
    INCORRECT_PASSWORD("Incorrect password!"),
    INCORRECT_EMAIL("Incorrect email!");

    private String message;

    ExceptionEnum(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
