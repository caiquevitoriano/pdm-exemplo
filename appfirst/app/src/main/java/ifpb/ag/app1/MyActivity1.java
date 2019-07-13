package ifpb.ag.app1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import ifpb.ag.app.R;

public class MyActivity1 extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);
        //
        Log.d("AGDEBUG", "cade tu?");
        //
        LinearLayout root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
     //   root.setBackgroundColor(Color.RED);
        root.setOrientation(LinearLayout.VERTICAL);
        setContentView(root);

        ImageView img = new ImageView(this);
        img.setImageResource(R.drawable.user);
        root.addView(img);




        Box1 box1 = new Box1(this, "Nome");
        root.addView(box1);
        Box1 box2 = new Box1(this, "Senha");
        root.addView(box2);

        Button btn = new Button(this);
        btn.setText("botão");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyActivity1.this, R.string.welcome_message, Toast.LENGTH_LONG).show();

            }
        });


        root.addView(btn);




    }
}
