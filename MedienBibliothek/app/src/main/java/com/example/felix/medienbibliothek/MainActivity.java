package com.example.felix.medienbibliothek;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;


public class MainActivity extends Activity implements View.OnClickListener
{
    Button buttonMainMenu;
    RadioButton radioButtonPersonen, radioButtonBuecher, radioButtonVerleih, radioButtonRueckgabe;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMainMenu = (Button) findViewById(R.id.buttonMainMenu);
        buttonMainMenu.setOnClickListener(this);

        radioButtonPersonen = (RadioButton) findViewById(R.id.radioButtonPersonenVerwalten);
        radioButtonBuecher = (RadioButton) findViewById(R.id.radioButtonBuecherVerwalten);
        radioButtonVerleih = (RadioButton) findViewById(R.id.radioButtonVerleih);
        radioButtonRueckgabe = (RadioButton) findViewById(R.id.radioButtonRueckgabe);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMainMenu)
        {
            if(radioButtonPersonen.isChecked())
            {
                startActivity(new Intent(this, PersonenActivity.class));
            }

            if(radioButtonBuecher.isChecked())
            {
                startActivity(new Intent(this, BuecherActivity.class));
            }

            if(radioButtonVerleih.isChecked())
            {
                startActivity(new Intent(this, VerleihActivity.class));
            }

            if(radioButtonRueckgabe.isChecked())
            {
                startActivity(new Intent(this, RueckgabeActivity.class));
            }
        }
    }
}
