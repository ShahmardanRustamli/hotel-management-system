package enums;

public enum StatusEnum {
    REGISTER_SUCCESSFULLY("Register Successfully!"),
    SHOW_SUCCESSFULLY("User Showed!"),
    DELETE_SUCCESSFULLY("Delete Successfully!"),
    UPDATE_SUCCESSFULLY("Update Successfully!"),
    SEARCH_SUCCESSFULLY("User is Found!"),
    ROOM_REGISTER_SUCCESSFULLY("Rooms Registered!"),
    ROOM_INFO("Room Information"),
    HOTEL_SHOW("Hotel Showed"),
    LOGIN_SUCCESSFUL("Successfully Login");
    String message;

    StatusEnum(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
