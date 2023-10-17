package edu.icet.clothify.dao.custom;

import edu.icet.clothify.dao.CrudDao;
import edu.icet.clothify.dto.CustomerDto;
import edu.icet.clothify.entity.CustomerEntity;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public interface CustomerDao extends CrudDao<CustomerDto,String> {
    public void loadTable(TableView<CustomerEntity> tblCustomer, TableColumn<?,?> colCustomerId, TableColumn<?,?> colCustomerName, TableColumn<?,?> colCustomerEmail, TableColumn<?,?> colContactNumber);
}
