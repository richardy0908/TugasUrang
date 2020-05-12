package saxobyte.web.utsakb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Tanggal Pengerjaan : 12/05/2020
 * NIM : 10117254
 * Nama : Richard Yulio Halim
 * Kelas : IF - 8
 */

public class SatuFragment extends Fragment {

    public SatuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFrag1 = inflater.inflate(R.layout.fragment_satu, container, false);
        ImageView image = (ImageView)viewFrag1.findViewById(R.id.image);
        image.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.richard, null));
        return viewFrag1;
            }







}
