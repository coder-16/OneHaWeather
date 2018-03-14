package com.single.onehaweather.helper;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo on 2017/12/10.
 */

public class CityDataHelper extends SQLiteOpenHelper {
    private String db_name = "oneha.db";
    private String table_province;
    private int id_province;
    private String name_province;
    private String table_city;
    private int id_city;
    private String name_city;
    private int rdid_city;
    private String table_road;
    private int id_road;
    private String name_road;
    private int rfid_road;

    public CityDataHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public CityDataHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createProvinceSql = "create table " + table_province + "( " + id_province + "INTEGER primary key, "
                +name_province+" varchar(30))";
        String createCitySql="create table "+table_city+" ( "+id_city+" integer primary key, "+
                name_city+" varchar(30))";
        String createRoadSql="create table "+table_road+" ("+id_road+" integer primary key, "+
                name_road+" varchar(100))";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
