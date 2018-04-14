package omy.boston.mybostonswitchtoggle;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton forGlow = (ToggleButton) findViewById(R.id.toggleButton);
        final TextView tekst = (TextView) findViewById(R.id.textView);
        final CheckBox cek = (CheckBox) findViewById(R.id.checkBox);



        forGlow.setOnCheckedChangeListener(
                new ToggleButton.OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                        if (isChecked) {
                            tekst.setTextColor(getResources().getColor(R.color.colorAccent));
                        }else {
                            tekst.setTextColor(getResources().getColor(R.color.colorDusty));
                        }
                    }
                });


        cek.setOnClickListener(
                new CheckBox.OnClickListener(){
                    public void onClick(View view){
                        if (cek.isChecked())
                            forGlow.setEnabled(true);
                        else
                            forGlow.setEnabled(false);
                    }
                });
    }// onCreate the end!

    @Override
    protected void onStart() {
        super.onStart();
    }

    /**Metoda za puvratak podataka**/
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        qLog("Zabilježena je metoda - onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    /**Spremanje podataka**/
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        qLog("Zabilježena je metoda - onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Pračenje loga
    private void qLog(String logTekst){
        Log.d("napravi Log", logTekst);
    }
}

