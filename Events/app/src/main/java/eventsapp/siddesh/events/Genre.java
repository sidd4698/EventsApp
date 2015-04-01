package eventsapp.siddesh.events;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by Siddesh on 3/23/2015.
 */
public class Genre extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View genre = inflater.inflate(R.layout.genre, container, false);
        ((TextView)genre.findViewById(R.id.textView)).setText("Genre");
        return genre;
    }
}
