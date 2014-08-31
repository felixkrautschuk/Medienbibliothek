package com.example.felix.medienbibliothek;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class PersonenActivity extends Activity
{
    ListView listViewPersonen;
    List<Person> personenListe = new ArrayList<Person>();

    Intent intent;

    String id, nachname, vorname;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personen);

        intent = getIntent();
        listViewPersonen = (ListView) findViewById(R.id.listViewPersonen);



        id = intent.getStringExtra(PersonenHinzufuegenActivity.EXTRA_MESSAGE1);
        nachname = intent.getStringExtra(PersonenHinzufuegenActivity.EXTRA_MESSAGE2);
        vorname = intent.getStringExtra(PersonenHinzufuegenActivity.EXTRA_MESSAGE3);

        if(id != null && nachname != null && vorname != null)
        {
            System.out.println(id + " " + nachname + " " + vorname);
            Person person = new Person(Integer.parseInt(id), nachname, vorname);
            personenListe.add(person);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.personen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (item.getItemId() == R.id.action_neu)
        {
            startActivity(new Intent(this, PersonenHinzufuegenActivity.class));
            return true;
        }

        if(item.getItemId() == R.id.action_suchen)
        {
            return true;
        }

        if(item.getItemId() == R.id.action_aktualisieren)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        PersonListAdapter listAdapter;
        listAdapter = new PersonListAdapter(this, 0, personenListe);
        listViewPersonen.setAdapter(listAdapter);
    }

    private static class PersonListAdapter extends ArrayAdapter<Person>
    {
        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            Person noteItem = getItem(position);
            PersonListItemView personListItemView = null;
            if(convertView != null)
            {
                personListItemView = (PersonListItemView) convertView;
            }
            else
            {
                personListItemView = new PersonListItemView(getContext());
            }
            personListItemView.setNoteItem(noteItem);
            return personListItemView;
        }
        public PersonListAdapter(Context context, int textViewResourceId, List<Person> objects)
        {
            super(context, textViewResourceId, objects);
        }
    }
}
