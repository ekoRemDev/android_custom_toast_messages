package dev.jibeshi.com.toastmessages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSimpleToast, btnCustomToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btnSimpleToast = (Button)findViewById(R.id.btnSimpleToastMessage);
        btnSimpleToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "This is a Simple Toast Message", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
            }
        });


        btnCustomToast = (Button)findViewById(R.id.btnCustomToastMessage);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Custom Layout
                View layout = getLayoutInflater().inflate(R.layout.toast_layout,
                        (ViewGroup) findViewById(R.id.toast_layout_root));
                // Fill in the message into the textView
                TextView text = (TextView) layout.findViewById(R.id.text);
                String message = "This is a Custom Message";
                text.setText(message);
                // Construct the toast, set the view and display
                Toast toast = Toast.makeText(getApplicationContext(), "some message", Toast.LENGTH_SHORT);
                // Set the view
                // layout
                toast.setView(layout);
                toast.show();
            }
        });



        
    }
}
