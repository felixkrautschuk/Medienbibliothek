package com.example.felix.medienbibliothek;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class PersonListItemView extends RelativeLayout
{
    TextView textViewID;
    TextView textViewNachname;
    TextView textViewVorname;

    public PersonListItemView(Context context)
    {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View listItemView = inflater.inflate(R.layout.listview_item_person, null);
        textViewID = (TextView) listItemView.findViewById(R.id.personID);
        textViewID.setText("");
        textViewNachname = (TextView)listItemView.findViewById(R.id.personNachname);
        textViewVorname = (TextView) listItemView.findViewById(R.id.personVorname);
        addView(listItemView);
    }

    public void setNoteItem(Person person)
    {
        //textViewID.setText(person.getIndex());
    }
}
