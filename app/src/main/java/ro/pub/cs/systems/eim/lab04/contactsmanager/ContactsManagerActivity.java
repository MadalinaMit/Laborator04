package ro.pub.cs.systems.eim.lab04.contactsmanager;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactsManagerActivity extends AppCompatActivity {

    Button showAdditionalDetails, save, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_manager);

        showAdditionalDetails = (Button) findViewById(R.id.button);
        save = (Button) findViewById(R.id.button3);
        cancel = (Button) findViewById(R.id.button4);

        showAdditionalDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(showAdditionalDetails.getText().equals("Show Additional Fields")) {
                    showAdditionalDetails.setText("Hide Additional Fields");
                }
            }
        });

        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);
    }
}
