package edu.icet.clothify.dao.custom.impl;

import edu.icet.clothify.dao.custom.SupplierDao;
import edu.icet.clothify.dto.SupplierDto;
import edu.icet.clothify.entity.SupplierEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SupplierImpl implements SupplierDao {
    @Override
    public boolean save(SupplierDto dto) {
        SupplierEntity supplier = new SupplierEntity(
                dto.getSupId(),
                dto.getName(),
                dto.getEmail(),
                dto.getContactNumber()
        );
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(SupplierEntity.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(supplier);
        transaction.commit();

        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public boolean update(SupplierDto dto) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<SupplierDto> findAll() {
        return null;
    }

    @Override
    public String findLastId() {
        return null;
    }

    @Override
    public SupplierDto findById(String s) {
        return null;
    }
}
