package Controller;

import Interactor.CustomerInteractor;
import View.CustomerViewBuilder;
import javafx.concurrent.Task;
import javafx.scene.layout.Region;
import javafx.util.Builder;
import Model.CustomerModel;


public class CustomerController {
    private Builder<Region> viewBuilder;
    private CustomerInteractor interactor;

    public CustomerController() {
        CustomerModel model = new CustomerModel();
        interactor = new CustomerInteractor(model);
        viewBuilder = new CustomerViewBuilder(model, this::saveCustomer);
    }

    private void saveCustomer(Runnable postTaskGuiAction) {
        Task<Void> saveTask = new Task<>() {
            @Override
            protected Void call() throws Exception {
                interactor.saveCustomer();
                return null;
            }
        };
        saveTask.setOnSucceeded(evt -> postTaskGuiAction.run());
        Thread saveThread = new Thread(saveTask);
        saveThread.start();
    }


    public Region getView() {
        return viewBuilder.build();
    }
}
