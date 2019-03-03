package kriti.somevalue.com.fabmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    FloatingActionsMenu menuFab;
    FloatingActionButton addButton,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuFab=(FloatingActionsMenu) findViewById(R.id.menuFab);
        addButton=(FloatingActionButton) findViewById(R.id.addButton);
        btn1=(FloatingActionButton) findViewById(R.id.btn1);

        //menuFab.addButton(addButton);
        //menuFab.addButton(btn1);
    }
}
