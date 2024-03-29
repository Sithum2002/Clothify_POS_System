package edu.icet.clothify.dao.custom.impl;

import edu.icet.clothify.dao.custom.ProductDao;
import edu.icet.clothify.dto.ProductDto;
import edu.icet.clothify.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductImpl implements ProductDao {
    @Override
    public boolean save(ProductDto dto) {
        ProductEntity product = new ProductEntity(
                dto.getProdId(),
                dto.getName(),
                dto.getUnitPrice(),
                dto.getQtyOnHand(),
                dto.getType()
        );
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(ProductEntity.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();

        session.close();
        sessionFactory.close();
        return true;
    }

    @Override
    public boolean update(ProductDto dto) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public List<ProductDto> findAll() {
        return null;
    }

    @Override
    public String findLastId() {
        return null;
    }

    @Override
    public ProductDto findById(String s) {
        return null;
    }
}
