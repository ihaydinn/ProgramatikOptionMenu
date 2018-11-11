package com.ismailhakkiaydin.programatikoptionmenu;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        Resources res = this.getResources();

        MenuItem menuItem = menu.add("File");
        menuItem.setNumericShortcut('1');
        menuItem.setIcon(res.getDrawable(R.drawable.ic_launcher_foreground));

        menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                Toast.makeText(MainActivity.this,menuItem.getTitle(),Toast.LENGTH_LONG).show();

                return false;
            }
        });


        MenuItem menuItem1 = menu.add("Help");
        menuItem1.setNumericShortcut('2');
        menuItem1.setIcon(res.getDrawable(R.drawable.ic_launcher_background));

        menuItem1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setMessage(menuItem.getTitle());
                dlg.setPositiveButton("Okay",null);
                dlg.show();

                return false;
            }
        });

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {




        return super.onOptionsItemSelected(item);

    }
}
