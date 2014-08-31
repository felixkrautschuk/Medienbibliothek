package com.example.felix.medienbibliothek;

import android.app.Activity;
import android.content.Intent;
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
    public final static String EXTRA_MESSAGE1 = "com.example.felix.medienbibliothek.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.example.felix.medienbibliothek.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.example.felix.medienbibliothek.MESSAGE3";
    String id, nachname, vorname;

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
            Intent intent = new Intent(this, PersonenActivity.class);
            id = textViewID.getText().toString();
            nachname = textViewNachname.getText().toString();
            vorname = textViewVorname.getText().toString();

            intent.putExtra(EXTRA_MESSAGE1, id);
            intent.putExtra(EXTRA_MESSAGE2, nachname);
            intent.putExtra(EXTRA_MESSAGE3, vorname);
            startActivity(intent);
        }
    }
}
