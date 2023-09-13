package management;

import impl.AdminService;
import impl.CustomerService;
import impl.IAdminService;
import impl.ICustomerService;

import static util.MenuUtil.*;

public class IManagementService implements ManagementService{
    @Override
    public void management() {
        CustomerService customerService = new ICustomerService();
        AdminService adminService = new IAdminService();
        while (true){
            byte option = entryMenu();
            switch (option){
                case 0:
                    System.exit(-1);
                    break;
                case 1:
                    adminService.login();
                    while (true) {
                        byte adminLogin = adminMenu();
                        switch (adminLogin){
                            case 0:
                                System.exit(-1);
                                break;
                            case 1:
                                entryMenu();
                                break;
                            case 2:
                                adminService.registerRoom();
                                break;
                            case 3:
                                adminService.showCustomerInfo();
                                break;
                            case 4:
                                adminService.roomInfo();
                                break;
                            case 5:
                                adminService.showReservation();
                                break;
                            case 6:
                                adminService.hotelInfo();
                                break;
                            case 7:
                                adminService.searchCustomer();
                                break;
                        }
                    }
                case 2:
                    customerMenu();
                    while (true){
                        byte customerLogin = customerMenu();
                        switch (customerLogin){
                            case 0:
                                System.exit(-1);
                                break;
                            case 1:
                                entryMenu();
                                break;
                            case 2:
                                customerService.customerRegister();
                                break;
                            case 3:
                                customerService.customerLogin();
                                while (true){
                                    byte login = customerLogin();
                                    switch (login){
                                        case 0:
                                            System.exit(-1);
                                            break;
                                        case 1:
                                            customerMenu();
                                        case 2:

                                    }
                                }

                        }
                    }
            }
        }
    }
}
