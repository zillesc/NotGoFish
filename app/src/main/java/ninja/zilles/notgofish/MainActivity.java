package ninja.zilles.notgofish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    private int currentClass = 126;
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (TextView) findViewById(R.id.hello_message);
        renderWelcomeMessage();

        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();

        final Button pressMeButton = (Button) findViewById(R.id.button);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentClass ++;
                renderWelcomeMessage();
                Toast.makeText(v.getContext(), "I AM A TOAST!", Toast.LENGTH_LONG).show();
            }
        });
    }

//    public void onClick(View v) {
//        currentClass ++;
//        renderWelcomeMessage();
//        Toast.makeText(v.getContext(), "I AM A TOAST!", Toast.LENGTH_LONG).show();
//    }

    private void renderWelcomeMessage() {
        welcome.setText(MessageFormat.format(getString(R.string.hello_message), currentClass));
    }
}
