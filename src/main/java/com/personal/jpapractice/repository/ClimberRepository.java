package com.personal.jpapractice.repository;

import com.personal.jpapractice.model.Climber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClimberRepository extends JpaRepository<Climber, Long> {
}
