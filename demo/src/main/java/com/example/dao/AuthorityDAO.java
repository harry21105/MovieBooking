package com.example.dao;

import org.springframework.data.repository.CrudRepository;



import com.example.entity.Authority;
import com.example.entity.Users;

public interface AuthorityDAO extends CrudRepository<Authority, Long>{

}