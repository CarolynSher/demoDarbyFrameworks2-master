package com.example.demo.repositories;

import com.example.demo.domain.InhousePart;
import org.springframework.data.repository.CrudRepository;

/**
 * Project: demo
 * Package: com.example.demo.repositories
 * <p>
 * User: carolyn.sher
 * Date: 4/30/2022
 * Time: 3:22 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface InhousePartRepository extends CrudRepository<InhousePart,Long> {
}
