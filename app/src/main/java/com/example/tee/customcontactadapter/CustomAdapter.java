package com.example.tee.customcontactadapter;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tee on 10/28/2017.
 */

public class CustomAdapter extends ArrayAdapter<User> {

    Activity context;
    ArrayList<User> data;

    public CustomAdapter(Activity context, ArrayList<User> data) {
        super(context, R.layout.contact_layout, data);
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View inflater = LayoutInflater.from(getContext()).inflate(R.layout.contact_layout, parent, false);

        TextView t1 = (TextView) inflater.findViewById(R.id.textView1);
        TextView t2 = (TextView) inflater.findViewById(R.id.textView2);
        User u = getItem(position);

        t1.setText(u.getName().toString());
        t1.setText(u.getPhoneNumber().toString());

        return inflater;
    }
}
