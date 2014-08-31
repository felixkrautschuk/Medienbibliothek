package com.example.felix.medienbibliothek;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class PersonenHinzufuegenActivity extends Activity implements View.OnClickListener
{
    EditText textViewID, textViewNachname, textViewVorname;
    Button buttonPersonHinzufuegen;

    int id;
    String nachname, vorname;
    public PersonenActivity personenActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personen_hinzufuegen);

        textViewID = (EditText) findViewById(R.id.textID);
        textViewNachname = (EditText) findViewById(R.id.textNachname);
        textViewVorname = (EditText) findViewById(R.id.textVorname);
        buttonPersonHinzufuegen = (Button) findViewById(R.id.buttonPersonHinzufuegen);
        buttonPersonHinzufuegen.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.personen_hinzufuegen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_clear)
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonPersonHinzufuegen)
        {
            id = Integer.parseInt(textViewID.getText().toString());
            nachname = textViewNachname.getText().toString();
            vorname = textViewVorname.getText().toString();

            Person person = new Person(id, nachname, vorname);
            personenActivity.personenListe.add(person);
        }
    }
}
