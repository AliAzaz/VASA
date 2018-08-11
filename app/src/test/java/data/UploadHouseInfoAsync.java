package data;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import utils.MyPreferences;
import utils.PostRequestData;
import utils.QuestionModel;

/**
 * Created by Umeed-e-Nau on 12/28/2016.
 */
public class UploadHouseInfoAsync extends AsyncTask {

    public static ProgressDialog dialog;
    Context mContext;
    HashMap<String, String> param;
    String[] interviewLogData;
    String mUserMsg;
    // wait for Toast then kill app
    Thread thread = new Thread() {
        @Override
        public void run() {
            try {
                Thread.sleep(800); // As I am using LENGTH_LONG in Toast
                // Your_Activity.this.finish();


                int pid = android.os.Process.myPid();
                android.os.Process.killProcess(pid);
                // getActivity().finish();


                System.exit(0);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    public UploadHouseInfoAsync(Context context) {

        //stop interview
        // if(InterviewUploadingStatus.status<2)
        //   this.cancel(false);

        mContext = context;
        dialog = new ProgressDialog(context);
        param = new HashMap<>();

    }

    @Override
    protected void onPreExecute() {

        dialog.setMessage("Uploading interview Please wait ....");
        dialog.setCancelable(false);
        dialog.show();


        HashMap<String, List<String>> map = QuestionModel.quest.get("a");


        //region Query

        String query = "select * from ttable where id = '%s' order by id  desc LIMIT 1";


        //  query="select * from hfa h join tbllog lg on h.id=lg.hfa_id  where h.id = %s ORDER BY h.id desc LIMIT 1";
        query = String.format(query, 1);

        LocalDataManager Lm = new LocalDataManager(mContext);
        Cursor c = LocalDataManager.database.rawQuery(query, null);


        if (c != null) {
            if (c.moveToFirst()) {
                param.put("app_id", c.getString(0));
                param.put("Q1_1", c.getString(1));
              /*    param.put("Q1", c.getString(	2	));
                  param.put("Q2", c.getString(	3	));
                  param.put("Q3", c.getString(	4	));
                  param.put("Q4", c.getString(	5	));
                  param.put("Q5", c.getString(	6	));
                  param.put("Q6", c.getString(	7	));
                  param.put("Q6_1", c.getString(	8	));
                  param.put("Q7", c.getString(	9	));
                  param.put("Q8", c.getString(	10	));
                  param.put("Q9", c.getString(	11	));
                  param.put("Q10", c.getString(	12	));
                  param.put("Q10_1 ", c.getString(	13	));
                  param.put("Q11", c.getString(	14	));
                  param.put("Q12", c.getString(	15	));
                  param.put("P1", c.getString(	16	));
                  param.put("P2", c.getString(	17	));
                  param.put("P3", c.getString(	18	));
                  param.put("P4", c.getString(	19	));
                  param.put("P5", c.getString(	20	));
                  param.put("P6", c.getString(	21	));
                  param.put("P7", c.getString(	22	));
                  param.put("P8", c.getString(	23	));
                  param.put("P9", c.getString(	24	));
                  param.put("P10", c.getString(	25	));
                  param.put("P11", c.getString(	26	));
                  param.put("P12", c.getString(	27	));
                  param.put("P13", c.getString(	28	));
                  param.put("P14", c.getString(	29	));
                  param.put("P15", c.getString(	30	));
                  param.put("P16", c.getString(	31	));
                  param.put("P17", c.getString(	32	));
                  param.put("P18", c.getString(	33	));
                  param.put("P19", c.getString(	34	));
                  param.put("P20", c.getString(	35	));
                  param.put("P21", c.getString(	36	));
                  param.put("P22", c.getString(	37	));
                  param.put("P23", c.getString(	38	));
                  param.put("P24", c.getString(	39	));
                  param.put("P25", c.getString(	40	));
                  param.put("P26", c.getString(	41	));
                  param.put("P27", c.getString(	42	));
                  param.put("txt_P1", c.getString(	43	));
                  param.put("txt_P2", c.getString(	44	));
                  param.put("txt_P3", c.getString(	45	));
                  param.put("txt_P4", c.getString(	46	));
                  param.put("txt_P5", c.getString(	47	));
                  param.put("txt_P6", c.getString(	48	));
                  param.put("txt_P7", c.getString(	49	));
                  param.put("txt_P8", c.getString(	50	));
                  param.put("txt_P9", c.getString(	51	));
                  param.put("txt_P10", c.getString(	52	));
                  param.put("txt_P11", c.getString(	53	));
                  param.put("txt_P12", c.getString(	54	));
                  param.put("txt_P13", c.getString(	55	));
                  param.put("txt_P14", c.getString(	56	));
                  param.put("txt_P15", c.getString(	57	));
                  param.put("txt_P16", c.getString(	58	));
                  param.put("txt_P17", c.getString(	59	));
                  param.put("txt_P18", c.getString(	60	));
                  param.put("txt_P19", c.getString(	61	));
                  param.put("txt_P20", c.getString(	62	));
                  param.put("txt_P21", c.getString(	63	));
                  param.put("txt_P22", c.getString(	64	));
                  param.put("txt_P23", c.getString(	65	));
                  param.put("txt_P24", c.getString(	66	));
                  param.put("txt_P25", c.getString(	67	));
                  param.put("txt_P26", c.getString(	68	));
                  param.put("txt_P27", c.getString(	69	));
                  param.put("D1", c.getString(	70	));
                  param.put("D2", c.getString(	71	));
                  param.put("D3", c.getString(	72	));
                  param.put("D4", c.getString(	73	));
                  param.put("D5", c.getString(	74	));
                  param.put("D6", c.getString(	75	));
                  param.put("D7", c.getString(	76	));
                  param.put("D8", c.getString(	77	));
                  param.put("D9", c.getString(	78	));
                  param.put("D10", c.getString(	79	));
                  param.put("D11", c.getString(	80	));
                  param.put("D12", c.getString(	81	));
                  param.put("D13", c.getString(	82	));
                  param.put("D14", c.getString(	83	));
                  param.put("D15", c.getString(	84	));
                  param.put("D16", c.getString(	85	));
                  param.put("D17", c.getString(	86	));
                  param.put("D18", c.getString(	87	));
                  param.put("D19", c.getString(	88	));
                  param.put("D20", c.getString(	89	));
                  param.put("D21", c.getString(	90	));
                  param.put("D22", c.getString(	91	));
                  param.put("D23", c.getString(	92	));
                  param.put("D1_txt ", c.getString(	93	));
                  param.put("D2_txt", c.getString(	94	));
                  param.put("D3_txt", c.getString(	95	));
                  param.put("D4_txt", c.getString(	96	));
                  param.put("D5_txt", c.getString(	97	));
                  param.put("D6_txt", c.getString(	98	));
                  param.put("D7_txt", c.getString(	99	));
                  param.put("D8_txt", c.getString(	100	));
                  param.put("D9_txt", c.getString(	101	));
                  param.put("D10_txt", c.getString(	102	));
                  param.put("D11_txt", c.getString(	103	));
                  param.put("D12_txt", c.getString(	104	));
                  param.put("D13_txt", c.getString(	105	));
                  param.put("D14_txt", c.getString(	106	));
                  param.put("D15_txt", c.getString(	107	));
                  param.put("D16_txt", c.getString(	108	));
                  param.put("D17_txt", c.getString(	109	));
                  param.put("D18_txt", c.getString(	110	));
                  param.put("D19_txt", c.getString(	111	));
                  param.put("D20_txt", c.getString(	112	));
                  param.put("D21_txt", c.getString(	113	));
                  param.put("D22_txt", c.getString(	114	));
                  param.put("D23_txt", c.getString(	115	));
                  param.put("PNC1", c.getString(	116	));
                  param.put("PNC2", c.getString(	117	));
                  param.put("PNC3", c.getString(	118	));
                  param.put("PNC4", c.getString(	119	));
                  param.put("PNC5", c.getString(	120	));
                  param.put("PNC6", c.getString(	121	));
                  param.put("PNC7", c.getString(	122	));
                  param.put("PNC8", c.getString(	123	));
                  param.put("PNC9", c.getString(	124	));
                  param.put("PNC10 ", c.getString(	125	));
                  param.put("PNC11 ", c.getString(	126	));
                  param.put("PNC12 ", c.getString(	127	));
                  param.put("txt_PNC1", c.getString(	128	));
                  param.put("txt_PNC2", c.getString(	129	));
                  param.put("txt_PNC3", c.getString(	130	));
                  param.put("txt_PNC4", c.getString(	131	));
                  param.put("txt_PNC5", c.getString(	132	));
                  param.put("txt_PNC6", c.getString(	133	));
                  param.put("txt_PNC7", c.getString(	134	));
                  param.put("txt_PNC8", c.getString(	135	));
                  param.put("txt_PNC9", c.getString(	136	));
                  param.put("txt_PNC10 ", c.getString(	137	));
                  param.put("txt_PNC11 ", c.getString(	138	));
                  param.put("txt_PNC12 ", c.getString(	139	));
                  param.put("N1", c.getString(	140	));
                  param.put("N2", c.getString(	141	));
                  param.put("N3", c.getString(	142	));
                  param.put("N4", c.getString(	143	));
                  param.put("N5", c.getString(	144	));
                  param.put("N6", c.getString(	145	));
                  param.put("N7", c.getString(	146	));
                  param.put("N8", c.getString(	147	));
                  param.put("N9", c.getString(	148	));
                  param.put("N10", c.getString(	149	));
                  param.put("N11", c.getString(	150	));
                  param.put("N12", c.getString(	151	));
                  param.put("N13", c.getString(	152	));
                  param.put("N14", c.getString(	153	));
                  param.put("N15", c.getString(	154	));
                  param.put("N16", c.getString(	155	));
                  param.put("N17", c.getString(	156	));
                  param.put("N18", c.getString(	157	));
                  param.put("N19", c.getString(	158	));
                  param.put("N20", c.getString(	159	));
                  param.put("N21", c.getString(	160	));
                  param.put("N22", c.getString(	161	));
                  param.put("N23", c.getString(	162	));
                  param.put("N24", c.getString(	163	));
                  param.put("txt_N1", c.getString(	164	));
                  param.put("txt_N2", c.getString(	165	));
                  param.put("txt_N3", c.getString(	166	));
                  param.put("txt_N4", c.getString(	167	));
                  param.put("txt_N5", c.getString(	168	));
                  param.put("txt_N6", c.getString(	169	));
                  param.put("txt_N7", c.getString(	170	));
                  param.put("txt_N8", c.getString(	171	));
                  param.put("txt_N9", c.getString(	172	));
                  param.put("txt_N10", c.getString(	173	));
                  param.put("txt_N11", c.getString(	174	));
                  param.put("txt_N12", c.getString(	175	));
                  param.put("txt_N13", c.getString(	176	));
                  param.put("txt_N14", c.getString(	177	));
                  param.put("txt_N15", c.getString(	178	));
                  param.put("txt_N16", c.getString(	179	));
                  param.put("txt_N17", c.getString(	180	));
                  param.put("txt_N18", c.getString(	181	));
                  param.put("txt_N19", c.getString(	182	));
                  param.put("txt_N20", c.getString(	183	));
                  param.put("txt_N21", c.getString(	184	));
                  param.put("txt_N22", c.getString(	185	));
                  param.put("txt_N23", c.getString(	186	));
                  param.put("txt_N24", c.getString(	187	));
                  param.put("I1", c.getString(	188	));
                  param.put("I2", c.getString(	189	));
                  param.put("I3", c.getString(	190	));
                  param.put("I4", c.getString(	191	));
                  param.put("I5", c.getString(	192	));
                  param.put("I6", c.getString(	193	));
                  param.put("I7", c.getString(	194	));
                  param.put("I8", c.getString(	195	));
                  param.put("I9", c.getString(	196	));
                  param.put("I10", c.getString(	197	));
                  param.put("I11", c.getString(	198	));
                  param.put("txt_I1", c.getString(	199	));
                  param.put("txt_I2", c.getString(	200	));
                  param.put("txt_I3", c.getString(	201	));
                  param.put("txt_I4", c.getString(	202	));
                  param.put("txt_I5", c.getString(	203	));
                  param.put("txt_I6", c.getString(	204	));
                  param.put("txt_I7", c.getString(	205	));
                  param.put("txt_I8", c.getString(	206	));
                  param.put("txt_I9", c.getString(	207	));
                  param.put("txt_I10", c.getString(	208	));
                  param.put("txt_I11", c.getString(	209	));
                  param.put("DI1", c.getString(	210	));
                  param.put("DI2", c.getString(	211	));
                  param.put("DI3", c.getString(	212	));
                  param.put("DI4", c.getString(	213	));
                  param.put("DI5", c.getString(	214	));
                  param.put("DI6", c.getString(	215	));
                  param.put("DI7", c.getString(	216	));
                  param.put("DI8", c.getString(	217	));
                  param.put("DI9", c.getString(	218	));
                  param.put("DI10", c.getString(	219	));
                  param.put("DI11", c.getString(	220	));
                  param.put("txt_DI1", c.getString(	221	));
                  param.put("txt_DI2", c.getString(	222	));
                  param.put("txt_DI3", c.getString(	223	));
                  param.put("txt_DI4", c.getString(	224	));
                  param.put("txt_DI5", c.getString(	225	));
                  param.put("txt_DI6", c.getString(	226	));
                  param.put("txt_DI7", c.getString(	227	));
                  param.put("txt_DI8", c.getString(	228	));
                  param.put("txt_DI9", c.getString(	229	));
                  param.put("txt_DI10", c.getString(	230	));
                  param.put("txt_DI11", c.getString(	231	));
                  param.put("PN1", c.getString(	232	));
                  param.put("PN2", c.getString(	233	));
                  param.put("PN3", c.getString(	234	));
                  param.put("PN4", c.getString(	235	));
                  param.put("PN5", c.getString(	236	));
                  param.put("PN6", c.getString(	237	));
                  param.put("PN7", c.getString(	238	));
                  param.put("PN8", c.getString(	239	));
                  param.put("PN9", c.getString(	240	));
                  param.put("PN10", c.getString(	241	));
                  param.put("PN11", c.getString(	242	));
                  param.put("PN12", c.getString(	243	));
                  param.put("PN13", c.getString(	244	));
                  param.put("PN14", c.getString(	245	));
                  param.put("PN15", c.getString(	246	));
                  param.put("PN16", c.getString(	247	));
                  param.put("PN17", c.getString(	248	));
                  param.put("PN18", c.getString(	249	));
                  param.put("PN19", c.getString(	250	));
                  param.put("PN20", c.getString(	251	));
                  param.put("PN21", c.getString(	252	));
                  param.put("txt_PN1", c.getString(	253	));
                  param.put("txt_PN2", c.getString(	254	));
                  param.put("txt_PN3", c.getString(	255	));
                  param.put("txt_PN4", c.getString(	256	));
                  param.put("txt_PN5", c.getString(	257	));
                  param.put("txt_PN6", c.getString(	258	));
                  param.put("txt_PN7", c.getString(	259	));
                  param.put("txt_PN8", c.getString(	260	));
                  param.put("txt_PN9", c.getString(	261	));
                  param.put("txt_PN10", c.getString(	262	));
                  param.put("txt_PN11", c.getString(	263	));
                  param.put("txt_PN12", c.getString(	264	));
                  param.put("txt_PN13", c.getString(	265	));
                  param.put("txt_PN14", c.getString(	266	));
                  param.put("txt_PN15", c.getString(	267	));
                  param.put("txt_PN16", c.getString(	268	));
                  param.put("txt_PN17", c.getString(	269	));
                  param.put("txt_PN18", c.getString(	270	));
                  param.put("txt_PN19", c.getString(	271	));
                  param.put("txt_PN20", c.getString(	272	));
                  param.put("txt_PN21", c.getString(	273	));
                  param.put("datee", c.getString(	274	));
                  param.put("timee", c.getString(	275	));
                  param.put("userid", c.getString(	276	));
                  param.put("Interview_status", c.getString(	277	));
                  */


            }

        }
        //endregion


        super.onPreExecute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {

        String urlString = new MyPreferences(mContext).getReq1();

        URL url;
        HttpURLConnection connection;

        try {
            url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            // connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);

            OutputStream os = connection.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

            bw.write(PostRequestData.getData(param));
            bw.flush();


            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String st = "", line;
                while ((line = br.readLine()) != null) {
                    st = st + line;
                }
                return st;
            } else {
                mUserMsg = "Server Couldn't process the request";
            }
        } catch (MalformedURLException e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
            e.printStackTrace();
        } catch (IOException e) {


            mUserMsg = "Please make sure that Internet connection is available," +
                    " and server IP is inserted in settings";
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Object o) {


        try {
            dialog.dismiss();

            if (mUserMsg != null)
                throw new IOException();


            //int houseId = Integer.parseInt(((String) o).replace("\"",""));

            String result = (((String) o).replace("\"", ""));


            Toast.makeText(mContext, "Interivew Has ben Uploaded", Toast.LENGTH_SHORT).show();
            // new LocalDataManager(mContext).uploadInterview();

            //  LogtableUpdates.UpdateLogStatusUpload(mContext,Validation.hfauploadid);

            thread.start();


        } catch (IOException e) {
            //if connection was available via connecting but
            //we can't get data from server..
            if (mUserMsg == null)
                mUserMsg = "Please check connection";
            dialog.dismiss();
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
            mUserMsg = e.getMessage();
            dialog.dismiss();
        } catch (Exception e) {
            Toast.makeText(mContext, "Uploading failed at request 1", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
            return;
        } finally {
            if (mUserMsg != null)
                Toast.makeText(mContext, mUserMsg, Toast.LENGTH_SHORT).show();
        }


        super.onPostExecute(o);
    }
}
