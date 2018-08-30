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
    public Long add_N2001(N2001_N2011 n2001, Context context) {

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
        values.put(N2001_N2011.sub_N2001_N2011.N2008, n2001.getN2008());
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

        values.put(N2012_N2016.N2012, N2012_N2016.getN2012());
        values.put(N2012_N2016.N2013, N2012_N2016.getN2013());
        values.put(N2012_N2016.N2014, N2012_N2016.getN2014());
        values.put(N2012_N2016.N2015, N2012_N2016.getN2015());
        values.put(N2012_N2016.N2016, N2012_N2016.getN2016());

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

        values.put(N2017_N2022_3.N2017, N2017_N2022_3.getN2017());
        values.put(N2017_N2022_3.N2018, N2017_N2022_3.getN2018());
        values.put(N2017_N2022_3.N2019u, N2017_N2022_3.getN2019u());
        values.put(N2017_N2022_3.N2019h, N2017_N2022_3.getN2019h());
        values.put(N2017_N2022_3.N2019d, N2017_N2022_3.getN2019d());
        values.put(N2017_N2022_3.N2020, N2017_N2022_3.getN2020());
        values.put(N2017_N2022_3.N2021, N2017_N2022_3.getN2021());
        values.put(N2017_N2022_3.N2022, N2017_N2022_3.getN2022());
        values.put(N2017_N2022_3.N2022_1, N2017_N2022_3.getN20221());
        values.put(N2017_N2022_3.N2022_2, N2017_N2022_3.getN20222());
        values.put(N2017_N2022_3.N2022_3, N2017_N2022_3.getN20223());

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

        values.put(N2023_N2026.N2023, N2023_N2026.getN2023());
        values.put(N2023_N2026.N2024, N2023_N2026.getN2024());
        values.put(N2023_N2026.N2024_1, N2023_N2026.getN20241());
        values.put(N2023_N2026.N2025U, N2023_N2026.getN2025U());
        values.put(N2023_N2026.N2025D, N2023_N2026.getN2025D());
        values.put(N2023_N2026.N2026, N2023_N2026.getN2026());

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

        values.put(N2051_N2078.N2051, N2051_N2078.getN2051());
        values.put(N2051_N2078.N2052, N2051_N2078.getN2052());
        values.put(N2051_N2078.N2053, N2051_N2078.getN2053());
        values.put(N2051_N2078.N2054, N2051_N2078.getN2054());
        values.put(N2051_N2078.N2055, N2051_N2078.getN2055());
        values.put(N2051_N2078.N2056, N2051_N2078.getN2056());
        values.put(N2051_N2078.N2057, N2051_N2078.getN2057());
        values.put(N2051_N2078.N2058, N2051_N2078.getN2058());
        values.put(N2051_N2078.N2059, N2051_N2078.getN2059());
        values.put(N2051_N2078.N2060, N2051_N2078.getN2060());
        values.put(N2051_N2078.N2061, N2051_N2078.getN2061());
        values.put(N2051_N2078.N2062, N2051_N2078.getN2062());
        values.put(N2051_N2078.N2063, N2051_N2078.getN2063());
        values.put(N2051_N2078.N2064, N2051_N2078.getN2064());
        values.put(N2051_N2078.N2065, N2051_N2078.getN2065());
        values.put(N2051_N2078.N2066, N2051_N2078.getN2066());
        values.put(N2051_N2078.N2067, N2051_N2078.getN2067());
        values.put(N2051_N2078.N2068, N2051_N2078.getN2068());
        values.put(N2051_N2078.N2069_1, N2051_N2078.getN20691());
        values.put(N2051_N2078.N2069_2, N2051_N2078.getN20692());
        values.put(N2051_N2078.N2069_3, N2051_N2078.getN20693());
        values.put(N2051_N2078.N2070, N2051_N2078.getN2070());
        values.put(N2051_N2078.N2071, N2051_N2078.getN2071());
        values.put(N2051_N2078.N2072, N2051_N2078.getN2072());
        values.put(N2051_N2078.N2073, N2051_N2078.getN2073());
        values.put(N2051_N2078.N2074, N2051_N2078.getN2074());
        values.put(N2051_N2078.N2075, N2051_N2078.getN2075());
        values.put(N2051_N2078.N2076, N2051_N2078.getN2076());
        values.put(N2051_N2078.N2077, N2051_N2078.getN2077());
        values.put(N2051_N2078.N2078, N2051_N2078.getN2078());

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

        values.put(N2080_N2107.N2080_1, N2080_N2107.getN20801());
        values.put(N2080_N2107.N2080_2, N2080_N2107.getN20802());
        values.put(N2080_N2107.N2080_3, N2080_N2107.getN20803());
        values.put(N2080_N2107.N2080_4, N2080_N2107.getN20804());
        values.put(N2080_N2107.N2080_5, N2080_N2107.getN20805());
        values.put(N2080_N2107.N2080_6, N2080_N2107.getN20806());
        values.put(N2080_N2107.N2080_7, N2080_N2107.getN20807());
        values.put(N2080_N2107.N2080_8, N2080_N2107.getN20808());
        values.put(N2080_N2107.N2080_9, N2080_N2107.getN20809());
        values.put(N2080_N2107.N2080_10, N2080_N2107.getN208010());
        values.put(N2080_N2107.N2080_11, N2080_N2107.getN208011());
        values.put(N2080_N2107.N2080_12, N2080_N2107.getN208012());
        values.put(N2080_N2107.N2080_13, N2080_N2107.getN208013());
        values.put(N2080_N2107.N2080_14, N2080_N2107.getN208014());
        values.put(N2080_N2107.N2080_15, N2080_N2107.getN208015());
        values.put(N2080_N2107.N2081, N2080_N2107.getN2081());
        values.put(N2080_N2107.N2082, N2080_N2107.getN2082());
        values.put(N2080_N2107.N2083, N2080_N2107.getN2083());
        values.put(N2080_N2107.N2084, N2080_N2107.getN2084());
        values.put(N2080_N2107.N2085, N2080_N2107.getN2085());
        values.put(N2080_N2107.N2086, N2080_N2107.getN2086());
        values.put(N2080_N2107.N2087, N2080_N2107.getN2087());
        values.put(N2080_N2107.N2088_1, N2080_N2107.getN20881());
        values.put(N2080_N2107.N2088_2, N2080_N2107.getN20882());
        values.put(N2080_N2107.N2088_3, N2080_N2107.getN20883());
        values.put(N2080_N2107.N2088_4, N2080_N2107.getN20884());
        values.put(N2080_N2107.N2088_5, N2080_N2107.getN20885());
        values.put(N2080_N2107.N2088_6, N2080_N2107.getN20886());
        values.put(N2080_N2107.N2088_7, N2080_N2107.getN20887());
        values.put(N2080_N2107.N2088_8, N2080_N2107.getN20888());
        values.put(N2080_N2107.N2088_9, N2080_N2107.getN20889());
        values.put(N2080_N2107.N2088_10, N2080_N2107.getN208810());
        values.put(N2080_N2107.N2088_11, N2080_N2107.getN208811());
        values.put(N2080_N2107.N2088_12, N2080_N2107.getN208812());
        values.put(N2080_N2107.N2088_13, N2080_N2107.getN208813());
        values.put(N2080_N2107.N2088_14, N2080_N2107.getN208814());
        values.put(N2080_N2107.N2088_15, N2080_N2107.getN208815());
        values.put(N2080_N2107.N2089, N2080_N2107.getN2089());
        values.put(N2080_N2107.N2090, N2080_N2107.getN2090());
        values.put(N2080_N2107.N2091, N2080_N2107.getN2091());
        values.put(N2080_N2107.N2092, N2080_N2107.getN2092());
        values.put(N2080_N2107.N2093, N2080_N2107.getN2093());
        values.put(N2080_N2107.N2094, N2080_N2107.getN2094());
        values.put(N2080_N2107.N2095, N2080_N2107.getN2095());
        values.put(N2080_N2107.N2096, N2080_N2107.getN2096());
        values.put(N2080_N2107.N2097, N2080_N2107.getN2097());
        values.put(N2080_N2107.N2098, N2080_N2107.getN2098());
        values.put(N2080_N2107.N2099, N2080_N2107.getN2099());
        values.put(N2080_N2107.N2100, N2080_N2107.getN2100());
        values.put(N2080_N2107.N2101, N2080_N2107.getN2101());
        values.put(N2080_N2107.N2102, N2080_N2107.getN2102());
        values.put(N2080_N2107.N2103, N2080_N2107.getN2103());
        values.put(N2080_N2107.N2104, N2080_N2107.getN2104());
        values.put(N2080_N2107.N2105, N2080_N2107.getN2105());
        values.put(N2080_N2107.N2106, N2080_N2107.getN2106());
        values.put(N2080_N2107.N2107_1, N2080_N2107.getN21071());
        values.put(N2080_N2107.N2107_2, N2080_N2107.getN21072());
        values.put(N2080_N2107.N2107_3, N2080_N2107.getN21073());

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

        values.put(N2110_N2189a.N2110, N2110_N2189a.getN2110());
        values.put(N2110_N2189a.N2111, N2110_N2189a.getN2111());
        values.put(N2110_N2189a.N2112, N2110_N2189a.getN2112());
        values.put(N2110_N2189a.N2113, N2110_N2189a.getN2113());
        values.put(N2110_N2189a.N2114, N2110_N2189a.getN2114());
        values.put(N2110_N2189a.N2115, N2110_N2189a.getN2115());
        values.put(N2110_N2189a.N2116_1, N2110_N2189a.getN21161());
        values.put(N2110_N2189a.N2116_2, N2110_N2189a.getN21162());
        values.put(N2110_N2189a.N2116_3, N2110_N2189a.getN21163());
        values.put(N2110_N2189a.N2117, N2110_N2189a.getN2117());
        values.put(N2110_N2189a.N2118, N2110_N2189a.getN2118());
        values.put(N2110_N2189a.N2119, N2110_N2189a.getN2119());
        values.put(N2110_N2189a.N2120, N2110_N2189a.getN2120());
        values.put(N2110_N2189a.N2121, N2110_N2189a.getN2121());
        values.put(N2110_N2189a.N2122, N2110_N2189a.getN2122());
        values.put(N2110_N2189a.N2123, N2110_N2189a.getN2123());
        values.put(N2110_N2189a.N2124, N2110_N2189a.getN2124());
        values.put(N2110_N2189a.N2125, N2110_N2189a.getN2125());
        values.put(N2110_N2189a.N2126, N2110_N2189a.getN2126());
        values.put(N2110_N2189a.N2127, N2110_N2189a.getN2127());
        values.put(N2110_N2189a.N2128, N2110_N2189a.getN2128());
        values.put(N2110_N2189a.N2129, N2110_N2189a.getN2129());
        values.put(N2110_N2189a.N2130, N2110_N2189a.getN2130());
        values.put(N2110_N2189a.N2131, N2110_N2189a.getN2131());
        values.put(N2110_N2189a.N2132, N2110_N2189a.getN2132());
        values.put(N2110_N2189a.N2133, N2110_N2189a.getN2133());
        values.put(N2110_N2189a.N2134, N2110_N2189a.getN2134());
        values.put(N2110_N2189a.N2135, N2110_N2189a.getN2135());
        values.put(N2110_N2189a.N2136, N2110_N2189a.getN2136());
        values.put(N2110_N2189a.N2137, N2110_N2189a.getN2137());
        values.put(N2110_N2189a.N2138, N2110_N2189a.getN2138());
        values.put(N2110_N2189a.N2139, N2110_N2189a.getN2139());
        values.put(N2110_N2189a.N2140, N2110_N2189a.getN2140());
        values.put(N2110_N2189a.N2141, N2110_N2189a.getN2141());
        values.put(N2110_N2189a.N2142, N2110_N2189a.getN2142());
        values.put(N2110_N2189a.N2143, N2110_N2189a.getN2143());
        values.put(N2110_N2189a.N2144, N2110_N2189a.getN2144());
        values.put(N2110_N2189a.N2145, N2110_N2189a.getN2145());
        values.put(N2110_N2189a.N2146, N2110_N2189a.getN2146());
        values.put(N2110_N2189a.N2147, N2110_N2189a.getN2147());
        values.put(N2110_N2189a.N2148, N2110_N2189a.getN2148());
        values.put(N2110_N2189a.N2149, N2110_N2189a.getN2149());
        values.put(N2110_N2189a.N2150, N2110_N2189a.getN2150());
        values.put(N2110_N2189a.N2151, N2110_N2189a.getN2151());
        values.put(N2110_N2189a.N2152, N2110_N2189a.getN2152());
        values.put(N2110_N2189a.N2153, N2110_N2189a.getN2153());
        values.put(N2110_N2189a.N2154, N2110_N2189a.getN2154());
        values.put(N2110_N2189a.N2155, N2110_N2189a.getN2155());
        values.put(N2110_N2189a.N2156, N2110_N2189a.getN2156());
        values.put(N2110_N2189a.N2157, N2110_N2189a.getN2157());
        values.put(N2110_N2189a.N2158, N2110_N2189a.getN2158());
        values.put(N2110_N2189a.N2159, N2110_N2189a.getN2159());
        values.put(N2110_N2189a.N2160, N2110_N2189a.getN2160());
        values.put(N2110_N2189a.N2161, N2110_N2189a.getN2161());
        values.put(N2110_N2189a.N2162, N2110_N2189a.getN2162());
        values.put(N2110_N2189a.N2163, N2110_N2189a.getN2163());
        values.put(N2110_N2189a.N2164, N2110_N2189a.getN2164());
        values.put(N2110_N2189a.N2165, N2110_N2189a.getN2165());
        values.put(N2110_N2189a.N2166, N2110_N2189a.getN2166());
        values.put(N2110_N2189a.N2166_1, N2110_N2189a.getN21661());
        values.put(N2110_N2189a.N2167, N2110_N2189a.getN2167());
        values.put(N2110_N2189a.N2168, N2110_N2189a.getN2168());
        values.put(N2110_N2189a.N2169, N2110_N2189a.getN2169());
        values.put(N2110_N2189a.N2170, N2110_N2189a.getN2170());
        values.put(N2110_N2189a.N2171, N2110_N2189a.getN2171());
        values.put(N2110_N2189a.N2172, N2110_N2189a.getN2172());
        values.put(N2110_N2189a.N2173, N2110_N2189a.getN2173());
        values.put(N2110_N2189a.N2174, N2110_N2189a.getN2174());
        values.put(N2110_N2189a.N2175, N2110_N2189a.getN2175());
        values.put(N2110_N2189a.N2176, N2110_N2189a.getN2176());
        values.put(N2110_N2189a.N2177, N2110_N2189a.getN2177());
        values.put(N2110_N2189a.N2177A, N2110_N2189a.getN2177A());
        values.put(N2110_N2189a.N2178, N2110_N2189a.getN2178());
        values.put(N2110_N2189a.N2179, N2110_N2189a.getN2179());
        values.put(N2110_N2189a.N2180, N2110_N2189a.getN2180());
        values.put(N2110_N2189a.N2181, N2110_N2189a.getN2181());
        values.put(N2110_N2189a.N2182, N2110_N2189a.getN2182());
        values.put(N2110_N2189a.N2183, N2110_N2189a.getN2183());
        values.put(N2110_N2189a.N2184, N2110_N2189a.getN2184());
        values.put(N2110_N2189a.N2185, N2110_N2189a.getN2185());
        values.put(N2110_N2189a.N2186, N2110_N2189a.getN2186());
        values.put(N2110_N2189a.N2187, N2110_N2189a.getN2187());
        values.put(N2110_N2189a.N2188, N2110_N2189a.getN2188());
        values.put(N2110_N2189a.N2189, N2110_N2189a.getN2189());
        values.put(N2110_N2189a.N2189A, N2110_N2189a.getN2189A());

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

        values.put(N2190_N2191.N2190, N2190_N2191.getN2190());
        values.put(N2190_N2191.N2190_1, N2190_N2191.getN21901());
        values.put(N2190_N2191.N2190_2, N2190_N2191.getN21902());
        values.put(N2190_N2191.N2190_3, N2190_N2191.getN21903());
        values.put(N2190_N2191.N2190_4, N2190_N2191.getN21904());
        values.put(N2190_N2191.N2190_5, N2190_N2191.getN21905());
        values.put(N2190_N2191.N2190_6, N2190_N2191.getN21906());
        values.put(N2190_N2191.N2190_7, N2190_N2191.getN21907());
        values.put(N2190_N2191.N2190_8, N2190_N2191.getN21908());
        values.put(N2190_N2191.N2190_9, N2190_N2191.getN21909());
        values.put(N2190_N2191.N2190_10, N2190_N2191.getN219010());
        values.put(N2190_N2191.N2190_11, N2190_N2191.getN219011());
        values.put(N2190_N2191.N2190_12, N2190_N2191.getN219012());
        values.put(N2190_N2191.N2190_13, N2190_N2191.getN219013());
        values.put(N2190_N2191.N2190_14, N2190_N2191.getN219014());
        values.put(N2190_N2191.N2190_15, N2190_N2191.getN219015());
        values.put(N2190_N2191.N2190_16, N2190_N2191.getN219016());
        values.put(N2190_N2191.N2190_17, N2190_N2191.getN219017());
        values.put(N2190_N2191.N2190_18, N2190_N2191.getN219018());
        values.put(N2190_N2191.N2190_19, N2190_N2191.getN219019());
        values.put(N2190_N2191.N2190_20, N2190_N2191.getN219020());
        values.put(N2190_N2191.N2190_21, N2190_N2191.getN219021());
        values.put(N2190_N2191.N2190_22, N2190_N2191.getN219022());
        values.put(N2190_N2191.N2191, N2190_N2191.getN2191());

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

        values.put(N2192_N2202.N2192, N2192_N2202.getN2192());
        values.put(N2192_N2202.N2193, N2192_N2202.getN2193());
        values.put(N2192_N2202.N2194, N2192_N2202.getN2194());
        values.put(N2192_N2202.N2195, N2192_N2202.getN2195());
        values.put(N2192_N2202.N2196, N2192_N2202.getN2196());
        values.put(N2192_N2202.N2197, N2192_N2202.getN2197());
        values.put(N2192_N2202.N2198, N2192_N2202.getN2198());
        values.put(N2192_N2202.N2199, N2192_N2202.getN2199());
        values.put(N2192_N2202.N2200, N2192_N2202.getN2200());
        values.put(N2192_N2202.N2201, N2192_N2202.getN2201());
        values.put(N2192_N2202.N2202, N2192_N2202.getN2202());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2192_N2202.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2211A
    public Long add_N2211A(N2211_N2248_A_C n2211A) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2211_N2248_A_C.N2211_1, N2211_N2248_A_C.getN22111());
        values.put(N2211_N2248_A_C.N2211_2, N2211_N2248_A_C.getN22112());
        values.put(N2211_N2248_A_C.N2212, N2211_N2248_A_C.getN2212());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2211_N2248_A_C.TABLE_NAME,
                null,
                values);

        return newRowId;
    }

    //2211B
    public Long add_N2211B(N2211_N2248_B n2211B) {

        // Gets the data repository in write mode
        SQLiteDatabase db = this.getWritableDatabase();

        // Create a new map of values, where column names are the keys
        ContentValues values = new ContentValues();

        values.put(N2211_N2248_B.N2213, N2211_N2248_B.getN2213());
        values.put(N2211_N2248_B.N2213_2A, N2211_N2248_B.getN22132A());
        values.put(N2211_N2248_B.N2213_4, N2211_N2248_B.getN22134());

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

        values.put(N2211_N2248_A_C.N2214, N2211_N2248_A_C.getN2214());
        values.put(N2211_N2248_A_C.N2215, N2211_N2248_A_C.getN2215());
        values.put(N2211_N2248_A_C.N2216_1, N2211_N2248_A_C.getN22161());
        values.put(N2211_N2248_A_C.N2216_2, N2211_N2248_A_C.getN22162());
        values.put(N2211_N2248_A_C.N2216_3, N2211_N2248_A_C.getN22163());
        values.put(N2211_N2248_A_C.N2216_4, N2211_N2248_A_C.getN22164());
        values.put(N2211_N2248_A_C.N2216_5, N2211_N2248_A_C.getN22165());
        values.put(N2211_N2248_A_C.N2216_6, N2211_N2248_A_C.getN22166());
        values.put(N2211_N2248_A_C.N2216_7, N2211_N2248_A_C.getN22167());
        values.put(N2211_N2248_A_C.N2216_8, N2211_N2248_A_C.getN22168());
        values.put(N2211_N2248_A_C.N2216_9, N2211_N2248_A_C.getN22169());
        values.put(N2211_N2248_A_C.N2216_10, N2211_N2248_A_C.getN221610());
        values.put(N2211_N2248_A_C.N2216_11, N2211_N2248_A_C.getN221611());
        values.put(N2211_N2248_A_C.N2216_12, N2211_N2248_A_C.getN221612());
        values.put(N2211_N2248_A_C.N2216_OT, N2211_N2248_A_C.getN2216Ot());
        values.put(N2211_N2248_A_C.N2216_DK, N2211_N2248_A_C.getN2216Dk());
        values.put(N2211_N2248_A_C.N2217_1, N2211_N2248_A_C.getN22171());
        values.put(N2211_N2248_A_C.N2217_2, N2211_N2248_A_C.getN22172());
        values.put(N2211_N2248_A_C.N2217_3, N2211_N2248_A_C.getN22173());
        values.put(N2211_N2248_A_C.N2218_1, N2211_N2248_A_C.getN22181());
        values.put(N2211_N2248_A_C.N2218_2, N2211_N2248_A_C.getN22182());
        values.put(N2211_N2248_A_C.N2219, N2211_N2248_A_C.getN2219());
        values.put(N2211_N2248_A_C.N2219_2, N2211_N2248_A_C.getN22192());
        values.put(N2211_N2248_A_C.N2220, N2211_N2248_A_C.getN2220());
        values.put(N2211_N2248_A_C.N2221_1, N2211_N2248_A_C.getN22211());
        values.put(N2211_N2248_A_C.N2221_2, N2211_N2248_A_C.getN22212());
        values.put(N2211_N2248_A_C.N2222, N2211_N2248_A_C.getN2222());
        values.put(N2211_N2248_A_C.N2223, N2211_N2248_A_C.getN2223());
        values.put(N2211_N2248_A_C.N2224, N2211_N2248_A_C.getN2224());
        values.put(N2211_N2248_A_C.N2224_2, N2211_N2248_A_C.getN22242());
        values.put(N2211_N2248_A_C.N2225_1, N2211_N2248_A_C.getN22251());
        values.put(N2211_N2248_A_C.N2225_2, N2211_N2248_A_C.getN22252());
        values.put(N2211_N2248_A_C.N2226, N2211_N2248_A_C.getN2226());
        values.put(N2211_N2248_A_C.N2227_1, N2211_N2248_A_C.getN22271());
        values.put(N2211_N2248_A_C.N2227_2, N2211_N2248_A_C.getN22272());
        values.put(N2211_N2248_A_C.N2228_1, N2211_N2248_A_C.getN22281());
        values.put(N2211_N2248_A_C.N2228_2, N2211_N2248_A_C.getN22282());
        values.put(N2211_N2248_A_C.N2229, N2211_N2248_A_C.getN2229());
        values.put(N2211_N2248_A_C.N2229_2, N2211_N2248_A_C.getN22292());
        values.put(N2211_N2248_A_C.N2230, N2211_N2248_A_C.getN2230());
        values.put(N2211_N2248_A_C.N2231_1, N2211_N2248_A_C.getN22311());
        values.put(N2211_N2248_A_C.N2231_2, N2211_N2248_A_C.getN22312());
        values.put(N2211_N2248_A_C.N2232, N2211_N2248_A_C.getN2232());
        values.put(N2211_N2248_A_C.N2233, N2211_N2248_A_C.getN2233());
        values.put(N2211_N2248_A_C.N2234, N2211_N2248_A_C.getN2234());
        values.put(N2211_N2248_A_C.N2234_2, N2211_N2248_A_C.getN22342());
        values.put(N2211_N2248_A_C.N2235_1, N2211_N2248_A_C.getN22351());
        values.put(N2211_N2248_A_C.N2235_2, N2211_N2248_A_C.getN22352());
        values.put(N2211_N2248_A_C.N2236, N2211_N2248_A_C.getN2236());
        values.put(N2211_N2248_A_C.N2237_1, N2211_N2248_A_C.getN22371());
        values.put(N2211_N2248_A_C.N2237_2, N2211_N2248_A_C.getN22372());
        values.put(N2211_N2248_A_C.N2238, N2211_N2248_A_C.getN2238());
        values.put(N2211_N2248_A_C.N2239, N2211_N2248_A_C.getN2239());
        values.put(N2211_N2248_A_C.N2240_1, N2211_N2248_A_C.getN22401());
        values.put(N2211_N2248_A_C.N2240_2, N2211_N2248_A_C.getN22402());
        values.put(N2211_N2248_A_C.N2240_3, N2211_N2248_A_C.getN22403());
        values.put(N2211_N2248_A_C.N2240_4, N2211_N2248_A_C.getN22404());
        values.put(N2211_N2248_A_C.N2240_5, N2211_N2248_A_C.getN22405());
        values.put(N2211_N2248_A_C.N2240_6, N2211_N2248_A_C.getN22406());
        values.put(N2211_N2248_A_C.N2240_7, N2211_N2248_A_C.getN22407());
        values.put(N2211_N2248_A_C.N2240_8, N2211_N2248_A_C.getN22408());
        values.put(N2211_N2248_A_C.N2240_9, N2211_N2248_A_C.getN22409());
        values.put(N2211_N2248_A_C.N2240_10, N2211_N2248_A_C.getN224010());
        values.put(N2211_N2248_A_C.N2240_11, N2211_N2248_A_C.getN224011());
        values.put(N2211_N2248_A_C.N2240_12, N2211_N2248_A_C.getN224012());
        values.put(N2211_N2248_A_C.N2240_13, N2211_N2248_A_C.getN224013());
        values.put(N2211_N2248_A_C.N2240_14, N2211_N2248_A_C.getN224014());
        values.put(N2211_N2248_A_C.N2240_15, N2211_N2248_A_C.getN224015());
        values.put(N2211_N2248_A_C.N2240_OT, N2211_N2248_A_C.getN2240Ot());
        values.put(N2211_N2248_A_C.N2240_DK, N2211_N2248_A_C.getN2240Dk());
        values.put(N2211_N2248_A_C.N2241, N2211_N2248_A_C.getN2241());
        values.put(N2211_N2248_A_C.N2242_1, N2211_N2248_A_C.getN22421());
        values.put(N2211_N2248_A_C.N2242_2, N2211_N2248_A_C.getN22422());
        values.put(N2211_N2248_A_C.N2242_3, N2211_N2248_A_C.getN22423());
        values.put(N2211_N2248_A_C.N2242_4, N2211_N2248_A_C.getN22424());
        values.put(N2211_N2248_A_C.N2242_5, N2211_N2248_A_C.getN22425());
        values.put(N2211_N2248_A_C.N2242_6, N2211_N2248_A_C.getN22426());
        values.put(N2211_N2248_A_C.N2242_OT, N2211_N2248_A_C.getN2242Ot());
        values.put(N2211_N2248_A_C.N2242_DK, N2211_N2248_A_C.getN2242Dk());
        values.put(N2211_N2248_A_C.N2243_1, N2211_N2248_A_C.getN22431());
        values.put(N2211_N2248_A_C.N2243_2, N2211_N2248_A_C.getN22432());
        values.put(N2211_N2248_A_C.N2243_3, N2211_N2248_A_C.getN22433());
        values.put(N2211_N2248_A_C.N2243_4, N2211_N2248_A_C.getN22434());
        values.put(N2211_N2248_A_C.N2243_5, N2211_N2248_A_C.getN22435());
        values.put(N2211_N2248_A_C.N2243_OT, N2211_N2248_A_C.getN2243Ot());
        values.put(N2211_N2248_A_C.N2243_7, N2211_N2248_A_C.getN22437());
        values.put(N2211_N2248_A_C.N2243_DK, N2211_N2248_A_C.getN2243Dk());
        values.put(N2211_N2248_A_C.N2244, N2211_N2248_A_C.getN2244());
        values.put(N2211_N2248_A_C.N2245, N2211_N2248_A_C.getN2245());
        values.put(N2211_N2248_A_C.N2246, N2211_N2248_A_C.getN2246());
        values.put(N2211_N2248_A_C.N2247, N2211_N2248_A_C.getN2247());
        values.put(N2211_N2248_A_C.N2248, N2211_N2248_A_C.getN2248());

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

        values.put(N2251_N2260.N2251, N2251_N2260.getN2251());
        values.put(N2251_N2260.N2252_1, N2251_N2260.getN22521());
        values.put(N2251_N2260.N2252_2, N2251_N2260.getN22522());
        values.put(N2251_N2260.N2252_3, N2251_N2260.getN22523());
        values.put(N2251_N2260.N2252_4, N2251_N2260.getN22524());
        values.put(N2251_N2260.N2252_5, N2251_N2260.getN22525());
        values.put(N2251_N2260.N2252_6, N2251_N2260.getN22526());
        values.put(N2251_N2260.N2252_7, N2251_N2260.getN22527());
        values.put(N2251_N2260.N2253, N2251_N2260.getN2253());
        values.put(N2251_N2260.N2254, N2251_N2260.getN2254());
        values.put(N2251_N2260.N2255_1CHECK, N2251_N2260.getN22551check());
        values.put(N2251_N2260.N2255_1, N2251_N2260.getN22551());
        values.put(N2251_N2260.N2255_2CHECK, N2251_N2260.getN22552check());
        values.put(N2251_N2260.N2255_2, N2251_N2260.getN22552());
        values.put(N2251_N2260.N2256, N2251_N2260.getN2256());
        values.put(N2251_N2260.N2257, N2251_N2260.getN2257());
        values.put(N2251_N2260.N2258, N2251_N2260.getN2258());
        values.put(N2251_N2260.N2259, N2251_N2260.getN2259());
        values.put(N2251_N2260.N2260, N2251_N2260.getN2260());

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

        values.put(N2271_N2284.N2271, N2271_N2284.getN2271());
        values.put(N2271_N2284.N2272, N2271_N2284.getN2272());
        values.put(N2271_N2284.N2273, N2271_N2284.getN2273());
        values.put(N2271_N2284.N2274, N2271_N2284.getN2274());
        values.put(N2271_N2284.N2275, N2271_N2284.getN2275());
        values.put(N2271_N2284.N2276, N2271_N2284.getN2276());
        values.put(N2271_N2284.N2277, N2271_N2284.getN2277());
        values.put(N2271_N2284.N2278, N2271_N2284.getN2278());
        values.put(N2271_N2284.N2283, N2271_N2284.getN2283());
        values.put(N2271_N2284.N2284, N2271_N2284.getN2284());

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

        values.put(N2291_N2304.N2291, N2291_N2304.getN2291());
        values.put(N2291_N2304.N2292, N2291_N2304.getN2292());
        values.put(N2291_N2304.N2293, N2291_N2304.getN2293());
        values.put(N2291_N2304.N2294, N2291_N2304.getN2294());
        values.put(N2291_N2304.N2295, N2291_N2304.getN2295());
        values.put(N2291_N2304.N2296, N2291_N2304.getN2296());
        values.put(N2291_N2304.N2297, N2291_N2304.getN2297());
        values.put(N2291_N2304.N2298, N2291_N2304.getN2298());
        values.put(N2291_N2304.N2299, N2291_N2304.getN2299());
        values.put(N2291_N2304.N2300, N2291_N2304.getN2300());
        values.put(N2291_N2304.N2301, N2291_N2304.getN2301());
        values.put(N2291_N2304.N2302, N2291_N2304.getN2302());
        values.put(N2291_N2304.N2303, N2291_N2304.getN2303());
        values.put(N2291_N2304.N2304, N2291_N2304.getN2304());

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

        values.put(N2311_N2317.N2311, N2311_N2317.getN2311());
        values.put(N2311_N2317.N2312, N2311_N2317.getN2312());
        values.put(N2311_N2317.N2313, N2311_N2317.getN2313());
        values.put(N2311_N2317.N2314, N2311_N2317.getN2314());
        values.put(N2311_N2317.N2315, N2311_N2317.getN2315());
        values.put(N2311_N2317.N2316, N2311_N2317.getN2316());
        values.put(N2311_N2317.N2317, N2311_N2317.getN2317());

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

        values.put(N2321_N2322.N2321, N2321_N2322.getN2321());
        values.put(N2321_N2322.N2322, N2321_N2322.getN2322());

        // Insert the new row, returning the primary key value of the new row
        long newRowId;
        newRowId = db.insert(
                data.N.N2321_N2322.TABLE_NAME,
                null,
                values);

        return newRowId;
    }


}
