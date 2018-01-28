package com.us_man.airbenders;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.us_man.airbenders.model.Passenger;

import java.util.List;

/**
 * Created by Humza Jaffri on 1/28/2018.
 */

public class PassengerAdapter extends RecyclerView.Adapter<PassengerAdapter.ViewHolder> {

    private List<Passenger> passengerList;
    private Context context;

    public PassengerAdapter(Context context, List<Passenger> passengers) {
        passengerList = passengers;
        this.context = context;
    }

    @Override
    public PassengerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View contactView = layoutInflater.inflate(R.layout.passenger_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PassengerAdapter.ViewHolder holder, int position) {

        Passenger temp = passengerList.get(position);

        TextView textView = holder.textView;
        textView.setText(temp.getFirstName() + " " + temp.getLastName());

        Button button = holder.button;

    }

    @Override
    public int getItemCount() {
        return passengerList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private Button button;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.passenger_name_label);
            button = (Button) itemView.findViewById(R.id.passenger_button);
        }
    }
}
