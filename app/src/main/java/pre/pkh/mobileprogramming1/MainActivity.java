package pre.pkh.mobileprogramming1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bt, bt2;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this.getApplication().getApplicationContext();
        bt = (Button)this.findViewById(R.id.button);
        bt2 = (Button)this.findViewById(R.id.button2);

        bt.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                Toast.makeText(mContext, "Click Button", Toast.LENGTH_LONG).show();
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(mContext,"Button2", Toast.LENGTH_SHORT).show() ;
            }

        });

    }

}
