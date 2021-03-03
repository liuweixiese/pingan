package com.atpingan;

/**
 * @author shkstart
 * @create 2021-02-24 10:32
 */
public class PrimitiveTypeTest{
    private String format;
    public String getFormat() {
        return format;
    }
    public void setFormat(String input_format) {
        format = input_format;
    }

    public static void main(String[] args){
        PrimitiveTypeTest pt = new PrimitiveTypeTest();
        pt.setFormat("2");
        System.out.println(pt.getFormat());
    }
}
