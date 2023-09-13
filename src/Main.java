import impl.CustomerService;
import impl.ICustomerService;
import management.IManagementService;
import management.ManagementService;

public class Main {
    public static void main(String[] args) {
        ManagementService managementService = new IManagementService();
        managementService.management();
    }
}
