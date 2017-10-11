package com.example.juhi.screencolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout rl;
    TextView lbl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl=(RelativeLayout)findViewById(R.id.msgScreen);
        rl.setOnCreateContextMenuListener(this);
        lbl = (TextView)findViewById(R.id.textView);
        setContentView(rl);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        CreateMenu(menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return MenuChoice(item);
    }
    private void CreateMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0,0,0,"SOFT YELLOW");
        {
            mnu1.setAlphabeticShortcut('Y');
        }
        MenuItem mnu2 = menu.add(0,1,1,"ROSY BROWN");
        {
            mnu2.setAlphabeticShortcut('B');
        }
        MenuItem mnu3 = menu.add(0,2,2,"ROYAL BLUE");
        {
            mnu3.setAlphabeticShortcut('B');
        }
        MenuItem mnu4 = menu.add(0,3,3,"LIGHT CORAL");
        {
            mnu4.setAlphabeticShortcut('C');
        }
    }
    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId()){
            case 0:
                lbl.setText("SOFT YELLOW COLOR");
                rl.setBackgroundColor(Color.rgb(213,203,53));
                return true;
            case 1:
                lbl.setText("ROSY BROWN COLOR");
                rl.setBackgroundColor(Color.rgb(188,143,143));
                return true;
            case 2:
                lbl.setText("ROYAL BLUE COLOR");
                rl.setBackgroundColor(Color.rgb(65,105,225));
                return true;
            case 3:
                lbl.setText("LIGHT CORAL COLOR");
                rl.setBackgroundColor(Color.rgb(240,128,128));
                return true;
        }
        return false;
    }
}