package com.apress.prospring4.ch4;

import java.beans.PropertyEditorSupport;

/**
 * Author: 王俊超
 * Date: 2015-12-10
 * Time: 09:19
 * Declaration: All Rights Reserved !!!
 */
public class NamePropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] name = text.split("\\s");
        setValue(new Name(name[0], name[1]));
    }
}
