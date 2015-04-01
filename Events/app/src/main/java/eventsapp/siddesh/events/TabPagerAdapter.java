package eventsapp.siddesh.events;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
/**
 * Created by Siddesh on 3/23/2015.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                //Fragement for AllEvents Tab
                return new AllEvents();
            case 1:
                //Fragment for Popular Tab
                return new Popular();
            case 2:
                //Fragment for Genre Tab
                return new Genre();
        }
        return null;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }
}
