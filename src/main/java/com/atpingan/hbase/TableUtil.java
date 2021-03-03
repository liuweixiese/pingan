package com.atpingan.hbase;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author shkstart
 * @create 2021-02-25 16:56
 */
public class TableUtil {
    private static Logger logger= LoggerFactory.getLogger(TableUtil.class);
    //判断表名是否合法，合法返回表明不合法返回null
    public static TableName checkTableName(String tablename,String nsname){
        //检验表明合法性
        if (StringUtils.isBlank(tablename)){
            logger.error("请输入正确表明");
            return null;
        }
        return TableName.valueOf(nsname,tablename);
    }


   /* //判断表名是否合法，如果合法返回名称空间的表名，如果不合法返回null
    public static TableName checkTableName(String tablename, String nsname){
        //验证表名是否合法
        if (StringUtils.isBlank(tablename)){
            logger.error("请输入正确的表名");
            return null;
        }
        return TableName.valueOf(nsname,tablename);
    }*/

   //判断表是否存在
    public static boolean ifTableExists(Connection conn,String tablename,String nsname) throws IOException {
        //验证表名合法性
        TableName tn = checkTableName(tablename, nsname);
        if (tn == null){
            return false;
        }

        //创建admin
        Admin admin = conn.getAdmin();
        boolean tE = admin.tableExists(tn);
        admin.close();
        return tE;
    }

    /*//判断表是否存在
    public static boolean ifTableExists(Connection conn, String tablename, String nsname) throws IOException {
        //验证表名是否合法
        TableName tn = checkTableName(tablename, nsname);
        if (tn==null){
            return false;
        }
        //创建admin
        Admin admin = conn.getAdmin();
        //判断表是否存在
        boolean tableExists = admin.tableExists(tn);
        admin.close();
        return tableExists;
    }*/


    //创建表
    public static boolean createTable(Connection conn,String tablename,String nsname,String...cfs) throws IOException {
        if (ifTableExists(conn,tablename,nsname)){
            logger.warn(tablename + "已存在，无需再创建");
            return false;
        }

        TableName tN = checkTableName(tablename, nsname);
        if (cfs.length < 1){
            logger.warn("至少一个列族");
            return false;
        }

        //创建Admin
        Admin admin = conn.getAdmin();
        //创建表描述及定义
        HTableDescriptor hTableDescriptor = new HTableDescriptor(tN);
        //列族需在表描述和定义中指定
        for(String cf : cfs ){
            HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(cf);
            hTableDescriptor.addFamily(hColumnDescriptor);
        }

        admin.createTable(hTableDescriptor,Bytes.toBytes("aaa"),Bytes.toBytes("bbb"),6);
        admin.close();
        return true;

    }

    /*//创建表
    public static boolean createTable(Connection conn,String tablename,String nsname,String...cfs) throws IOException {
        //验证表是否存在以及表名是否合法
        if (ifTableExists(conn,tablename,nsname)){
            logger.warn(tablename+"已经存在，无需再创建");
            return false;
        }

        TableName tn = checkTableName(tablename, nsname);
        if (cfs.length< 1){
            logger.warn("至少需要指定一个列族");
            return false;
        }

        //创建admin
        Admin admin = conn.getAdmin();
        //创建表的描述和定义
        HTableDescriptor hTableDescriptor = new HTableDescriptor(tn);
        //列族需要在表的描述和定义中指定
        for (String cf : cfs) {
            HColumnDescriptor hColumnDescriptor = new HColumnDescriptor(cf);
            hTableDescriptor.addFamily(hColumnDescriptor);
        }

        //基于表的描述创建表
//        admin.createTable(hTableDescriptor);

*//*        byte[][] bytes = new byte[4][];

        bytes[0] = Bytes.toBytes("aaa");
        bytes[1] = Bytes.toBytes("bbb");
        bytes[2] = Bytes.toBytes("ccc");
        bytes[3] = Bytes.toBytes("ddd");

        admin.createTable(hTableDescriptor,bytes);
        *//*
        admin.createTable(hTableDescriptor, Bytes.toBytes("aaa"),Bytes.toBytes("bbb"),6);
        admin.close();
        return true;
    }
*/

    public static boolean dropTable(Connection conn,String tablename,String nsname) throws IOException {
        if (!ifTableExists(conn, tablename, nsname)){
            logger.warn("无法删除");
            return false;
        }

        //获取表名
        TableName tableName = checkTableName(tablename, nsname);

        //创建admin
        Admin admin = conn.getAdmin();
        admin.disableTable(tableName);

        admin.deleteTable(tableName);

        conn.close();
        return true;
    }


   /* //删除表
    public static boolean dropTable(Connection conn,String tablename,String nsname) throws IOException {
        if (!ifTableExists(conn,tablename,nsname)){
            logger.warn(tablename+"不存在，无法删除");
            return  false;
        }
        //获取表名
        TableName tableName = checkTableName(tablename, nsname);


        //创建admin
        Admin admin = conn.getAdmin();
        //删除前，需要将表设置为disable状态
        admin.disableTable(tableName);

        admin.deleteTable(tableName);

        admin.close();
        return true;
    }*/

}
