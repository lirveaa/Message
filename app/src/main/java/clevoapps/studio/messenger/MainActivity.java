package clevoapps.studio.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Call onSendMessage() when button is clicked
    public void onSendMessage(View view){
        EditText editMsg = (EditText)findViewById(R.id.message);
        String msgText = editMsg.getText().toString();
//        Intent intent = new Intent(this, RecieveMsgActivity.class);
//        intent.putExtra(RecieveMsgActivity.EXTRA_MESSAGE, msgText);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, msgText);

        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);

//        startActivity(intent);
    }
}