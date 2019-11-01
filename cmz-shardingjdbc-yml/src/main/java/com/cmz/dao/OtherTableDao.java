package com.cmz.dao;


import com.cmz.entity.OtherTable;

import java.util.List;

public interface OtherTableDao {

    long addOne(OtherTable table);

    List<OtherTable> getAll();

}
