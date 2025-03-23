package Controller;

import Interactor.CustomerInteractor;
import View.CustomerViewBuilder;
import javafx.scene.layout.Region;
import javafx.util.Builder;
import Model.CustomerModel;


public class CustomerController {
    private Builder<Region> viewBuilder;
    private CustomerInteractor interactor;

    public CustomerController() {
        CustomerModel model = new CustomerModel();
        interactor = new CustomerInteractor(model);
        viewBuilder = new CustomerViewBuilder(model, interactor::saveCustomer);
    }

    public Region getView() {
        return viewBuilder.build();
    }
}
