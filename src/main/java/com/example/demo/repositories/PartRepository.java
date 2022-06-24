package com.example.demo.repositories;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Project: demo
 * Package: com.example.demo.repositories
 * <p>
 * User: carolyn.sher
 * Date: 4/20/2022
 * Time: 12:00 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface PartRepository extends CrudRepository <Part,Long> {
    @Query("SELECT p FROM Part p WHERE p.name LIKE %?1%")
    public List<Part> search(String keyword);
}
