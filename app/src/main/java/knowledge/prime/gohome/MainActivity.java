package knowledge.prime.gohome;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);

        intent.setType("text/plain");
        intent.setData(Uri.parse("mailto:xxx@xxx"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Re:");
        intent.putExtra(Intent.EXTRA_TEXT, "とうちんそろそろかえるよ");

        startActivity(intent);


        this.finish();

    }
}
