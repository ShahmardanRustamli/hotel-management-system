package impl;

import model.Customer;
import reponse.GeneralResponse;

import java.util.ArrayList;

public interface CustomerService {
    Customer customerLogin();
    GeneralResponse<ArrayList<Customer>> customerRegister();


}
