package data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import Global.N.N2001_N2011;
import Global.N.N2012_N2016;
import Global.N.N2017_N2022_3;
import Global.N.N2023_N2026;
import Global.N.N2051_N2078;
import Global.N.N2080_N2107;
import Global.N.N2110_N2189a;
import Global.N.N2190_N2191;
import Global.N.N2192_N2202;
import Global.N.N2211_N2248_A_C;
import Global.N.N2211_N2248_B;
import Global.N.N2251_N2260;
import Global.N.N2271_N2284;
import Global.N.N2291_N2304;
import Global.N.N2311_N2317;
import Global.N.N2321_N2322;

/**
 * Created by Umeed-e-Nau on 12/21/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "vasa.db";
    private static final int VERSION = 1;

    Context mContext;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.beginTransaction();

        db.execSQL(data.N.N2001_N2011.getCreateQuery()); // N2001_N2011 created here
        db.execSQL(data.N.N2012_N2016.getCreateQuery()); // N2012_N2016 created here
        db.execSQL(data.N.N2017_N2022_3.getCreateQuery()); // N2017_N2022_3 created here
        db.execSQL(data.N.N2023_N2026.getCreateQuery()); // N2023_N2026 created here
        db.execSQL(data.N.N2051_N2078.getCreateQuery()); // N2051_N2078 created here
        db.execSQL(data.N.N2080_N2107.getCreateQuery()); // N2080_N2107 created here
        db.execSQL(data.N.N2110_N2189a.getCreateQuery()); // N2110_N2189a created here
        db.execSQL(data.N.N2190_N2191.getCreateQuery()); // N2190_N2191 created here
        db.execSQL(data.N.N2192_N2202.getCreateQuery()); // N2192_N2202 created here
        db.execSQL(data.N.N2211_N2248_A_C.getCreateQuery()); // N2211_N2248_A_C created here
        db.execSQL(data.N.N2211_N2248_B.getCreateQuery()); // N2211_N2248_B created here
        db.execSQL(data.N.N2251_N2260.getCreateQuery()); // N2251_N2260 created here
        db.execSQL(data.N.N2271_N2284.getCreateQuery()); // N2271_N2284 created here
        db.execSQL(data.N.N2291_N2304.getCreateQuery()); // N2291_N2304 created here
        db.execSQL(data.N.N2311_N2317.getCreateQuery()); // N2311_N2317 created here
        db.execSQL(data.N.N2321_N2322.getCreateQuery()); // N2321_N2322 created here

        db.setTransactionSuccessful();
        db.endTransaction();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        //   String query;
        // db.beginTransaction();
        // query = "DROP TABLE IF EXISTS " + oTable.TABLE_NAME;
        // db.execSQL(query);

//        db.setTransactionSuccessful();
        //      db.endTransaction();
    }

    public Cursor execRAW(String query) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = null;
        try {
            cursor = db.rawQuery(query, null);
        } catch (SQLiteException e) {
            e.printStackTrace();
            Log.d(DBHelper.class.getName(), " Exception while executing Query");
        }
        return cursor;
    }

    //2001
    public Long add_N2001(N2001_N2011 n2001) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2001_N2011.sub_N2001_N2011.N2001, n2001.getN2001());
        values.put(N2001_N2011.sub_N2001_N2011.N2002, n2001.getN2002());
        values.put(N2001_N2011.sub_N2001_N2011.N2003, n2001.getN2003());
        values.put(N2001_N2011.sub_N2001_N2011.N2004, n2001.getN2004());
        values.put(N2001_N2011.sub_N2001_N2011.N2005u, n2001.getN2005u());
        values.put(N2001_N2011.sub_N2001_N2011.N2005d, n2001.getN2005d());
        values.put(N2001_N2011.sub_N2001_N2011.N2005w, n2001.getN2005w());
        values.put(N2001_N2011.sub_N2001_N2011.N2005m, n2001.getN2005m());
        values.put(N2001_N2011.sub_N2001_N2011.N2006, n2001.getN2006());
        values.put(N2001_N2011.sub_N2001_N2011.N2006x, n2001.getN2006x());
        values.put(N2001_N2011.sub_N2001_N2011.N2008, n2001.getN2008());
        values.put(N2001_N2011.sub_N2001_N2011.N2008x, n2001.getN2008x());
        values.put(N2001_N2011.sub_N2001_N2011.N2009_1, n2001.getN20091());
        values.put(N2001_N2011.sub_N2001_N2011.N2009_2, n2001.getN20092());
        values.put(N2001_N2011.sub_N2001_N2011.N2009_3, n2001.getN20093());
        values.put(N2001_N2011.sub_N2001_N2011.N2009_4, n2001.getN20094());
        values.put(N2001_N2011.sub_N2001_N2011.N2010, n2001.getN2010());
        values.put(N2001_N2011.sub_N2001_N2011.N2011, n2001.getN2011());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2001_N2011.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2012
    public Long add_N2012(N2012_N2016 n2012) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2012_N2016.sub_N2012_N2016.N2012, n2012.getN2012());
        values.put(N2012_N2016.sub_N2012_N2016.N2013, n2012.getN2013());
        values.put(N2012_N2016.sub_N2012_N2016.N2014, n2012.getN2014());
        values.put(N2012_N2016.sub_N2012_N2016.N2015, n2012.getN2015());
        values.put(N2012_N2016.sub_N2012_N2016.N2016, n2012.getN2016());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2012_N2016.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2017
    public Long add_N2017(N2017_N2022_3 n2017) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2017, n2017.getN2017());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2018, n2017.getN2018());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2019u, n2017.getN2019u());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2019h, n2017.getN2019h());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2019d, n2017.getN2019d());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2020, n2017.getN2020());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2021, n2017.getN2021());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2022, n2017.getN2022());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_1, n2017.getN20221());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_2, n2017.getN20222());
        values.put(N2017_N2022_3.sub_N2017_N2022_3.N2022_3, n2017.getN20223());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2017_N2022_3.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2023
    public Long add_N2023(N2023_N2026 n2023) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2023_N2026.sub_N2023_N2026.N2023, n2023.getN2023());
        values.put(N2023_N2026.sub_N2023_N2026.N2024, n2023.getN2024());
        values.put(N2023_N2026.sub_N2023_N2026.N2024_1, n2023.getN20241());
        values.put(N2023_N2026.sub_N2023_N2026.N2025U, n2023.getN2025U());
        values.put(N2023_N2026.sub_N2023_N2026.N2025D, n2023.getN2025D());
        values.put(N2023_N2026.sub_N2023_N2026.N2026, n2023.getN2026());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2023_N2026.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2051
    public Long add_N2051(N2051_N2078 n2051) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2051_N2078.sub_N2051_N2078.N2051, n2051.getN2051());
        values.put(N2051_N2078.sub_N2051_N2078.N2052, n2051.getN2052());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_1, n2051.getN20531());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_2, n2051.getN20532());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_3, n2051.getN20533());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_4, n2051.getN20534());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_5, n2051.getN20535());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_DK, n2051.getN2053DK());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_OT, n2051.getN2053OT());
        values.put(N2051_N2078.sub_N2051_N2078.N2053_OTx, n2051.getN2053OTx());
        values.put(N2051_N2078.sub_N2051_N2078.N2054, n2051.getN2054());
        values.put(N2051_N2078.sub_N2051_N2078.N2055, n2051.getN2055());
        values.put(N2051_N2078.sub_N2051_N2078.N2056, n2051.getN2056());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_1, n2051.getN20571());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_2, n2051.getN20572());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_3, n2051.getN20573());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_4, n2051.getN20574());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_5, n2051.getN20575());
        values.put(N2051_N2078.sub_N2051_N2078.N2057_6, n2051.getN20576());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_1, n2051.getN20581());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_2, n2051.getN20582());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_3, n2051.getN20583());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_4, n2051.getN20584());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_5, n2051.getN20585());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_6, n2051.getN20586());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_7, n2051.getN20587());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_8, n2051.getN20588());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_9, n2051.getN20589());
        values.put(N2051_N2078.sub_N2051_N2078.N2058_10, n2051.getN205810());
        values.put(N2051_N2078.sub_N2051_N2078.N2059, n2051.getN2059());
        values.put(N2051_N2078.sub_N2051_N2078.N2060, n2051.getN2060());
        values.put(N2051_N2078.sub_N2051_N2078.N2061, n2051.getN2061());
        values.put(N2051_N2078.sub_N2051_N2078.N2062, n2051.getN2062());
        values.put(N2051_N2078.sub_N2051_N2078.N2063, n2051.getN2063());
        values.put(N2051_N2078.sub_N2051_N2078.N2064, n2051.getN2064());
        values.put(N2051_N2078.sub_N2051_N2078.N2065, n2051.getN2065());
        values.put(N2051_N2078.sub_N2051_N2078.N2066, n2051.getN2066());
        values.put(N2051_N2078.sub_N2051_N2078.N2067, n2051.getN2067());
        values.put(N2051_N2078.sub_N2051_N2078.N2068, n2051.getN2068());
        values.put(N2051_N2078.sub_N2051_N2078.N2069_1, n2051.getN20691());
        values.put(N2051_N2078.sub_N2051_N2078.N2069_2, n2051.getN20692());
        values.put(N2051_N2078.sub_N2051_N2078.N2069_3, n2051.getN20693());
        values.put(N2051_N2078.sub_N2051_N2078.N2070, n2051.getN2070());
        values.put(N2051_N2078.sub_N2051_N2078.N2071, n2051.getN2071());
        values.put(N2051_N2078.sub_N2051_N2078.N2072, n2051.getN2072());
        values.put(N2051_N2078.sub_N2051_N2078.N2073, n2051.getN2073());
        values.put(N2051_N2078.sub_N2051_N2078.N2074, n2051.getN2074());
        values.put(N2051_N2078.sub_N2051_N2078.N2074x, n2051.getN2074x());
        values.put(N2051_N2078.sub_N2051_N2078.N2075, n2051.getN2075());
        values.put(N2051_N2078.sub_N2051_N2078.N2076, n2051.getN2076());
        values.put(N2051_N2078.sub_N2051_N2078.N2076x, n2051.getN2076x());
        values.put(N2051_N2078.sub_N2051_N2078.N2077, n2051.getN2077());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_1, n2051.getN20781());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_2, n2051.getN20782());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_3, n2051.getN20783());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_4, n2051.getN20784());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_4x, n2051.getN20784x());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_5, n2051.getN20785());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_6, n2051.getN20786());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_7, n2051.getN20787());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_8, n2051.getN20788());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_9, n2051.getN20789());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_10, n2051.getN207810());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_11, n2051.getN207811());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_12, n2051.getN207812());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_13, n2051.getN207813());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_DK, n2051.getN2078DK());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_OT, n2051.getN2078OT());
        values.put(N2051_N2078.sub_N2051_N2078.N2078_OTx, n2051.getN2078OTx());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2051_N2078.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2080
    public Long add_N2080(N2080_N2107 n2080) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2080_N2107.sub_N2080_N2107.N2080_1, n2080.getN20801());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_2, n2080.getN20802());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_3, n2080.getN20803());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_4, n2080.getN20804());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_5, n2080.getN20805());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_6, n2080.getN20806());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_7, n2080.getN20807());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_8, n2080.getN20808());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_9, n2080.getN20809());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_10, n2080.getN208010());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_11, n2080.getN208011());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_12, n2080.getN208012());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_13, n2080.getN208013());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_14, n2080.getN208014());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_15, n2080.getN208015());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_15x, n2080.getN208015x());
        values.put(N2080_N2107.sub_N2080_N2107.N2080_16, n2080.getN208016());
        values.put(N2080_N2107.sub_N2080_N2107.N2081, n2080.getN2081());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_1, n2080.getN20821());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_2, n2080.getN20822());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_3, n2080.getN20823());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_4, n2080.getN20824());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_5, n2080.getN20825());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_6, n2080.getN20826());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_DK, n2080.getN20827());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_OT, n2080.getN2082Ot());
        values.put(N2080_N2107.sub_N2080_N2107.N2082_OTx, n2080.getN2082OTx());
        values.put(N2080_N2107.sub_N2080_N2107.N2083, n2080.getN2083());
        values.put(N2080_N2107.sub_N2080_N2107.N2084, n2080.getN2084());
        values.put(N2080_N2107.sub_N2080_N2107.N2085, n2080.getN2085());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_1, n2080.getN20861());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_2, n2080.getN20862());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_3, n2080.getN20863());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_4, n2080.getN20864());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_4x, n2080.getN20864x());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_5, n2080.getN20865());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_6, n2080.getN20866());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_7, n2080.getN20867());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_8, n2080.getN20868());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_9, n2080.getN20869());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_10, n2080.getN208610());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_11, n2080.getN208611());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_12, n2080.getN208612());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_OT, n2080.getN2086Ot());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_OTx, n2080.getN2086OTx());
        values.put(N2080_N2107.sub_N2080_N2107.N2086_DK, n2080.getN2086Dk());
        values.put(N2080_N2107.sub_N2080_N2107.N2087, n2080.getN2087());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_1, n2080.getN20881());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_2, n2080.getN20882());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_3, n2080.getN20883());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_4, n2080.getN20884());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_5, n2080.getN20885());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_6, n2080.getN20886());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_7, n2080.getN20887());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_8, n2080.getN20888());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_9, n2080.getN20889());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_10, n2080.getN208810());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_11, n2080.getN208811());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_12, n2080.getN208812());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_13, n2080.getN208813());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_14, n2080.getN208814());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_15, n2080.getN208815());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_16, n2080.getN208816());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_17, n2080.getN208817());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_18, n2080.getN208818());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_18x, n2080.getN208818x());
        values.put(N2080_N2107.sub_N2080_N2107.N2088_19, n2080.getN208819());
        values.put(N2080_N2107.sub_N2080_N2107.N2089, n2080.getN2089());
        values.put(N2080_N2107.sub_N2080_N2107.N2089x, n2080.getN2089x());
        values.put(N2080_N2107.sub_N2080_N2107.N2090, n2080.getN2090());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_1, n2080.getN20911());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_2, n2080.getN20912());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_3, n2080.getN20913());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_4, n2080.getN20914());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_5, n2080.getN20915());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_6, n2080.getN20916());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_OT, n2080.getN2091Ot());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_OTx, n2080.getN2091OTx());
        values.put(N2080_N2107.sub_N2080_N2107.N2091_DK, n2080.getN2091Dk());
        values.put(N2080_N2107.sub_N2080_N2107.N2092, n2080.getN2092());
        values.put(N2080_N2107.sub_N2080_N2107.N2092x, n2080.getN2092x());
        values.put(N2080_N2107.sub_N2080_N2107.N2093, n2080.getN2093());
        values.put(N2080_N2107.sub_N2080_N2107.N2093x, n2080.getN2093x());
        values.put(N2080_N2107.sub_N2080_N2107.N2094, n2080.getN2094());
        values.put(N2080_N2107.sub_N2080_N2107.N2095, n2080.getN2095());
        values.put(N2080_N2107.sub_N2080_N2107.N2096, n2080.getN2096());
        values.put(N2080_N2107.sub_N2080_N2107.N2097_1, n2080.getN20971());
        values.put(N2080_N2107.sub_N2080_N2107.N2097_2, n2080.getN20972());
        values.put(N2080_N2107.sub_N2080_N2107.N2097_3, n2080.getN20973());
        values.put(N2080_N2107.sub_N2080_N2107.N2098, n2080.getN2098());
        values.put(N2080_N2107.sub_N2080_N2107.N2098x, n2080.getN2098x());
        values.put(N2080_N2107.sub_N2080_N2107.N2099, n2080.getN2099());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_1, n2080.getN21001());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_2, n2080.getN21002());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_3, n2080.getN21003());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_4, n2080.getN21004());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_5, n2080.getN21005());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_6, n2080.getN21006());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_7, n2080.getN2100Ot());
        values.put(N2080_N2107.sub_N2080_N2107.N2100_DK, n2080.getN2100Dk());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_1, n2080.getN21011());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_2, n2080.getN21012());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_3, n2080.getN21013());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_4, n2080.getN21014());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_5, n2080.getN21015());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_6, n2080.getN21016());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_7, n2080.getN21017());
        values.put(N2080_N2107.sub_N2080_N2107.N2101_DK, n2080.getN2101Dk());
        values.put(N2080_N2107.sub_N2080_N2107.N2102, n2080.getN2102());
        values.put(N2080_N2107.sub_N2080_N2107.N2103_1, n2080.getN21031());
        values.put(N2080_N2107.sub_N2080_N2107.N2103_2, n2080.getN21032());
        values.put(N2080_N2107.sub_N2080_N2107.N2104, n2080.getN2104());
        values.put(N2080_N2107.sub_N2080_N2107.N2105, n2080.getN2105());
        values.put(N2080_N2107.sub_N2080_N2107.N2106, n2080.getN2106());
        values.put(N2080_N2107.sub_N2080_N2107.N2107_1, n2080.getN21071());
        values.put(N2080_N2107.sub_N2080_N2107.N2107_2, n2080.getN21072());
        values.put(N2080_N2107.sub_N2080_N2107.N2107_3, n2080.getN21073());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2080_N2107.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2110
    public Long add_N2110(N2110_N2189a n2110) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2110_N2189a.sub_N2110_N2189a.N2110, n2110.getN2110());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2110x, n2110.getN2110x());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2111, n2110.getN2111());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2111x, n2110.getN2111x());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2112, n2110.getN2112());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_1, n2110.getN21131());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_2, n2110.getN21132());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_3, n2110.getN21133());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_4, n2110.getN21134());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_OT, n2110.getN2113Ot());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_OTx, n2110.getN2113OTx());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2113_DK, n2110.getN2113Dk());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2114, n2110.getN2114());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2115, n2110.getN2115());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2116_1, n2110.getN21161());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2116_2, n2110.getN21162());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2116_3, n2110.getN21163());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2117, n2110.getN2117());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2118, n2110.getN2118());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2119, n2110.getN2119());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2120, n2110.getN2120());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2121, n2110.getN2121());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2122, n2110.getN2122());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2123, n2110.getN2123());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2124, n2110.getN2124());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2125, n2110.getN2125());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2126, n2110.getN2126());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2127, n2110.getN2127());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2127h, n2110.getN2127h());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2128, n2110.getN2128());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2129, n2110.getN2129());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2130, n2110.getN2130());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2131, n2110.getN2131());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2132, n2110.getN2132());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2133, n2110.getN2133());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2133h, n2110.getN2133h());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2133d, n2110.getN2133d());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2134, n2110.getN2134());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_1, n2110.getN21351());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_2, n2110.getN21352());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_3, n2110.getN21353());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_4, n2110.getN21354());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_5, n2110.getN21355());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_6, n2110.getN21356());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_7, n2110.getN21357());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_8, n2110.getN21358());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_9, n2110.getN21359());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_10, n2110.getN213510());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_11, n2110.getN213511());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2135_11x, n2110.getN213511x());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2136, n2110.getN2136());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2137, n2110.getN2137());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2138, n2110.getN2138());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2139, n2110.getN2139());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2140, n2110.getN2140());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2141, n2110.getN2141());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2142, n2110.getN2142());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2143, n2110.getN2143());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2144, n2110.getN2144());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2145, n2110.getN2145());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2146, n2110.getN2146());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2147, n2110.getN2147());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2148, n2110.getN2148());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2149, n2110.getN2149());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2150, n2110.getN2150());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2151, n2110.getN2151());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2152, n2110.getN2152());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2153, n2110.getN2153());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2154, n2110.getN2154());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2155, n2110.getN2155());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2156, n2110.getN2156());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2157, n2110.getN2157());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2158, n2110.getN2158());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2159, n2110.getN2159());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2160, n2110.getN2160());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2161, n2110.getN2161());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2162, n2110.getN2162());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2163, n2110.getN2163());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2164, n2110.getN2164());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2165, n2110.getN2165());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2166, n2110.getN2166());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2166_1, n2110.getN21661());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2167, n2110.getN2167());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2168, n2110.getN2168());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2169, n2110.getN2169());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2170, n2110.getN2170());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2171, n2110.getN2171());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2172, n2110.getN2172());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2173, n2110.getN2173());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2174, n2110.getN2174());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2175, n2110.getN2175());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2176, n2110.getN2176());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2177, n2110.getN2177());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2177A, n2110.getN2177A());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2178, n2110.getN2178());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2179, n2110.getN2179());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2180, n2110.getN2180());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2181, n2110.getN2181());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2182, n2110.getN2182());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2183, n2110.getN2183());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2184, n2110.getN2184());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2185, n2110.getN2185());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2186, n2110.getN2186());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2187, n2110.getN2187());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2188, n2110.getN2188());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2189, n2110.getN2189());
        values.put(N2110_N2189a.sub_N2110_N2189a.N2189A, n2110.getN2189A());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2110_N2189a.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2190
    public Long add_N2190(N2190_N2191 n2190) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2190_N2191.sub_N2190_N2191.N2190, n2190.getN2190());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_1, n2190.getN21901());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_2, n2190.getN21902());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_3, n2190.getN21903());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_4, n2190.getN21904());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_5, n2190.getN21905());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_6, n2190.getN21906());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_7, n2190.getN21907());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_8, n2190.getN21908());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_9, n2190.getN21909());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_10, n2190.getN219010());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_11, n2190.getN219011());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_12, n2190.getN219012());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_13, n2190.getN219013());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_14, n2190.getN219014());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_15, n2190.getN219015());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_16, n2190.getN219016());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_17, n2190.getN219017());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_18, n2190.getN219018());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_19, n2190.getN219019());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_20, n2190.getN219020());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_21, n2190.getN219021());
        values.put(N2190_N2191.sub_N2190_N2191.N2190_22, n2190.getN219022());
        values.put(N2190_N2191.sub_N2190_N2191.N2191_1, n2190.getN21911());
        values.put(N2190_N2191.sub_N2190_N2191.N2191_2, n2190.getN21912());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2190_N2191.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2192
    public Long add_N2192(N2192_N2202 n2192) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2192_N2202.sub_N2192_N2202.N2192, n2192.getN2192());
        values.put(N2192_N2202.sub_N2192_N2202.N2193, n2192.getN2193());
        values.put(N2192_N2202.sub_N2192_N2202.N2194_1, n2192.getN2194_1());
        values.put(N2192_N2202.sub_N2192_N2202.N2194_2, n2192.getN2194_2());
        values.put(N2192_N2202.sub_N2192_N2202.N2195, n2192.getN2195());
        values.put(N2192_N2202.sub_N2192_N2202.N2196, n2192.getN2196());
        values.put(N2192_N2202.sub_N2192_N2202.N2197, n2192.getN2197());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_1, n2192.getN2198_1());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_1_T, n2192.getN2198_1_T());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_1_FV, n2192.getN2198_1_FV());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_2, n2192.getN2198_2());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_2_T, n2192.getN2198_2_T());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_2_FV, n2192.getN2198_2_FV());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_3, n2192.getN2198_3());
        values.put(N2192_N2202.sub_N2192_N2202.N2198_DK, n2192.getN2198_DK());
        values.put(N2192_N2202.sub_N2192_N2202.N2199, n2192.getN2199());
        values.put(N2192_N2202.sub_N2192_N2202.N2200, n2192.getN2200());
        values.put(N2192_N2202.sub_N2192_N2202.N2201, n2192.getN2201());

        values.put(N2192_N2202.sub_N2192_N2202.N2202_1, n2192.getN2202_1());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_1_T, n2192.getN2202_1_T());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_1_FV, n2192.getN2202_1_FV());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_2, n2192.getN2202_2());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_2_T, n2192.getN2202_2_T());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_2_FV, n2192.getN2202_2_FV());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_3, n2192.getN2202_3());
        values.put(N2192_N2202.sub_N2192_N2202.N2202_DK, n2192.getN2202_DK());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2192_N2202.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2211A
    public Long add_N2211_A_C(N2211_N2248_A_C n2211A) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2211_1, n2211A.getN22111());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2211_2, n2211A.getN22112());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2212, n2211A.getN2212());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2211_N2248_A_C.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2211B
    public Long add_N2211_B(N2211_N2248_B n2211B) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2211_N2248_B.sub_N2211_N2248_B.N2213, n2211B.getN2213());
        values.put(N2211_N2248_B.sub_N2211_N2248_B.N2213_2A, n2211B.getN22132A());
        values.put(N2211_N2248_B.sub_N2211_N2248_B.N2213_4, n2211B.getN22134());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2211_N2248_B.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2211C
    public Long update_N2211C(N2211_N2248_A_C n2211C, int id) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2214, n2211C.getN2214());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2215, n2211C.getN2215());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_1, n2211C.getN22161());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_2, n2211C.getN22162());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_3, n2211C.getN22163());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_4, n2211C.getN22164());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_5, n2211C.getN22165());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_6, n2211C.getN22166());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_7, n2211C.getN22167());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_8, n2211C.getN22168());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_9, n2211C.getN22169());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_10, n2211C.getN221610());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_11, n2211C.getN221611());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_12, n2211C.getN221612());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_OT, n2211C.getN2216Ot());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2216_DK, n2211C.getN2216Dk());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2217_1, n2211C.getN22171());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2217_2, n2211C.getN22172());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2217_3, n2211C.getN22173());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2218_1, n2211C.getN22181());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2218_2, n2211C.getN22182());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2219, n2211C.getN2219());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2219_2, n2211C.getN22192());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2220, n2211C.getN2220());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2221_1, n2211C.getN22211());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2221_2, n2211C.getN22212());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2222, n2211C.getN2222());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2223, n2211C.getN2223());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2224, n2211C.getN2224());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2224_2, n2211C.getN22242());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2225_1, n2211C.getN22251());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2225_2, n2211C.getN22252());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2226, n2211C.getN2226());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2227_1, n2211C.getN22271());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2227_2, n2211C.getN22272());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2228_1, n2211C.getN22281());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2228_2, n2211C.getN22282());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2229, n2211C.getN2229());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2229_2, n2211C.getN22292());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2230, n2211C.getN2230());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2231_1, n2211C.getN22311());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2231_2, n2211C.getN22312());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2232, n2211C.getN2232());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2233, n2211C.getN2233());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2234, n2211C.getN2234());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2234_2, n2211C.getN22342());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2235_1, n2211C.getN22351());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2235_2, n2211C.getN22352());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2236, n2211C.getN2236());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2237_1, n2211C.getN22371());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2237_2, n2211C.getN22372());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2238, n2211C.getN2238());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2239, n2211C.getN2239());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_1, n2211C.getN22401());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_2, n2211C.getN22402());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_3, n2211C.getN22403());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_4, n2211C.getN22404());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_5, n2211C.getN22405());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_6, n2211C.getN22406());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_7, n2211C.getN22407());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_8, n2211C.getN22408());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_9, n2211C.getN22409());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_10, n2211C.getN224010());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_11, n2211C.getN224011());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_12, n2211C.getN224012());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_13, n2211C.getN224013());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_14, n2211C.getN224014());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_15, n2211C.getN224015());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_OT, n2211C.getN2240Ot());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2240_DK, n2211C.getN2240Dk());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2241, n2211C.getN2241());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_1, n2211C.getN22421());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_2, n2211C.getN22422());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_3, n2211C.getN22423());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_4, n2211C.getN22424());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_5, n2211C.getN22425());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_6, n2211C.getN22426());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_OT, n2211C.getN2242Ot());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2242_DK, n2211C.getN2242Dk());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_1, n2211C.getN22431());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_2, n2211C.getN22432());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_3, n2211C.getN22433());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_4, n2211C.getN22434());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_5, n2211C.getN22435());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_OT, n2211C.getN2243Ot());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_7, n2211C.getN22437());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2243_DK, n2211C.getN2243Dk());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2244, n2211C.getN2244());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2245, n2211C.getN2245());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2246, n2211C.getN2246());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2247, n2211C.getN2247());
        values.put(N2211_N2248_A_C.sub_N2211_N2248_A_C.N2248, n2211C.getN2248());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;

        newRowId = db.update(data.N.N2211_N2248_A_C.TABLE_NAME,
                values,
                "id = ?",
                new String[]{String.valueOf(id)});

        return newRowId;
    }

    //2251
    public Long add_N2251(N2251_N2260 n2251) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2251_N2260.sub_N2251_N2260.N2251, n2251.getN2251());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_1, n2251.getN22521());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_2, n2251.getN22522());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_3, n2251.getN22523());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_4, n2251.getN22524());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_5, n2251.getN22525());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_6, n2251.getN22526());
        values.put(N2251_N2260.sub_N2251_N2260.N2252_7, n2251.getN22527());
        values.put(N2251_N2260.sub_N2251_N2260.N2253, n2251.getN2253());
        values.put(N2251_N2260.sub_N2251_N2260.N2254, n2251.getN2254());
        values.put(N2251_N2260.sub_N2251_N2260.N2255_1CHECK, n2251.getN22551check());
        values.put(N2251_N2260.sub_N2251_N2260.N2255_1, n2251.getN22551());
        values.put(N2251_N2260.sub_N2251_N2260.N2255_2CHECK, n2251.getN22552check());
        values.put(N2251_N2260.sub_N2251_N2260.N2255_2, n2251.getN22552());
        values.put(N2251_N2260.sub_N2251_N2260.N2256, n2251.getN2256());
        values.put(N2251_N2260.sub_N2251_N2260.N2257, n2251.getN2257());
        values.put(N2251_N2260.sub_N2251_N2260.N2258, n2251.getN2258());
        values.put(N2251_N2260.sub_N2251_N2260.N2259, n2251.getN2259());
        values.put(N2251_N2260.sub_N2251_N2260.N2260, n2251.getN2260());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2251_N2260.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2271
    public Long add_N2271(N2271_N2284 n2271) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2271_N2284.sub_N2271_N2284.N2271, n2271.getN2271());
        values.put(N2271_N2284.sub_N2271_N2284.N2272, n2271.getN2272());
        values.put(N2271_N2284.sub_N2271_N2284.N2273, n2271.getN2273());
        values.put(N2271_N2284.sub_N2271_N2284.N2274, n2271.getN2274());
        values.put(N2271_N2284.sub_N2271_N2284.N2275, n2271.getN2275());
        values.put(N2271_N2284.sub_N2271_N2284.N2276, n2271.getN2276());
        values.put(N2271_N2284.sub_N2271_N2284.N2277, n2271.getN2277());
        values.put(N2271_N2284.sub_N2271_N2284.N2278, n2271.getN2278());
        values.put(N2271_N2284.sub_N2271_N2284.N2283, n2271.getN2283());
        values.put(N2271_N2284.sub_N2271_N2284.N2284, n2271.getN2284());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2271_N2284.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2291
    public Long add_N2291(N2291_N2304 n2291) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2291_N2304.sub_N2291_N2304.N2291, n2291.getN2291());
        values.put(N2291_N2304.sub_N2291_N2304.N2292, n2291.getN2292());
        values.put(N2291_N2304.sub_N2291_N2304.N2293, n2291.getN2293());
        values.put(N2291_N2304.sub_N2291_N2304.N2294, n2291.getN2294());
        values.put(N2291_N2304.sub_N2291_N2304.N2295, n2291.getN2295());
        values.put(N2291_N2304.sub_N2291_N2304.N2296, n2291.getN2296());
        values.put(N2291_N2304.sub_N2291_N2304.N2297, n2291.getN2297());
        values.put(N2291_N2304.sub_N2291_N2304.N2298, n2291.getN2298());
        values.put(N2291_N2304.sub_N2291_N2304.N2299, n2291.getN2299());
        values.put(N2291_N2304.sub_N2291_N2304.N2300, n2291.getN2300());
        values.put(N2291_N2304.sub_N2291_N2304.N2301, n2291.getN2301());
        values.put(N2291_N2304.sub_N2291_N2304.N2301x, n2291.getN2301x());
        values.put(N2291_N2304.sub_N2291_N2304.N2302_1, n2291.getN2302_1());
        values.put(N2291_N2304.sub_N2291_N2304.N2302_2, n2291.getN2302_2());
        values.put(N2291_N2304.sub_N2291_N2304.N2303, n2291.getN2303());
        values.put(N2291_N2304.sub_N2291_N2304.N2304_1, n2291.getN2304_1());
        values.put(N2291_N2304.sub_N2291_N2304.N2304_2, n2291.getN2304_2());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2291_N2304.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2311
    public Long add_N2311(N2311_N2317 n2311) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2311_N2317.sub_N2311_N2317.N2311, n2311.getN2311());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_1, n2311.getN23111());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_2, n2311.getN23112());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_3, n2311.getN23113());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_4, n2311.getN23114());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_5, n2311.getN23115());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_6, n2311.getN23116());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_7, n2311.getN23117());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_8, n2311.getN23118());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_9, n2311.getN23119());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_10, n2311.getN231110());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_11, n2311.getN231111());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_12, n2311.getN231112());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_13, n2311.getN231113());
        values.put(N2311_N2317.sub_N2311_N2317.N2311_13x, n2311.getN231113x());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_1, n2311.getN23121());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_2, n2311.getN23122());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_3, n2311.getN23123());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_4, n2311.getN23124());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_5, n2311.getN23125());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_6, n2311.getN23126());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_7, n2311.getN23127());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_8, n2311.getN23128());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_9, n2311.getN23129());
        values.put(N2311_N2317.sub_N2311_N2317.N2312_9x, n2311.getN23129x());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_1, n2311.getN23131());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_2, n2311.getN23132());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_3, n2311.getN23133());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_4, n2311.getN23134());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_5, n2311.getN23135());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_6, n2311.getN23136());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_7, n2311.getN23137());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_8, n2311.getN23138());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_9, n2311.getN23139());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_10, n2311.getN231310());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_11, n2311.getN231311());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_12, n2311.getN231312());
        values.put(N2311_N2317.sub_N2311_N2317.N2313_12x, n2311.getN231312x());
        values.put(N2311_N2317.sub_N2311_N2317.N2314, n2311.getN2314());
        values.put(N2311_N2317.sub_N2311_N2317.N2315, n2311.getN2315());
        values.put(N2311_N2317.sub_N2311_N2317.N2316, n2311.getN2316());
        values.put(N2311_N2317.sub_N2311_N2317.N2317, n2311.getN2317());
        values.put(N2311_N2317.sub_N2311_N2317.STUDYID, n2311.getSTUDYID());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2311_N2317.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2321
    public Long add_N2321(N2321_N2322 n2321) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2321_N2322.sub_N2321_N2322.N2321, n2321.getN2321());
        values.put(N2321_N2322.sub_N2321_N2322.N2322, n2321.getN2322());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2321_N2322.TABLE_NAME,
                null,
                values);

        return newRowId;
    }


}
