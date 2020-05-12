package saxobyte.web.utsakb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Tanggal Pengerjaan : 12/05/2020
 * NIM : 10117254
 * Nama : Richard Yulio Halim
 * Kelas : IF - 8
 */
public class TabPageAdapter extends FragmentPagerAdapter {

    public static int PAGE_COUNT = 3;

    private String judulTab[] = new String[] { "Profil", "Kontak Saya", "Daftar Teman",};

    public TabPageAdapter(FragmentManager fm) { super(fm);}

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SatuFragment();
            case 1:
                return new DuaFragment();
            case 2:
                return new TigaFragment();
        }
        return null;
    }

    @Override
    public int getCount() { return PAGE_COUNT; }

    @Override
    public CharSequence getPageTitle(int position) {
        return judulTab[position];
    }
}
