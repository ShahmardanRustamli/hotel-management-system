package impl;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.StatusEnum;
import model.Customer;
import reponse.GeneralResponse;
import util.InputUtil;

import java.util.ArrayList;

import static helper.Helper.fillCustomer;

public class ICustomerService implements CustomerService {

    ArrayList<Customer> customerList  = new ArrayList<>();

    private static Customer login;
    public static void setLogin(Customer login) {
        ICustomerService.login = login;
    }

    @Override
    public GeneralResponse<ArrayList<Customer>> customerRegister() {
        int count = InputUtil.getInstance().inputInt("Enter the Register count:");
        ArrayList<Customer> tempList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Customer customer = fillCustomer();
            if (customer!=null){
                GlobalData.customerList.add(customer);
                tempList.add(customer);
            }
        }
        return new GeneralResponse<ArrayList<Customer>>().of(StatusEnum.REGISTER_SUCCESSFULLY.getMessage());
    }
    @Override
    public Customer customerLogin() {
        String email = InputUtil.getInstance().inputString("Enter the username:");
        String password = InputUtil.getInstance().inputString("Enter the password:");
        while (true){
            for (int i = 0; i<customerList.size(); i++){
                if (email.equalsIgnoreCase(customerList.get(0).getEmail())){
                    if (password.equalsIgnoreCase(customerList.get(0).getPassword())){
                        System.out.println("Welcome Dear,"+customerList.get(0).getName());
                        setLogin(customerList.get(0));
                        return customerList.get(0);
                    }else {
                        System.out.println(ExceptionEnum.INCORRECT_PASSWORD);
                    }
                }else {
                    System.out.println(ExceptionEnum.INCORRECT_EMAIL);
                }
            }
        }
    }


}
