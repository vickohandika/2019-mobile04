package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    EditText inputName;
    TextView outputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        inputName = findViewById(R.id.input_name);
        outputName = findViewById(R.id.text_output);
    }

    public void submitOutput(View view) {
        String nama = inputName.getText().toString();
        outputName.setText("hello " +nama+ " Congratulations");
    }
}
