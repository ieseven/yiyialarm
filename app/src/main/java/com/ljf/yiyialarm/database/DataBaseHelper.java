package com.ljf.yiyialarm.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.ljf.yiyialarm.constant.Const;

/**
 * Created by NetHunter on 2015/11/10.
 */
public class DataBaseHelper extends OrmLiteSqliteOpenHelper {

    private Context context;


    public  DataBaseHelper(Context context)
    {
        super(context, Const.DB_NAME,null,Const.DB_VERSION);

    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {

    }
}
