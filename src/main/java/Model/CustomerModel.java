package Model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CustomerModel {
    public final StringProperty accountName = new SimpleStringProperty("");
    public final StringProperty customerName = new SimpleStringProperty("");

    public String getAccountName() {
        return accountName.get();
    }

    public StringProperty accountNameProperty() {
        return accountName;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public StringProperty customerNameProperty() {
        return customerName;
    }
}
