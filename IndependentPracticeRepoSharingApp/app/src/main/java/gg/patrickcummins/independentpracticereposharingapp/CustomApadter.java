package gg.patrickcummins.independentpracticereposharingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by patrickcummins on 7/25/16.
 */
public class CustomApadter extends BaseAdapter{

    ArrayList<Actor> actorArrayList;
    Context context;

    public CustomApadter(ArrayList<Actor> actorArrayList, Context context) {
        this.actorArrayList = actorArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return actorArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return actorArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.actors_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Actor currentActor =actorArrayList.get(position);

        viewHolder.actorNameTextView.setText("Name: " + currentActor.getName());
        viewHolder.actorDobTextView.setText("DOB: " + currentActor.getDob());
        viewHolder.oscarsWonTextView.setText("Oscars Won: " + currentActor.getOscarsWon());







        return convertView;
    }

    private class ViewHolder{
        TextView actorNameTextView, actorDobTextView, oscarsWonTextView;
        public ViewHolder (View itemLayout){
            this.actorNameTextView = (TextView) itemLayout.findViewById(R.id.actorName);
            this.actorDobTextView = (TextView) itemLayout.findViewById(R.id.actorDob);
            this.oscarsWonTextView = (TextView) itemLayout.findViewById(R.id.oscars);
        }
    }
}
