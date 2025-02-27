package com.crud.product.service;

import com.crud.product.model.Product;
import com.crud.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepository iProductRepository;

    @Override
    public List<Product> findAll() {
        List<Product> list;
        try {
            list = iProductRepository.findAll();
        } catch (Exception ex) {
            throw ex;
        }
        return list;
    }

    @Override
    public int save(Product product) {
        int row;
        try {
            row = iProductRepository.save(product);
        } catch (Exception ex) {
            throw ex;
        }
        return row;
    }

    @Override
    public int update(Product product) {
        int row;
        try {
            row = iProductRepository.update(product);
        } catch (Exception ex) {
            throw ex;
        }
        return row;
    }

    @Override
    public int deleteById(int id) {
        int row;
        try {
            row = iProductRepository.deleteById(id);
        } catch (Exception ex) {
            throw ex;
        }
        return row;
    }
}
