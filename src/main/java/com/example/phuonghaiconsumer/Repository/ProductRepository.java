package com.example.phuonghaiconsumer.Repository;


import com.example.phuonghaiconsumer.Entity.ProductCatogary;
import com.example.phuonghaiconsumer.Entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    Page<ProductEntity> findAllByProductCatogary(Pageable paging, ProductCatogary productCatagory);

    ProductEntity findById(long id);
    List<ProductEntity> findAllByParentname(String parent);

    ProductEntity findByProductName(String name);
}
