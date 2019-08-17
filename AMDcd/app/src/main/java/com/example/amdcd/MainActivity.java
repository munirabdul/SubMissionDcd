package com.example.amdcd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMount;
    private List<MountPojo> list;
    private RecyclerView.ItemDecoration decoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.profile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MyProfilActivity.class));
            }
        });

        setMunir();
        setupList();

        loadDataDummy();
    }
    private  void setMunir(){
        rvMount = (RecyclerView) findViewById(R.id.rvMount);

        list = new ArrayList<>();
        decoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
    }

    private void setupList() {
        MountAdapter adapter = new MountAdapter(list);
        rvMount.setLayoutManager(new LinearLayoutManager(this));
        rvMount.addItemDecoration(decoration);
        rvMount.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new MountPojo(
                R.drawable.mahameru,
                "Mount Semeru 3.676 masl",
                "Lumajang-East Java",
                "2019-07-15",
                "https://upload.wikimedia.org/wikipedia/commons/3/38/Mahameru_%22_The_Great_Mountaun%22.jpg",
                "Gunung Semeru atau Gunung Meru adalah sebuah gunung berapi kerucut di Jawa Timur, Indonesia. Gunung Semeru merupakan gunung tertinggi di Pulau Jawa, dengan puncaknya Mahameru, 3.676 meter dari permukaan laut (mdpl). Gunung Semeru juga merupakan gunung berapi tertinggi ketiga di Indonesia setelah Gunung Kerinci di Sumatra dan Gunung Rinjani di Nusa Tenggara Barat[1]. Kawah di puncak Gunung Semeru dikenal dengan nama Jonggring Saloko. Gunung Semeru secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Malang dan Kabupaten Lumajang, Provinsi Jawa Timur.",
                "MOUNT SEMERU 3.676 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.cikuray,
                "Mount Cikuray 2.821 masl",
                "Garut-West Java",
                "2018-11-30",
                "https://upload.wikimedia.org/wikipedia/commons/3/3c/Mount_Cikuray_from_Cisurupan.JPG",
                "Gunung Cikuray atau Cikuraiadalah sebuah gunung bertipe Stratovolcano yang terletak di Dayeuhmanggung, Kabupaten Garut, Jawa Barat, Indonesia. Gunung Cikuray yang mempunyai ketinggian 2.821 meter di atas permukaan laut ini tidak mempunyai kawah aktif dan merupakan gunung tertinggi keempat di Jawa Barat setelah Gunung Ciremai, Gunung Pangrango dan Gunung Gede. Gunung ini berada di perbatasan kecamatan Bayongbong dari sini bisa naik melalui jalur Cilegug atau kampung Jambansari dekat markas HdG Team, Cikajang, Kiara Janggot dan Dayeuhmanggung. Iklim di daerah Gunung Cikuray dan sekitarnya dikategorikan sebagai daerah beriklim tropis basah (humid tropical climate). Curah hujan di sekitar Gunung Cikuray mencapai 3500-4000mm dengan kalkulasi bulan basah 9 bulan dan bulan kering 3 bulan dan juga variasi temperatur dari 10º C hingga 24º C.",
                "MOUNT CIKURAY 2.821 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.ciremai,
                "Mount Ciremai 3.078 masl",
                "Kuningan-West Java",
                "2012-12-20",
                "https://upload.wikimedia.org/wikipedia/commons/8/8b/Ciremai.jpg",
                "Gunung Ceremai (seringkali secara salah kaprah dinamakan \"Ciremai\")adalah gunung berapi kerucut yang secara administratif termasuk dalam wilayah dua kabupaten, yakni Kabupaten Kuningan dan Kabupaten Majalengka, Provinsi Jawa Barat. Posisi geografis puncaknya terletak pada 6° 53' 30\" LS dan 108° 24' 00\" BT, dengan ketinggian 3.078 m di atas permukaan laut. Gunung ini merupakan gunung tertinggi di Jawa Barat. Gunung ini memiliki kawah ganda. Kawah barat yang beradius 400 m terpotong oleh kawah timur yang beradius 600 m. Pada ketinggian sekitar 2.900 m dpl di lereng selatan terdapat bekas titik letusan yang dinamakan Gowa Walet.",
                "MOUNT CIREMAI 3.078 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.gede,
                "Mount Gege Pangrango 2.958 masl",
                "Sukabumi-West Java",
                "2018-10-17",
                "https://upload.wikimedia.org/wikipedia/commons/c/c6/Gunung_Gede_Pangrango%2C_cibodas%2C_bogor%2C_jawa_barat%2C_02032011_01.jpg",
                "Gunung Gede merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas.Litografi tahun 1828 oleh A. J. Bik yang menggambarkan Gunung Gede Gunung Gede diselimuti oleh hutan pegunungan, yang mencakup zona-zona submontana, montana, hingga ke subalpin di sekitar puncaknya. Hutan pegunungan di kawasan ini merupakan salah satu yang paling kaya jenis flora di Indonesia, bahkan di kawasan Malesia.Gunung Gede (Aksara Sunda Baku: ᮌᮥᮔᮥᮀ ᮌᮨᮓᮦ, Gunung Gedé) merupakan sebuah gunung api bertipe stratovolcano yang berada di Pulau Jawa, Indonesia. Gunung Gede berada dalam ruang lingkup Taman Nasional Gede Pangrango, yang merupakan salah satu dari lima taman nasional yang pertama kali diumumkan di Indonesia pada tahun 1980. Gunung ini berada di dua wilayah kabupaten yaitu Kabupaten Cianjur dan Sukabumi, dengan ketinggian 1.000 - 2.958 m. dpl, dan berada pada lintang 106°51' - 107°02' BT dan 64°1' - 65°1 LS. Suhu rata-rata di puncak gunung Gede 18 °C dan di malam hari suhu puncak berkisar 5 °C, dengan curah hujan rata-rata 3.600 mm/tahun. Gerbang utama menuju gunung ini adalah dari Cibodas dan Cipanas.Litografi tahun 1828 oleh A. J. Bik yang menggambarkan Gunung Gede Gunung Gede diselimuti oleh hutan pegunungan, yang mencakup zona-zona submontana, montana, hingga ke subalpin di sekitar puncaknya. Hutan pegunungan di kawasan ini merupakan salah satu yang paling kaya jenis flora di Indonesia, bahkan di kawasan Malesia.",
                "MOUNT GEDE PANGRANGO 2.958 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.bromo,
                "Mount Bromo 2.329 masl",
                "Probolinggo-East Java",
                "2019-07-22",
                "https://upload.wikimedia.org/wikipedia/commons/e/e2/Gunung_Bromo_di_Indonesia.jpg",
                "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
                "MOUNT BROMO 2.329 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.batok,
                "Mount Batok 2.440 masl",
                "Probolinggo-East Java",
                "2019-07-21",
                "https://upload.wikimedia.org/wikipedia/commons/e/e1/Gunung_Batok.jpg",
                "Gunung Batok adalah sebuah gunung yang terletak di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.440 meter di atas permukaan laut dan berada di antara empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Letak Gunung Batok berdekatan dengan Gunung Bromo dan Gunung Semeru. Gunung ini merupakan salah satu gunung mati atau tidak aktif yang terletak di kawasan pegunungan Tengger. Gunung Batok termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
                "MOUNT BATOK 2.440 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.guntur,
                "Mount Guntur 2.294 masl",
                "Garut-West Java",
                "2018-09-10",
                "https://upload.wikimedia.org/wikipedia/commons/c/ca/Gunung_Guntur.jpg",
                "Gunung Guntur adalah sebuah gunung berapi bertipe stratovolcano yang terdapat di Sirnajaya, Tarogong Kaler, Kabupaten Garut, Jawa Barat, dan memiliki ketinggian 2.249 meter dpl. Gunung Guntur pernah menjadi gunung berapi paling aktif di pulau Jawa pada dekade 1800 an. Tapi sejak itu aktivitasnya kembali menurun. Erupsinya pada umumnya disertai dengan lelehan lava, lapili dan objek material lainnya. Erupsi Gunung Guntur yang tercatat adalah pada tahun 1847, 1843, 1841, 1840, 1836, 1834-35, 1833, 1832, 1832, 1829, 1828, 1827, 1825, 1818, 1816, 1815, 1809, 1807, 1803, 1800, 1780, 1777, 1690.",
                "MOUNT GUNTUR 2.294 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.batu,
                "Mount Batu 875 masl",
                ",Bogor-West Java",
                "2018-12-26",
                "https://upload.wikimedia.org/wikipedia/commons/9/90/Gunung_Batu_-_Sukamakmur.jpg",
                "Gunung Batu merupakan sebuah gunung yang terdapat di Desa Sukaharja, Sukamakmur, Bogor, Jawa Barat, Indonesia. Gunung Batu Ini mempunyai ketinggian setinggi 875 Mdpl atau sekitar 2.871 kaki. Banyak Orang mengenal Gunung ini dengan sebutan Gunung Batu Jonggol padahal secara Administratif Gunung ini masuk Dalam kecamatan Sukamakmur lebih tepatnya di Desa Sukaharja, Sukamakmur, Kabupaten Bogor Kesalahan penamaan ini dikarenakan banyak orang belum mengetahui Sukamakmur sebagai Kecamatan karena memang kecamatan ini merupakan pemekaran dari kecamatan Jonggol Di gunung Batu terdapat satwa yang cukup langka di daerah sekitar, sejenis primata berwarna hitam atau umumnya masyarakat Jawa Barat menyebutnya lutung. Terlihat sejumlah kawanan sekitar 5 sampai 10 ekor, primata pemalu ini seperti takut melihat kedatangan para pendaki, sehingga para pendaki jarang sempat mengabadikannya. kondisi cukup memprihatinkan dengan semakin sempitnya lahan untuk mereka mencari makan, di kaki gunung batu terdapat tambang batu yg mungkin suatu saat akan semakin meluas ke atas, juga pembuatan akses jalanan yang melingar di sisi gunung.",
                "MOUNT BATU 875 MASL"
        ));

        list.add(new MountPojo(
                R.drawable.prau,
                "Mount Prau 2.565 masl",
                "Wonosobo-Central Java",
                "2019-06-23",
                "https://upload.wikimedia.org/wikipedia/commons/c/c7/Gunung_Prau%2C_Dieng%2C_Wonosobo%2C_05062017.jpg",
                "Gunung Prahu (terkadang dieja Gunung Prau) (2.565 mdpl) terletak di kawasan Dataran Tinggi Dieng, Jawa Tengah, Indonesia. Gunung Prahu terletak pada koordinat 7°11′13″S 109°55′22″E. Gunung Prahu merupakan tapal batas antara tiga kabupaten yaitu Kabupaten Batang, Kabupaten Kendal dan Kabupaten Wonosobo. Puncak Gunung Prahu merupakan padang rumput luas yang memanjang dari barat ke timur. Bukit-bukit kecil dan sabana dengan sedikit pepohonan dapat kita jumpai di puncak. Gunung Prahu merupakan puncak tertinggi di kawasan Dataran Tinggi Dieng, dengan beberapa puncak yang lebih rendah di sekitarnya, antara lain Gunung Sipandu, Gunung Pangamun-amun, dan Gunung Juranggrawah.",
                "MOUNT PRAU 2.565 MASL"
        ));


        list.add(new MountPojo(
                R.drawable.lembu2,
                "Mount Lembu 792 masl",
                ",Purwakarta-West Java",
                "2018-10-02",
                "https://upload.wikimedia.org/wikipedia/commons/d/d9/Jati_Luhur_Viewed_fom_Parang_Mountain.jpg",
                "Gunung Lembu adalah gunung yang terletak di Kabupaten Purwakarta, Provinsi Jawa Barat, Indonesia. Gunung Lembu yang terletak di dekat Waduk Jatiluhur dengan ketinggian puncak 780 Mdpl ini merupakan sebongkah batu raksasa (monolit). Secara administratif termasuk ke dalam wilayah Desa Panyindangan, Kecamatan Sukatani. Meskipun tidak terlalu tinggi untuk ukuran gunung, namun medan yang dilalui untuk mencapai puncaknya terkenal cukup sulit untuk di daki terutama saat sedang terjadi hujan. Perizinan mendaki Gunung Lembu dilakukan di Kampung Panunggal, Desa Panyindangan[1]. Diselatan Gunung Lembu terdapat Gunung Parang (800 Mdpl) dan Gunung Bongkok (975 Mdpl). Namun Gunung Lembu lebih terkanal karena dari puncaknya bisa melihat panorama alam berupa perbukitan berpadu dengan luasnya Waduk Jatiluhur yang indah.",
                "MOUNT LEMBU 792 MASL"
        ));


    }
}
