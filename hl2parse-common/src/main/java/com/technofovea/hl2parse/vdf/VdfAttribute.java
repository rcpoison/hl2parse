/**
 * Copyright (C) 2011 Darien Hager
 *
 * This code is part of the "HL2Parse" project, and is licensed under
 * a Creative Commons Attribution-ShareAlike 3.0 Unported License. For
 * either a summary of conditions or the full legal text, please visit:
 *
 * http://creativecommons.org/licenses/by-sa/3.0/
 *
 * Permissions beyond the scope of this license may be available
 * at http://technofovea.com/ .
 */
package com.technofovea.hl2parse.vdf;

/**
 *
 * @author Darien Hager
 */
public class VdfAttribute {

    private String name = "";
    private String value = "";

    VdfAttribute(String key, String value) {

        this.name = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{"+this.name+":"+this.value+"}";
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    

    

    


}
