package com.venturebiz.Bugtracking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.venturebiz.Bugtracking.util.Enums;

import java.util.List;

@Repository
public interface AppRepository extends JpaRepository<OfferBeezDashBoard, Integer> {
    List<OfferBeezDashBoard> findByStatus(Enums.Stage status);
    List<OfferBeezDashBoard> findBySeverity(Enums.Severity severity);
    List<OfferBeezDashBoard> findByPriority(Enums.Priority priority);
}