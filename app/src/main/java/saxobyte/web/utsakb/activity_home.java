package saxobyte.web.utsakb;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Tanggal Pengerjaan : 12/05/2020
 * NIM : 10117254
 * Nama : Richard Yulio Halim
 * Kelas : IF - 8
 */

public class activity_home extends AppCompatActivity {
    Toolbar mToolbar;
    ViewPager mViewPager;
    TabLayout mTabLayout;
    TabPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setSubtitle("Created by: Richard");
        mViewPager = findViewById(R.id.main_viewpager);
        mAdapter = new TabPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mTabLayout = findViewById(R.id.main_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void OpenGmail (View view){
        String url = "mailto:richard.halim99@gmail.com";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }

    public void OpenWhatsapp (View view){
        String url = "https://api.whatsapp.com/send?phone=628239227339";
        Intent bukaWhatsapp = new Intent(Intent.ACTION_VIEW);
        bukaWhatsapp.setData(Uri.parse(url));
        startActivity(bukaWhatsapp);
    }

    public void OpenInstagram (View view){
        String url = "https://www.instagram.com/richardyulio26/";
        Intent bukaInstagram = new Intent(Intent.ACTION_VIEW);
        bukaInstagram.setData(Uri.parse(url));
        startActivity(bukaInstagram);
    }

    public void OpenFacebook (View view){
        String url = "https://m.facebook.com/richard.yulio.halim";
        Intent bukaGmail = new Intent(Intent.ACTION_VIEW);
        bukaGmail.setData(Uri.parse(url));
        startActivity(bukaGmail);
    }
}
