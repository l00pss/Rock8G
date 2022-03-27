package model.concretes;

import model.abstracts.GField;

public class FirstName extends GField {

    public FirstName(){
        super.setNameOfField("NAME");
        super.setDataType("VARCHAR2(50)");
        super.setForeignKey(false);
        super.setPrimaryKey(false);
        super.setNullable(true);
        super.setUnique(false);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
