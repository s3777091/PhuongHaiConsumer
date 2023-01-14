package com.example.phuonghaiconsumer.Service;

import com.example.phuonghaiconsumer.Entity.MOrder;
import com.example.phuonghaiconsumer.Entity.ProductCatogary;
import com.example.phuonghaiconsumer.Entity.ProductEntity;
import com.example.phuonghaiconsumer.Entity.UserEntity;
import com.example.phuonghaiconsumer.Repository.CatogaryRepository;
import com.example.phuonghaiconsumer.Repository.MoRepository;
import com.example.phuonghaiconsumer.Repository.ProductRepository;
import com.example.phuonghaiconsumer.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerTotal {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CatogaryRepository catogaryRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MoRepository moRepository;

    @KafkaListener(id = "UserRegisterGroup", topics = "UserRegister")
    public void ListenVerify(UserEntity user) {
        userRepository.save(user);;
    }

    @KafkaListener(id = "addCatogaryGroup", topics = "addCatogary")
    public void ListenAddCatogary(ProductCatogary ca) {
        catogaryRepository.save(ca);;
    }

    @KafkaListener(id = "addProductGroup", topics = "addProduct")
    public void ListenAddProduct(ProductEntity ca) {
        productRepository.save(ca);;
    }

    @KafkaListener(id = "deleteMoGroup", topics = "deleteMo")
    public void deleteMo(MOrder ca) {
        moRepository.delete(ca);
    }

    @KafkaListener(id = "addMoGroup", topics = "addMo")
    public void addMo(MOrder sa) {
        moRepository.save(sa);
    }

    @KafkaListener(id = "EditMoGroup", topics = "EditMo")
    public void EditMo(MOrder sa) {
        moRepository.save(sa);
    }

    @KafkaListener(id = "addBillGroup", topics = "addBill")
    public void addBill(MOrder sa) {
        moRepository.save(sa);
    }
    

}
