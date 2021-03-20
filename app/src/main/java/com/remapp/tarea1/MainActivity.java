package com.remapp.tarea1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        load();
        setContentView(R.layout.activity_main);

        Button changeLang = findViewById(R.id.changeLanguages);
        changeLang.setOnClickListener(view -> showChangeLanguageDialog());

    }

    private void showChangeLanguageDialog() {
        final String [] listItems = {"English", "Español", "Français", "Deutschland"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Select language:");
        builder.setSingleChoiceItems(listItems, -1, (dialog, which) -> {
                if (which == 0) {
                    setLocale("en");
                    recreate();
                } else if (which == 1) {
                    setLocale("es");
                    recreate();
                } else if (which == 2) {
                    setLocale("fr");
                    recreate();
                } else if (which == 3) {
                    setLocale("de");
                    recreate();
                }
                dialog.dismiss();
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void setLocale(String idioma) {
        Locale locale = new Locale(idioma);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
        editor.putString("MultipleLanguage", idioma);
        editor.apply();
    }

    public void load(){
        SharedPreferences prefer = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language = prefer.getString("MultipleLanguage", "");
        setLocale(language);
    }
}