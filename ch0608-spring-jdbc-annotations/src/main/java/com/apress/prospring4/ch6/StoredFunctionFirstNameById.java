package com.apress.prospring4.ch6;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlFunction;

import javax.sql.DataSource;
import java.sql.Types;

/**
 * Author: 王俊超
 * Date: 2015-12-14
 * Time: 17:11
 * Declaration: All Rights Reserved !!!
 */
public class StoredFunctionFirstNameById extends SqlFunction<String> {
    private static final String SQL = "SELECT getfirstnamebyid(?)";

    public StoredFunctionFirstNameById(DataSource dataSource) {
        super(dataSource, SQL);
        declareParameter(new SqlParameter(Types.INTEGER));
        compile();
    }
}
