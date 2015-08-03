package iamarre.iwatcher;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import iamarre.iwatcher.model.amarre;


public class ListMooring extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
   /* private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    ListView list;

    public DrawerLayout drawer;
    private LinearLayout linear;
    Button btn;

    HashMap<String, List<String>> listDataChild;
    List<String> listDataHeader;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ListMooring() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        //expListView=(ExpandableListView)getView().findViewById(R.id.lvExp);

        expListView = (ExpandableListView)getView().findViewById(R.id.lvExp);

        drawer = (DrawerLayout)getView().findViewById(R.id.drawer_layout);
        //list=(ListView)findViewById(R.id.list);
        prepareListData();

        listAdapter = new ExpandableListAdapter(this.getActivity(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                //difjifdj
                return true;
            }
        });
        return inflater.inflate(R.layout.fragment_list_mooring, container, false);
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Top 250");
        listDataHeader.add("Now Showing");
        listDataHeader.add("Coming Soon..");

        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The Shawshank Redemption");
        top250.add("The Godfather");
        top250.add("The Godfather: Part II");
        top250.add("Pulp Fiction");
        top250.add("The Good, the Bad and the Ugly");
        top250.add("The Dark Knight");
        top250.add("12 Angry Men");

        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The Conjuring");
        nowShowing.add("Despicable Me 2");
        nowShowing.add("Turbo");
        nowShowing.add("Grown Ups 2");
        nowShowing.add("Red 2");
        nowShowing.add("The Wolverine");

        List<String> comingSoon = new ArrayList<String>();
        comingSoon.add("2 Guns");
        comingSoon.add("The Smurfs 2");
        comingSoon.add("The Spectacular Now");
        comingSoon.add("The Canyons");
        comingSoon.add("Europa Report");

        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1),nowShowing);
        listDataChild.put(listDataHeader.get(2), comingSoon);
    }*/
    SparseArray<amarre> groups = new SparseArray<amarre>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_list_mooring, container, false);
        ListView li = (ListView) rootView.findViewById(R.id.listwissues);
        String[] values = new String[] { "A-1     Glorieta X         7º-TA-2-010-12", "A-2     Marianan V      6º-TA-2-010-10", "A-3     Estefania         5º-TA-2-011-12",
                "A-4     Colorín             6º-TA-2-010-13", "A-5     Nostalgia         7º-TA-2-010-11", "A-6     Emanuel          7º-TA-2-010-12", "A-7     Rafiña Go         7º-TA-2-010-12", "A-8     Glorieta V         4º-TA-2-010-12",
                "A-9     Jesulín              7º-TA-2-010-12", "A-10    Sofieta V         7º-TA-2-010-12" };
        //getActivity().setListAdapter(adapter);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.group, R.id.textView1, values);
        li.setAdapter(adapter);
       // ArrayList<Acuerdo> listaAcuerdos;




        return rootView;
    }




}



