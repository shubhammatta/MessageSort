package com.example.shubhammatta.softwaretech;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class SortedSMS extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        ArrayList<String> test = intent.getStringArrayListExtra("test");
        setContentView(R.layout.activity_sorted_sms);
        int size = test.size();
        String product= "";
        ArrayList<String> Potentials = new ArrayList<>();

        for(int i=0;i<size;i++)
        {
            String[] splitted = test.get(i).split(" ");
            if(splitted[0]=="Delivered:" || splitted[0]=="Dispatched:" || splitted[0]=="Arriving")
            {
                int length = splitted.length;
                for(int k =0;k<length;k++)
                {
                    if(splitted[k]=="with")
                    {
                        int j=k+1;
                        while(splitted[j]!="is" || splitted[j]!="was" || splitted[j]!="will")
                        {
                            product += splitted[j] + " ";
                            j++;
                        }
                        if(product!="")
                        {
                            break;
                        }
                    }
                    else continue;
                }
                if(product!="")
                {
                    if(!exist(product,Potentials))
                    {
                        Potentials.add(product);
                    }
                }

            }
            else continue;
        }

        TextView text = new TextView(this);
        text.setTextSize(15);
        int num_products = Potentials.size();
        //here I have to make number of buttons corresponding to number of products
        //Define an array of buttons position them one below the other and see the attributes for that button
        for(int i=0;i<num_products;i++)
        {
            ;
        }







//        StringBuilder builder = new StringBuilder();
//
//        for (String details : Potentials) {
//            builder.append("<------NEW MESSAGE------->\n" +details + "\n");
//        }
//        text.setText(builder);
//        RelativeLayout xyz = (RelativeLayout)findViewById(R.id.rellayoutSort);
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams
//                (RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        text.setLayoutParams(params);
//        xyz.addView(text);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sorted_sm, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean exist(String X , ArrayList<String> A)
    {
        int size = A.size();
        for(int i=0;i<size;i++ )
        {
            if(A.get(i)==X)
                return false;
        }
        return true;
    }
}
