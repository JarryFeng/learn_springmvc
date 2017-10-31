package com.my.project.pojo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jarry on 2017/10/24.
 */
public class Item {

    //商品名称
    private String name;
    //商品价格
    private BigDecimal price;
    //生产日期
    private Date productDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }
}
