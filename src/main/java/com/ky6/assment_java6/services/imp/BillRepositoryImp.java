package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.Bill;
import com.ky6.assment_java6.repositories.BillRepository;
import com.ky6.assment_java6.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillRepositoryImp implements BillService {
    @Autowired
    BillRepository billRepository;

    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public <S extends Bill> S save(S entity) {
        return billRepository.save(entity);
    }

    @Override
    public Optional<Bill> findById(Integer integer) {
        return billRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return billRepository.existsById(integer);
    }

    @Override
    public long count() {
        return billRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        billRepository.deleteById(integer);
    }

    @Override
    public void delete(Bill entity) {
        billRepository.delete(entity);
    }

    @Override
    public <S extends Bill> long count(Example<S> example) {
        return billRepository.count(example);
    }

    @Override
    public <S extends Bill> boolean exists(Example<S> example) {
        return billRepository.exists(example);
    }
}
