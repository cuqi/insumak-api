package com.ws.insumak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ws.insumak.model.TestTable;

public interface TestTableRepository extends JpaRepository<TestTable, String> {
    
}
