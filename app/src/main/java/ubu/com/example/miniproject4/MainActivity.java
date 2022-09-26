package ubu.com.example.miniproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button bAddFriend,bShowImages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bAddFriend = findViewById(R.id.bAddFriend);
        bAddFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAddFriend();
            }
        });

        bShowImages = findViewById(R.id.bShowFriends);
        bShowImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFriends();
            }
        });
    }
    private  void  showAddFriend(){
        Intent intent = new Intent(MainActivity.this,AddFriend.class);
        MainActivity.this.startActivity(intent);
    }
    private  void showFriends(){
        Intent intent = new Intent(MainActivity.this,ShowFrieds.class);
        MainActivity.this.startActivity(intent);
    }
}