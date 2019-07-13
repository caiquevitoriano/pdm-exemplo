package ifpb.ag.app1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Box1 extends LinearLayout {
    private final String name;
    private TextView tv;
    private EditText et;


    private void init(){
        LayoutParams p = new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT
        );
        setLayoutParams(p);
        setOrientation(LinearLayout.VERTICAL);
        //label
        tv = new TextView(getContext());
        tv.setText(name);
        addView(tv);
        //input
        et = new EditText(getContext());
        addView(et);

    }

    public Box1(Context ctx, String name){
        super(ctx);
        this.name = name;
        init();
    }

    public String getValue(){
        return et.getText().toString();
    }


}
