package com.example.design.pattern.example.service.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Base implements Cloneable {
    private Long id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "hashCode>>>" + super.hashCode() + " Base{" +
                "id=" + id +
                '}';
    }
}
