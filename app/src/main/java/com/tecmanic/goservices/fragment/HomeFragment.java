package com.tecmanic.goservices.fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import com.tecmanic.LinkOpenActivity;
import com.tecmanic.goservices.Adapter.HomeAdapter3;
import com.tecmanic.goservices.Adapter.RoundSliderAdapter;
import com.tecmanic.goservices.Adapter.SliderHomeAdapter;
import com.tecmanic.goservices.DoorStepScreen;
import com.tecmanic.goservices.FemaleSaloon;
import com.tecmanic.goservices.HomePageActivity;
import com.tecmanic.goservices.MaleSallon;
import com.tecmanic.goservices.ModelClass.Home3bean;
import com.tecmanic.goservices.ModelClass.RoundSlider;
import com.tecmanic.goservices.ModelClass.Slider1;
import com.tecmanic.goservices.R;
import com.tecmanic.goservices.ServiceInternal.CategoryScreen1;


public class HomeFragment extends Fragment {
    RecyclerView rv, rv1, rv2;
    SliderHomeAdapter adapter;
    ArrayList<Slider1> slider1s;
    ArrayList<RoundSlider> roundSliders;
    RoundSliderAdapter adapter1;
    ArrayList<Home3bean> home3beans;
    HomeAdapter3 adapter3;
    TextView all, male, female, withdraw, filter, toprated, luxury, preaum;
    ViewFlipper flipper;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        all = v.findViewById(R.id.all);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomePageActivity.class);
                startActivity(intent);
                getActivity().finish();

            }

        });

        male = v.findViewById(R.id.male);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MaleSallon.class);
                startActivity(intent);

            }

        });

        female = v.findViewById(R.id.female);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), FemaleSaloon.class);
                startActivity(intent);

            }

        });

        withdraw = v.findViewById(R.id.withdraw);
        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CategoryScreen1.class);
                startActivity(intent);
                ///PopupMenu popupMenu = new PopupMenu(getContext(), v);
                //Menu menu1 = popupMenu.getMenu();
                //menu1.add("Mens");
               // menu1.add("Woman");
               // menu1.add("Unisex");
               // popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                   // @Override
                   // public boolean onMenuItemClick(MenuItem item) {

                       // String title = item.getTitle().toString();
                        //if (title.equals("Mens")) {
                            //Intent intent = new Intent(getActivity(), MaleSallon.class);
                            //startActivity(intent);
                        //} else if (title.equals("Woman")) {
                            //Intent intent = new Intent(getActivity(), FemaleSaloon.class);
                            //startActivity(intent);
                       // } else if (title.equals("Unisex")) {
                            //Intent intent = new Intent(getActivity(), Withdraw.class);
                            //startActivity(intent);

                       // }

                       // return false;

                    //}

               // });

                //popupMenu.show();

            }

        });

        filter = v.findViewById(R.id.filter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();
                PopupMenu menu = new PopupMenu(getContext(), filter);
                menu.getMenuInflater().inflate(R.menu.popmenufilter, menu.getMenu()
                );
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int itemId = item.getItemId();
                        if (itemId == R.id.name) {
                            Toast.makeText(getActivity(), "search by name", Toast.LENGTH_SHORT).show();
                        } else if (itemId == R.id.price) {
                            Toast.makeText(getActivity(), "search by price ", Toast.LENGTH_SHORT).show();
                        } else if (itemId == R.id.location) {
                            Toast.makeText(getActivity(), "search by location", Toast.LENGTH_SHORT).show();
                        }


                        return false;
                    }
                });

                menu.show();


            }
        });


        toprated = v.findViewById(R.id.toprated);
        toprated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "linked with user review", Toast.LENGTH_SHORT).show();
            }
        });

        luxury = v.findViewById(R.id.luxury);
        luxury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "linked with admin", Toast.LENGTH_SHORT).show();

            }
        });

        preaum = v.findViewById(R.id.preaum);
        preaum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getActivity(), DoorStepScreen.class);
                startActivity(intent);
               // PopupMenu popupMenu = new PopupMenu(getContext(), v);
              //  Menu menu1 = popupMenu.getMenu();
              //  menu1.add("Men's");
              //  menu1.add("Women's");
               // menu1.add("Unisex");
               // popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                   // @Override
                    //public boolean onMenuItemClick(MenuItem item) {
                    //    String title = item.getTitle().toString();
                      //  if (title.equals("Men's")) {
                           // Intent intent = new Intent(getActivity(), MaleSallon.class);
                           // startActivity(intent);
                       // } else if (title.equals("Women's")) {
                           // Intent intent = new Intent(getActivity(), FemaleSaloon.class);
                           // startActivity(intent);
                       // } else if (title.equals("Unisex")) {
                          //  Intent intent = new Intent(getActivity(), Withdraw.class);
                            //startActivity(intent);
                       // }
                        //return false;

                    //}


               // });
               // popupMenu.show();


            }
        });

        //  rv=v.findViewById(R.id.rv);
        //  rv1=v.findViewById(R.id.rv1);
        rv2 = v.findViewById(R.id.rv2);

        // slider1s= new ArrayList<>();
        //     slider1s.add(new Slider1("Male seloon"));
        // slider1s.add(new Slider1("Withdraw"));
        //   slider1s.add(new Slider1("cashback"));
        //   slider1s.add(new Slider1("Woman seloon"));
        //   slider1s.add(new Slider1("Top"));
        //   rv.setAdapter(adapter);
        //     rv.setHasFixedSize(true);
        //     rv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        //    SnapHelper snapHelper = new PagerSnapHelper();
        // snapHelper.attachToRecyclerView(rv);

        // adapter =new SliderHomeAdapter(getActivity(),slider1s);
        //  rv.setAdapter(adapter);
        // LinearLayoutManager manager = new GridLayoutManager(getActivity(),4);
        //   rv.setLayoutManager(manager);


        //roundSliders=new ArrayList<>();
        // roundSliders.add(new RoundSlider("filter"));
        // roundSliders.add(new RoundSlider("Luxury"));
        // roundSliders.add(new RoundSlider("Primium"));
        // roundSliders.add(new RoundSlider("Basic"));
        //adapter1= new RoundSliderAdapter(getActivity(),roundSliders);
        //rv1.setAdapter(adapter1);
        //  LinearLayoutManager manager1= new GridLayoutManager(getActivity(),4);
        //  rv1.setLayoutManager(manager1);
        home3beans = new ArrayList<>();
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        home3beans.add(new Home3bean("Himanshu", "Salon"));
        adapter3 = new HomeAdapter3(getActivity(), home3beans);
        rv2.setAdapter(adapter3);
        LinearLayoutManager manager2 = new LinearLayoutManager(getActivity());
        rv2.setLayoutManager(manager2);
        //   rv.setHasFixedSize(true);
        // rv.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        //SnapHelper snapHelper = new PagerSnapHelper();
        //snapHelper.attachToRecyclerView(rv)
        flipper = v.findViewById(R.id.flipper);
        flipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LinkOpenActivity.class);
                startActivity(intent);








            }


        });

        int iamgearr[] = {R.drawable.apploco, R.drawable.beardlook, R.drawable.offermy};
        for (int i = 0; i < iamgearr.length; i++) {

            showImage(iamgearr[i]);
        }

        return v;


    }

    public void showImage(int imagearr) {
        ImageView image = new ImageView(getActivity());
        image.setBackgroundResource(imagearr);
        flipper.addView(image);
        flipper.setFlipInterval(3000);
        flipper.setAutoStart(true);
        flipper.setInAnimation(getContext(), android.R.anim.slide_in_left);
        flipper.setOutAnimation(getContext(), android.R.anim.slide_out_right);

    }


}

