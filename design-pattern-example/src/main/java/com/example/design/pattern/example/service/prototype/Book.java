package com.example.design.pattern.example.service.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: dingrui
 * @Date: Create in 2020/5/31
 * @Description:
 *
 * 类中只有不可变对象时直接继承Cloneable接口，覆写clone方法，返回super.clone()浅拷贝
 * 类中包含可变对象时需要进行深拷贝
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Cloneable {

    private String name;
    private String author;
    private Float price;

    private Base base;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Book cloneBook = (Book) super.clone();
        Base cloneBase = (Base) this.base.clone();
        cloneBook.setBase(cloneBase);

        return cloneBook;
    }

    @Override
    public String toString() {
        return "hashCode>>>" + super.hashCode() + " Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", base=" + base +
                '}';
    }
}
