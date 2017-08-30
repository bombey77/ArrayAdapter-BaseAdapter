package bombey77.motovilov.com.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ромашка on 28.08.2017.
 */

public class PhoneModelAdapter extends BaseAdapter {

    List<PhoneModel> list;
    LayoutInflater layoutInflater;

    PhoneModelAdapter(Context context, List<PhoneModel> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View myView = view;
        if (myView == null) {
            myView = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);
        }
        PhoneModel model = getModel(i);

        ((TextView) myView.findViewById(R.id.textView)).setText(model.name);
        return myView;
    }

    private PhoneModel getModel(int i) {
        return (PhoneModel) getItem(i);
    }
}
