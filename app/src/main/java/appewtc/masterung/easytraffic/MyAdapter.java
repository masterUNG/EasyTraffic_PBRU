package appewtc.masterung.easytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by masterUNG on 8/18/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        

        return null;
    }   // getView
}   // Main Class