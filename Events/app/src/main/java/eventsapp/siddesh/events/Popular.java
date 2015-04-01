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
public class Popular extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View popular = inflater.inflate(R.layout.popular, container, false);
        ((TextView)popular.findViewById(R.id.textView)).setText("Popular");
        return popular;
    }
}
