package util;

public class MenuUtil {
    public static byte entryMenu() {
        System.out.println("[0] - > Exit System\n" +
                "[1] - > Admin\n" +
                "[2] - > Reservation\n");
        return InputUtil.getInstance().inputByte("Choose The Option:");
    }
    public static byte adminMenu(){
        System.out.println(
                """
                        [0] - > Exit
                        [1] - > Back
                        [2] - > Register Room
                        [3] - > Show Customer Info
                        [4] - > Show Room Info
                        [5] - > Show Reservation
                        [6] - > Show Hotel Info
                        [7] - > Search Customer(by E-mail)
                """
        );
        return InputUtil.getInstance().inputByte("Choose the option: ");
    }
    public static byte customerMenu(){
        System.out.println(
                """
                        [0] - > Exit
                        [1] - > Back
                        [2] - > Sign Up
                        [3] - > Login
                
                """
        );
        return InputUtil.getInstance().inputByte("Choose the option: ");
    }
    public static byte customerLogin(){
        System.out.println(
                """
                        [0] - > Exit
                        [1] - > Back
                        [2] - > Show Reservation
                        [3] - > End Date Update
                        [4] - > Increase Account
                        [5] - > Cancel Reservation
                """
        );
        return InputUtil.getInstance().inputByte("Choose the option: ");
    }
}