package sg.edu.np.Practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User example = new User("John", "Test", 1, false);

        String name = example.getName();
        String description = example.getDescription();
        int id = example.getId();
        Button followbutton = (Button) findViewById(R.id.button3);
        followbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean followed = example.getFollowed();
                if (followed == false) {
                    example.setFollowed(true);
                    followbutton.setText("Follow");
                }

                else if (followed == true) {
                    example.setFollowed(false);
                    followbutton.setText("Unfollow");
                }
            }
        });
    }
}