package com.example.demo.service;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;

import java.util.List;

/**
 * Project: demo
 * Package: com.example.demo.service
 * <p>
 * User: carolyn.sher
 * Date: 4/30/2022
 * Time: 3:24 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface InhousePartService {
    public List<InhousePart> findAll();
    public InhousePart findById(int theId);
    public void save (InhousePart thePart);
    public void deleteById(int theId);
}
