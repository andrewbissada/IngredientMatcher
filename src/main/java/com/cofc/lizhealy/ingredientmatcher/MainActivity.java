package com.cofc.lizhealy.ingredientmatcher;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private EditText editTextIngredient;

    private RelativeLayout root;
    private String textIngredient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        editTextIngredient = (EditText) findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.searchButton);

        root = (RelativeLayout) findViewById(R.id.root);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //TextView editTextIngredient = (TextView) findViewById(R.id.enterIngredient);
                    textIngredient = editTextIngredient.getText().toString();
                    if (TextUtils.isEmpty(textIngredient)) {
                        //Toast.makeText(MainActivity.this, "YOUR MESSAGE", Toast.LENGTH_LONG).show();
                        Snackbar snackbar = Snackbar
                                .make(findViewById(android.R.id.content), "You did not enter an ingredient", Snackbar.LENGTH_LONG);
                        snackbar.show();
                    }
                    else {
                        Log.d("MainActivity", "b1 onClickListener, Text = " + textIngredient);
                        Toast.makeText(MainActivity.this, textIngredient, Toast.LENGTH_SHORT).show();

                    }
                }
            });

    }








    /*public void buttonOnClick(View v) {
        // do something when the button is clicked
        EditText editTextIngredient = (EditText) findViewById(R.id.enterIngredient);
        TextView textView = new TextView(this);
        String ingredient = textView.getText().toString();
        if (ingredient.matches("")) {
            Toast.makeText(this, "You did not enter an ingredient", Toast.LENGTH_SHORT).show();
        }
    }*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

//Test stuff