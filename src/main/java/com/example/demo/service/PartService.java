package com.example.demo.service;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;

import java.util.List;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 4/21/2022
 * Time: 1:45 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface PartService {
    public List<Part> findAll();
    public Part findById(int theId);
    public void save (Part thePart);
    public void deleteById(int theId);

    public List<Part> listAll(String keyword);
}
