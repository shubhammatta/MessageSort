package com.example.shubhammatta.softwaretech;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    boolean clicked = false;
    String kk;
    ArrayList<String> A = new ArrayList<String>();
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.message);
        final Intent intent = new Intent(MainActivity.this, showMessage.class);
        Cursor cursor = getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null);

        if (cursor.moveToFirst()) { // must check the result to prevent exception
            do {
                int i;
                String msgData = "";
                i = cursor.getColumnIndexOrThrow("body");
                A.add(cursor.getString(i));
            } while (cursor.moveToNext());
        } else {
            // empty box, no SMS
        }
        if (A.size() > 0) {
            //Bundle extra = intent.getExtras();
            // extra.putSerializable("string", A);
            intent.putStringArrayListExtra("test", A);

        }

        //intent.putExtra(EXTRA_MESSAGE, kk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked = true;
                startActivity(intent);
            }

        });
        if (clicked)
            this.finish();

        //AMAZON
        public void AmazonMessages(View v) {
            Button amz = (Button) findViewById(R.id.amazon);

            Intent intent = new Intent(this, SortedSMS.class);
            String store = "amazon";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("amazon") || clone.get(i).contains("AMAZON") || clone.get(i).contains("Amazon")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }


        //JABONG
        public void JabongMessages(View v) {
            Button jbg = (Button) findViewById(R.id.jabong);

            Intent intent = new Intent(this, SortedSMS.class);
            String store = "jabong";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("jabong") || clone.get(i).contains("JABONG") || clone.get(i).contains("Jabong")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }

        //FLIPKART
        public void FlipkartMessages(View v) {
            Button fkt = (Button) findViewById(R.id.flipkart);
            Intent intent = new Intent(this, SortedSMS.class);
            String store = "flipkart";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("flipkart") || clone.get(i).contains("FLIPKART") || clone.get(i).contains("Flipkart")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }


        //SNAPDEAL
        public void SnapdealMessages(View v) {
            Button sd = (Button) findViewById(R.id.snapdeal);
            Intent intent = new Intent(this, SortedSMS.class);
            String store = "snapdeal";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("snapdeal") || clone.get(i).contains("SNAPDEAL") || clone.get(i).contains("Snapdeal")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }


        //MYNTRA
        public void MyntraMessages(View v) {
            Button myn = (Button) findViewById(R.id.myntra);
            Intent intent = new Intent(this, SortedSMS.class);
            String store = "myntra";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("myntra") || clone.get(i).contains("MYNTRA") || clone.get(i).contains("Myntra")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }

        //YEPME
        public void YepmeMessages(View v) {
            Button yep = (Button) findViewById(R.id.yepme);
            Intent intent = new Intent(this, SortedSMS.class);
            String store = "yepme";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("yepme") || clone.get(i).contains("YEPME") || clone.get(i).contains("Yepme")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }


        //HOMESHOP18
        public void Homeshop18Messages(View v) {
            Button hs18 = (Button) findViewById(R.id.homeshop18);
            Intent intent = new Intent(this, SortedSMS.class);
            String store = "homeshop18";
            ArrayList<String> messages = new ArrayList<String>();
            int size = A.size();
            ArrayList<String> clone = new ArrayList<String>(A.size());
            for (String item : A) clone.add(item);
            for (int i = 0; i < size; i++) {
                //clone.get(i).toLowerCase();
                if (clone.get(i).contains("homeshop18") || clone.get(i).contains("HOMESHOP18") || clone.get(i).contains("Homeshop18")) {
                    messages.add(A.get(i));
                }
            }
            if (messages.size() > 0)
                intent.putStringArrayListExtra("test", messages);
            intent.putExtra("store", store);
            startActivity(intent);
        }

//    //NAAPTOL
//    Button naaptol = (Button)findViewById(R.id.naaptol);
//    public void NaaptolMessages(View v)
//    {
//        Intent intent = new Intent(this,SortedSMS.class);
//        ArrayList<String> messages =new  ArrayList<String>();
//        int size = A.size();
//        ArrayList<String> clone = new ArrayList<String>(A.size());
//        for(String item: A) clone.add(item);
//        for(int i=0;i<size;i++)
//        {
//            if(clone.get(i).contains("naaptol"))
//            {
//                messages.add(clone.get(i));
//            }
//        }
//        intent.putStringArrayListExtra("test", messages);
//        startActivity(intent);
//    }
//    //INFIBEAM
//    Button infibeam = (Button)findViewById(R.id.infibeam);
//    public void InfibeamMessages(View v)
//    {
//        Intent intent = new Intent(this,SortedSMS.class);
//        ArrayList<String> messages =new  ArrayList<String>();
//        int size = A.size();
//        ArrayList<String> clone = new ArrayList<String>(A.size());
//        for(String item: A) clone.add(item);
//        for(int i=0;i<size;i++)
//        {
//            if(clone.get(i).contains("infibeam"))
//            {
//                messages.add(clone.get(i));
//            }
//        }
//        intent.putStringArrayListExtra("test", messages);
//        startActivity(intent);
//    }
//    //PEPPERFRY
//    Button pepperfry = (Button)findViewById(R.id.pepperfry);
//    public void PepperfryMessages(View v)
//    {
//        Intent intent = new Intent(this,SortedSMS.class);
//        ArrayList<String> messages =new  ArrayList<String>();
//        int size = A.size();
//        ArrayList<String> clone = new ArrayList<String>(A.size());
//        for(String item: A) clone.add(item);
//        for(int i=0;i<size;i++)
//        {
//            if(clone.get(i).contains("pepperfry"))
//            {
//                messages.add(clone.get(i));
//            }
//        }
//        intent.putStringArrayListExtra("test", messages);
//        startActivity(intent);
//    }
//    //FIRSTCRY
//    Button firstcry = (Button)findViewById(R.id.firstcry);
//    public void FirstcryMessages(View v)
//    {
//        Intent intent = new Intent(this,SortedSMS.class);
//        ArrayList<String> messages =new  ArrayList<String>();
//        int size = A.size();
//        ArrayList<String> clone = new ArrayList<String>(A.size());
//        for(String item: A) clone.add(item);
//        for(int i=0;i<size;i++)
//        {
//            if(clone.get(i).contains("firstcry"))
//            {
//                messages.add(clone.get(i));
//            }
//        }
//        intent.putStringArrayListExtra("test", messages);
//        startActivity(intent);
//    }


    }


}
