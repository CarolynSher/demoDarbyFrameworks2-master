package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Project: demo
 * Package: com.example.demo.domain
 * <p>
 * User: carolyn.sher
 * Date: 4/29/2022
 * Time: 10:50 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Entity
@DiscriminatorValue("1")
public class InhousePart extends Part{
    int partId;

    public InhousePart() {
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }
}
