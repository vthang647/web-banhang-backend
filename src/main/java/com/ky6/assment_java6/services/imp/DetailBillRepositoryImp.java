package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.DetailBill;
import com.ky6.assment_java6.repositories.DetailBillRepository;
import com.ky6.assment_java6.services.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetailBillRepositoryImp implements DetailBillService {
    @Autowired
    DetailBillRepository detailBillRepository;

    @Override
    public List<DetailBill> findAll() {
        return detailBillRepository.findAll();
    }

    @Override
    public <S extends DetailBill> S save(S entity) {
        return detailBillRepository.save(entity);
    }

    @Override
    public Optional<DetailBill> findById(Integer integer) {
        return detailBillRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return detailBillRepository.existsById(integer);
    }

    @Override
    public long count() {
        return detailBillRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        detailBillRepository.deleteById(integer);
    }

    @Override
    public <S extends DetailBill> long count(Example<S> example) {
        return detailBillRepository.count(example);
    }

    @Override
    public <S extends DetailBill> boolean exists(Example<S> example) {
        return detailBillRepository.exists(example);
    }
}
