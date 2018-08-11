package data.C;

/**
 * Created by Umeed-e-Nau on 12/24/2016.
 */
public class C3001_C3011 {
    public static String TABLE_NAME = "C3001_C3011";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'pk_pk' INTEGER,   " +

                global.C.C.C3001_C3011.C3011 + " TEXT," +
                global.C.C.C3001_C3011.C3001 + " TEXT," +
                global.C.C.C3001_C3011.C3002 + " TEXT," +
                global.C.C.C3001_C3011.C3003 + " TEXT," +
                global.C.C.C3001_C3011.C3004 + " TEXT," +
                global.C.C.C3001_C3011.C3005u + " TEXT," +
                global.C.C.C3001_C3011.C3005d + " TEXT," +
                global.C.C.C3001_C3011.C3005w + " TEXT," +
                global.C.C.C3001_C3011.C3005m + " TEXT," +
                global.C.C.C3001_C3011.C3006 + " TEXT," +
                global.C.C.C3001_C3011.C3008 + " TEXT," +
                global.C.C.C3001_C3011.C3009_1 + " TEXT," +
                global.C.C.C3001_C3011.C3009_2 + " TEXT," +
                global.C.C.C3001_C3011.C3009_3 + " TEXT," +
                global.C.C.C3001_C3011.C3009_4 + " TEXT," +
                global.C.C.C3001_C3011.C3010 + " TEXT" +
                ')';


        return query;
    }
}

