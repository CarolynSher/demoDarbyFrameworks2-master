package com.example.demo.service;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;

import java.util.List;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 4/30/2022
 * Time: 2:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface OutsourcedPartService {
        public List<OutsourcedPart> findAll();
        public OutsourcedPart findById(int theId);
        public void save (OutsourcedPart thePart);
        public void deleteById(int theId);
}
