package data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import data.C.C3001_C3011;
import data.C.C3012_C3022;
import data.N.N2001_N2011;
import data.N.N2012_N2016;

/**
 * Created by Umeed-e-Nau on 12/21/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "tran_DB.db";
    private static final int VERSION = 1;

    Context mContext;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, VERSION);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.beginTransaction();

        db.execSQL(C3001_C3011.getCreateQuery()); // C3001_C3011 created here
        db.execSQL(C3012_C3022.getCreateQuery()); // C3012_C3022 created here

        db.execSQL(N2001_N2011.getCreateQuery()); // N2001_N2011 created here
        db.execSQL(N2012_N2016.getCreateQuery()); // N2012_N2016 created here
        db.execSQL(data.N.N2017_N2022_3.getCreateQuery()); // N2017_N2022_3 created here

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
}
