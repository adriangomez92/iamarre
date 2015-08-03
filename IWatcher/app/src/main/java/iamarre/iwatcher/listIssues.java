package iamarre.iwatcher;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class listIssues extends android.support.v4.app.Fragment {


    public listIssues() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_list_issues, container, false);


        ListView li = (ListView) rootView.findViewById(R.id.listissues);


        ArrayList<Map<String, String>> list = buildData();
        String[] from = { "name", "purpose" };
        int[] to = { android.R.id.text1, android.R.id.text2 };

        SimpleAdapter adapter = new SimpleAdapter(this.getActivity(), list,
                android.R.layout.simple_expandable_list_item_2, from, to);
        li.setAdapter(adapter);


        return rootView;



    }
    private ArrayList<Map<String, String>> buildData() {
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list.add(putData("Robo de embarcación", "Prioridad muy alta"));
        list.add(putData("Fuga de agua en la torreta 19", "Prioridad muy alta"));
        list.add(putData("Fuga de combustible en la gasolinera", "Prioridad muy alta"));
        list.add(putData("No funciona lector de tarjetas", "Prioridad alta"));
        list.add(putData("No hay electricidad en el muelle 1", "Prioridad alta"));
        list.add(putData("Objetos en medio del amarre", "Prioridad media"));
        list.add(putData("Torreta doblada", "Prioridad media"));
        list.add(putData("Basura sin recoger en el muelle", "Prioridad baja"));

        return list;
    }
    private HashMap<String, String> putData(String name, String purpose) {
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("name", name);
        item.put("purpose", purpose);
        return item;
    }




}
