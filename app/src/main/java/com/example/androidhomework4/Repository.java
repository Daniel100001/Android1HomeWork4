package com.example.androidhomework4;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private List<DataModel> modelList = new ArrayList<>();

    public List<DataModel> getModelList(){

        modelList.add(new DataModel("Закат в пустыне", R.drawable.ponchik));
        modelList.add(new DataModel("Закат летом", R.drawable.summer_sunset));
        modelList.add(new DataModel("Закат", R.drawable.sunset));
        modelList.add(new DataModel("Закат в море", R.drawable.sunset_at_sea));

        modelList.add(new DataModel("Закат в пустыне", R.drawable.ponchik));
        modelList.add(new DataModel("Закат летом", R.drawable.summer_sunset));
        modelList.add(new DataModel("Закат", R.drawable.sunset));
        modelList.add(new DataModel("Закат в море", R.drawable.sunset_at_sea));

        modelList.add(new DataModel("Закат в пустыне", R.drawable.ponchik));
        modelList.add(new DataModel("Закат летом", R.drawable.summer_sunset));
        modelList.add(new DataModel("Закат", R.drawable.sunset));
        modelList.add(new DataModel("Закат в море", R.drawable.sunset_at_sea));


        return modelList;
    }
}
