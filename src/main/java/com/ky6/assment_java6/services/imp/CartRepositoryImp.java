package com.ky6.assment_java6.services.imp;

import com.ky6.assment_java6.entities.Cart;
import com.ky6.assment_java6.repositories.CartRepository;
import com.ky6.assment_java6.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartRepositoryImp implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    @Override
    public List<Cart> findAll(Sort sort) {
        return cartRepository.findAll(sort);
    }

    @Override
    public <S extends Cart> S save(S entity) {
        return cartRepository.save(entity);
    }

    @Override
    public Optional<Cart> findById(Integer integer) {
        return cartRepository.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return cartRepository.existsById(integer);
    }

    @Override
    public long count() {
        return cartRepository.count();
    }

    @Override
    public void deleteById(Integer integer) {
        cartRepository.deleteById(integer);
    }

    @Override
    public void delete(Cart entity) {
        cartRepository.delete(entity);
    }

    @Override
    public <S extends Cart> long count(Example<S> example) {
        return cartRepository.count(example);
    }

    @Override
    public <S extends Cart> boolean exists(Example<S> example) {
        return cartRepository.exists(example);
    }
}
