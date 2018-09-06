package data.N;

public class N2001_N2011 {
    public static String TABLE_NAME = "N2001_N2011";

    public static String getCreateQuery() {
        String query;
        query = "CREATE TABLE '" + TABLE_NAME + "' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, " +

                Global.N.N2001_N2011.sub_N2001_N2011.STUDYID + " INTEGER," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2001 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2002 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2003 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2004 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2005u + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2005d + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2005w + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2005m + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2006 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2006x + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2008 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2008x + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2009_1 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2009_2 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2009_3 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2009_4 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2010 + " TEXT," +
                Global.N.N2001_N2011.sub_N2001_N2011.N2011 + " TEXT" +
                ')';


        return query;
    }
}
