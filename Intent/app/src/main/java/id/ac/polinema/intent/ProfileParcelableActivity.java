package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileParcelableActivity extends AppCompatActivity {

    public static final String USER_KEY = "username,name,age";
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getParcelableExtra(USER_KEY);
        if (extras != null) {

            String username = extras.getUsername();
            usernameText.setText(username);
            String name = extras.getName();
            nameText.setText(name);
            String age = String.valueOf(extras.getAge());
            ageText.setText(age);
        }
    }
}
