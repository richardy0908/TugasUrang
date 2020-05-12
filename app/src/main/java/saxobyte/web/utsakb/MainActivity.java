package saxobyte.web.utsakb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Tanggal Pengerjaan : 12/05/2020
 * NIM : 10117254
 * Nama : Richard Yulio Halim
 * Kelas : IF - 8
 */
public class MainActivity extends AppCompatActivity {

    private int waktu_loading=3000;

    //3000=3 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //setelah loading maka akan langsung berpindah ke home activity

                Intent home=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
