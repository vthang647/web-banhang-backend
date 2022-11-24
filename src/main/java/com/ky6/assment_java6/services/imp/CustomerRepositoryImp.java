package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.Customers;
import com.ky6.assment_java6.repositories.CustomerRepository;
import com.ky6.assment_java6.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerRepositoryImp implements CustomersService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customers> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public <S extends Customers> S save(S entity) {
        return customerRepository.save(entity);
    }

    @Override
    public Optional<Customers> findById(Integer integer) {
        return customerRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return customerRepository.existsById(integer);
    }

    @Override
    public long count() {
        return customerRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        customerRepository.deleteById(integer);
    }

    @Override
    public void delete(Customers entity) {
        customerRepository.delete(entity);
    }

    @Override
    public <S extends Customers> long count(Example<S> example) {
        return customerRepository.count(example);
    }

    @Override
    public <S extends Customers> boolean exists(Example<S> example) {
        return customerRepository.exists(example);
    }
}
