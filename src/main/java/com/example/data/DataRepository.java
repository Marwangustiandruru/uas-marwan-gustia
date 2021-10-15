package com.example.data;

import org.springframework.data.jpa.repository.JpaRepository;

interface DataRepository extends JpaRepository<Data, Long> {

}
