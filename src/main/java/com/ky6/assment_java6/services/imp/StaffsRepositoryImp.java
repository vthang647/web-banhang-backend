package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.Staff;
import com.ky6.assment_java6.repositories.StaffsRepository;
import com.ky6.assment_java6.services.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffsRepositoryImp implements StaffsService {
    @Autowired
    StaffsRepository staffsRepository;

    @Override
    public void deleteById(Integer integer) {
        staffsRepository.deleteById(integer);
    }

    @Override
    public List<Staff> findAll() {
        return staffsRepository.findAll();
    }

    @Override
    public List<Staff> findAll(Sort sort) {
        return staffsRepository.findAll(sort);
    }

    @Override
    public List<Staff> findAllById(Iterable<Integer> integers) {
        return staffsRepository.findAllById(integers);
    }

    @Override
    public <S extends Staff> S save(S entity) {
        return staffsRepository.save(entity);
    }

    @Override
    public Optional<Staff> findById(Integer integer) {
        return staffsRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return staffsRepository.existsById(integer);
    }

    @Override
    public long count() {
        return staffsRepository.count();
    }

    @Override
    public <S extends Staff> boolean exists(Example<S> example) {
        return staffsRepository.exists(example);
    }
}
