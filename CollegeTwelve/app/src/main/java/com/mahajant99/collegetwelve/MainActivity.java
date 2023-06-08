package com.mahajant99.collegetwelve;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Spinner sp1, sp2, sp3, sp4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        sp1=findViewById(R.id.sp1);
        sp2=findViewById(R.id.sp2);
        sp3=findViewById(R.id.sp3);
        sp4=findViewById(R.id.sp4);

        String country[]={"India","Nepal","China"};

        ArrayAdapter<String> aa = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_spinner_item,
                country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(aa);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String ss = sp1.getSelectedItem().toString();
                ArrayAdapter<String> a11=null;
                String in[]={"Delhi","Maharashtra","Rajasthan"};
                String np[]={"Bagmati","Gandaki","Madhesh"};
                String ch[] = {"Henan", "Sichuan", "Hebai"};

                if(ss.equals("India")){
                    a11=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,in);
                }if(ss.equals("Nepal")){
                    a11=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,np);
                }if(ss.equals("China")){
                    a11=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ch);
                }

                a11.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp2.setAdapter(a11);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s1 = sp2.getSelectedItem().toString();
                ArrayAdapter<String> a12=null;
                String dl[]={"Delhi"};
                String mh[]={"Pune","Mumbai","Nagpur"};
                String rj[]={"Jodhpur","Jaipur","Udaipur"};

                String bg[]={"Kathmandu","Lalitpur","Bharatpur"};
                String gd[]={"Pokhara","Chapakot","Sarangkot"};
                String md[]={"Janakpur","Birgunj","Balawa"};

                String hen[] = {"Nanyang", "Luoyang", "Sanmenxia"};
                String sic[] = {"Leshan", "Chengdu", "Yaan"};
                String heb[] = {"Baoding", "Xingtai", "Langfang"};


                if(s1.equals("Delhi")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,dl);
                }if(s1.equals("Maharashtra")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,mh);
                }if(s1.equals("Rajasthan")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,rj);
                }if(s1.equals("Bagmati")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,bg);
                }if(s1.equals("Gandaki")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,gd);
                }if(s1.equals("Madhesh")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,md);
                }if(s1.equals("Henan")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,hen);
                }if(s1.equals("Sichuan")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,sic);
                }if(s1.equals("Hebai")){
                    a12=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,heb);
                }

                a12.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp3.setAdapter(a12);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String s2 = sp3.getSelectedItem().toString();
                ArrayAdapter<String> a13=null;

                String d[]={"Govind Puri", "Kalka Ji", "Saket"};

                String pn[]={"Model Colony", "Kodhrod", "Aundh"};
                String mun[]={"Bandra", "Andheri", "Powai"};
                String ng[]={"Bank Colony","Kachimet","Kalameshwar"};

                String jd[]={"Sardar Pura","Shaastri Nagar","Circuit House"};
                String ja[]={"Vaishali Nagar","Kalwar Road","Jagat Pura"};
                String ud[]={"Sarada","Bhinder","Jhadol"};

                String kha[] = {"Thamel", "Lazimpat", "Boudha"};
                String lal[] = {"DevGarh Hill", "MardanSingh Fort", "Mahavir Wildlife Santury"};
                String bha[] = {"Durbar Square", "55 Windows Palace", "Taumadhi Square"};

                String po[] = {"Devi's Fall", "Phewa Lake", "Sarankot"};
                String go[] = {"Manasalu", "Laprak", "Manakamana Temple"};
                String cha[] = {"Circuit Treck", "Himal Treck", "Tilicho Lake"};

                String jan[] = {"Kamalamai", "Bhimeshwor", "Dhalkebar"};
                String bir[] = {"Thrill Factory", "Ghadiarwa Pokhari", "Shree Gahawamai Temple"};
                String gau[] = {"Janki Temple", "Kesariya Stupa", "Janaki Temple"};

                String na [] = {"Spring Temple Buddha", "Shiren Mountain Mountain", "Tongbai Mountain"};
                String lu [] = {"Longmen Grottoes", "White House Temple", "Shaolin Temple"};
                String sa [] = {"Huanghe Forest Park", "Swan Lake", "The Yellow River"};

                String le[]={"Leshan Giant Buddha", "Jinding Mountain", "Baoguo Temple"};
                String ch1[] = {"Wenshu Yuan Monastery", "Leshan Giant Buddha", "Anshun Bridge"};
                String ya[]={"Bifeng Valley", "Anshun Ground", "Wawu Mountain"};

                String bo[] = {"Baishi Mountain","Langya Mountain","Tailing"};
                String xi[] = {"Taihang Shan","Qilihe Sports Park","Kongshan White Cloud Cave"};
                String ln[] = {"Shengfang Ancient Town", "Yanjiao Park", "langfang stadium"};


                if(s2.equals("Delhi")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,d);
                }if(s2.equals("Pune")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,pn);
                }if(s2.equals("Mumbai")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,mun);
                }if(s2.equals("Nagpur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ng);
                }if(s2.equals("Jodhpur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,jd);
                }if(s2.equals("Jaipur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ja);
                }if(s2.equals("Udaipur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ud);
                }if(s2.equals("Kathmandu")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,kha);
                }if(s2.equals("Lalitpur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,lal);
                }if(s2.equals("Bharatpur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,bha);
                }if(s2.equals("Pokhara")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,po);
                }if(s2.equals("Chapakot")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,cha);
                }if(s2.equals("Sarangkot")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,go);
                }if(s2.equals("Janakpur")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,jan);
                }if(s2.equals("Birgunj")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,bir);
                }if(s2.equals("Balawa")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,gau);
                }if(s2.equals("Nanyang")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,na);
                }if(s2.equals("Luoyang")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,lu);
                }if(s2.equals("Sanmenxia")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,sa);
                }if(s2.equals("Leshan")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,le);
                }if(s2.equals("Chengdu")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ch1);
                }if(s2.equals("Yaan")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ya);
                }if(s2.equals("Baoding")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,bo);
                }if(s2.equals("Xingtai")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,xi);
                }if(s2.equals("Langfang")){
                    a13=new ArrayAdapter<String>(
                            getApplicationContext(),
                            android.R.layout.simple_spinner_item,ln);
                }

                a13.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp4.setAdapter(a13);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext()
                        ,"Country: "+sp1.getSelectedItem().toString() +
                                ", State: "+sp2.getSelectedItem().toString() +
                                ", City: "+sp3.getSelectedItem().toString() +
                                ", Area: "+sp4.getSelectedItem().toString(),
                        Toast.LENGTH_SHORT).show();

            }
        });


    }
}