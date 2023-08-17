package sg.edu.rp.c346.id22035777.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WeatherAdapter extends ArrayAdapter<Weather> {
    private Context context;
    private ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        super(context, 0, weatherList);
        this.context = context;
        this.weatherList = weatherList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_2, parent, false);
        }

        Weather weather = weatherList.get(position);

        TextView areaTextView = convertView.findViewById(android.R.id.text1);
        TextView forecastTextView = convertView.findViewById(android.R.id.text2);

        areaTextView.setText(weather.getArea());
        forecastTextView.setText(weather.getForecast());

        return convertView;
    }
}

