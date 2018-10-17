package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    // Within forecast_list_item.xml //////////////////////////////////////////////////////////////
    // Complete (5) Add a layout for an item in the list called forecast_list_item.xml
    // Complete (6) Make the root of the layout a vertical LinearLayout
    // Complete (7) Set the width of the LinearLayout to match_parent and the height to wrap_content

    // Complete (8) Add a TextView with an id @+id/tv_weather_data
    // Complete (9) Set the text size to 22sp
    // Complete (10) Make the width and height wrap_content
    // Complete (11) Give the TextView 16dp of padding

    // Complete (12) Add a View to the layout with a width of match_parent and a height of 1dp
    // Complete (13) Set the background color to #dadada
    // Complete (14) Set the left and right margins to 8dp
    // Within forecast_list_item.xml //////////////////////////////////////////////////////////////


    // Within com.example.android.sunshine.ForecastAdapter.java /////////////////////////////////////////////////////////////////
    // Complete (15) Add a class file called com.example.android.sunshine.ForecastAdapter
    // Complete (22) Extend RecyclerView.Adapter<com.example.android.sunshine.ForecastAdapter.ForecastAdapterViewHolder>

    // Complete (23) Create a private string array called mWeatherData

    // Complete (47) Create the default constructor (we will pass in parameters in a later lesson)

    // Complete (16) Create a class within com.example.android.sunshine.ForecastAdapter called ForecastAdapterViewHolder
    // Complete (17) Extend RecyclerView.ViewHolder

    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
    // Complete (18) Create a public final TextView variable called mWeatherTextView

    // Complete (19) Create a constructor for this class that accepts a View as a parameter
    // Complete (20) Call super(view) within the constructor for ForecastAdapterViewHolder
    // Complete (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
    // Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////


    // Complete (24) Override onCreateViewHolder
    // Complete (25) Within onCreateViewHolder, inflate the list item xml into a view
    // Complete (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // Complete (27) Override onBindViewHolder
    // Complete (28) Set the text of the TextView to the weather for this list item's position

    // Complete (29) Override getItemCount
    // Complete (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // Complete (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // Complete (32) After you save mWeatherData, call notifyDataSetChanged
    // Within com.example.android.sunshine.ForecastAdapter.java /////////////////////////////////////////////////////////////////

    private String[] mWeatherData;

    public ForecastAdapter(){

    }

    public void setmWeatherData(String[] mWeatherData) {
        this.mWeatherData = mWeatherData;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(mWeatherData == null){
            return 0;
        }
        else{
            return mWeatherData.length;
        }
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        String weatherForThisDay = mWeatherData[position];
        holder.mWeatherTextView.setText(weatherForThisDay);
    }

    // Complete (24) Override onCreateViewHolder
    // Complete (25) Within onCreateViewHolder, inflate the list item xml into a view
    // Complete (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // Complete (27) Override onBindViewHolder
    // Complete (28) Set the text of the TextView to the weather for this list item's position

    // Complete (29) Override getItemCount
    // Complete (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // Complete (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // Complete (32) After you save mWeatherData, call notifyDataSetChanged

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view){
            super(view);
            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }
    }
}
