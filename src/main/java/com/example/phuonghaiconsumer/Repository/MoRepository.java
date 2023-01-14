package com.example.phuonghaiconsumer.Repository;

import com.example.phuonghaiconsumer.Entity.MOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoRepository extends JpaRepository<MOrder,Long> {
    MOrder findById(long id);

    MOrder findByControltoken(String token);
}
